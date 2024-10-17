import module10.FileTest;
import module10.GsonMake;
import module10.NumValidator;
import module10.WordFrequency;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        // __________________________________________________________________
        // Module 9
        // __________________________________________________________________
//        MyArrayList<String> myArrayLists = new MyArrayList();
//        myArrayLists.add("первый");
//        System.out.println("myArrayLists size = " + myArrayLists.size());
//        myArrayLists.add("второй");
//        System.out.println("myArrayLists size = " + myArrayLists.size());
//        myArrayLists.add("третий");
//        System.out.println("Элемент под номером 2 = " + myArrayLists.get(2));
//        System.out.println("myArrayLists size = " + myArrayLists.size());
//        myArrayLists.remove(1);
//        System.out.println("myArrayLists size = " + myArrayLists.size());
//        myArrayLists.clear();
//        System.out.println("myArrayLists size = " + myArrayLists.size());
//        System.out.println("Test MyArrayList completed");
//        System.out.println("___________________________");
//        // __________________________________________________________________
//        MyQueue<String> myQueus = new MyQueue<>();
//        myQueus.add("La-la-la");
//        myQueus.add("получилось");
//        System.out.println(myQueus.peek());
//        System.out.println(myQueus.pool());
//        System.out.println(myQueus.pool());
//        System.out.println("Test MyQueue completed");
//        System.out.println("___________________________");
//        // __________________________________________________________________
//        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
//        myLinkedList.add("Go");
//        System.out.println("myLinkedList.size() = " + myLinkedList.size());
//        myLinkedList.add("Go2");
//        System.out.println("myLinkedList.size() = " + myLinkedList.size());
//        myLinkedList.add("Go3");
//        System.out.println("myLinkedList.size() = " + myLinkedList.size());
//        System.out.println(myLinkedList.get(1));
//        myLinkedList.remove(0);
//        System.out.println("myLinkedList.size() = " + myLinkedList.size());
//        myLinkedList.clear();
//        System.out.println("myLinkedList.size() = " + myLinkedList.size());
//        System.out.println("Test MyLinkedList completed");
//        System.out.println("___________________________");
//        // __________________________________________________________________
//        MyHashMap<Integer, String> map = new MyHashMap<>();
//        map.put(22, "First");
//        System.out.println(map.size());
//        map.put(2, "Second");
//        System.out.println(map.size());
////        map.put(22,"First2");
//        System.out.println(map.size());
//        map.put(11, "First");
//        System.out.println(map.size());
        // __________________________________________________________________
        //MODULE 10
        // __________________________________________________________________

//                Задача 1

        File file = new File(".\\список номеров телефоном MOD 10\\file.txt");
        FileTest test = new FileTest();
        test.fileExists(file);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("987-123-4567\n" +
                    "123 456 7890\n" +
                    "(123) 456-7890");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        NumValidator numValidator = new NumValidator(file);
        numValidator.FilePrinterValidNumbers();
//      _________________________________________
//               Задача 2
//      _________________________________________
        File file2 = new File(".\\список объектов User\\file.txt");
        test.fileExists(file2);

        try (FileWriter writer = new FileWriter(file2);) {
            writer.write("name age\n" +
                    "alice 21\n" +
                    "ryan 30");
            writer.flush();
        } catch (IOException e) {
            e.getMessage();
        }

        GsonMake gsonMake = new GsonMake(file2);
        gsonMake.gsonPrint();
//      _________________________________________
//               Задача 3
//      _________________________________________
        File file3 = new File(".\\список слов\\file.txt");
        test.fileExists(file3);

        try (FileWriter writer = new FileWriter(file3)){
            writer.write("the day is sunny the the\n" +
                    "the sunny is is");
            writer.flush();
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        WordFrequency wordFrequency = new WordFrequency(file3);
        wordFrequency.wordsCounter();
        // __________________________________________________________________
        //MODULE 11
        // __________________________________________________________________





    }
}


