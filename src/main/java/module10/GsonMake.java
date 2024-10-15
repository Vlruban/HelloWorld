package module10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class GsonMake extends FileReaderTest {
    Person person;


    public GsonMake(File file) {
        super(file);
    }

    public void gsonPrint() throws FileNotFoundException {
        String[] array = fileReaderTest().split("[\\s\\n]+");
        Gson gs = new GsonBuilder().setPrettyPrinting().create();
        for (int i = 1; i < array.length - 2; i++) {
            Person person = new Person(array[i+1], array[i +2]);
            System.out.println("gs.toJson(person) = " + gs.toJson(person));

        }


    }

}



