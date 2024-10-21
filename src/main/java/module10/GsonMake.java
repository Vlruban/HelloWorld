package module10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GsonMake extends FileReaderTest {
    Person person;


    public GsonMake(File file) {
        super(file);
    }


    public void toGsonSave() throws FileNotFoundException {
        File file1 = new File(".\\UsersObject\\user.json.");
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        String[] array = fileReaderTest().split("[\\s\\n]+");
        Gson gs = new GsonBuilder().setPrettyPrinting().create();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 3; i < array.length; i += 2) {
            Person person = new Person(array[i - 1], array[i]);
            stringBuilder.append(gs.toJson(person));
        }
        try (FileWriter writer = new FileWriter(file1)) {
            writer.write(String.valueOf(stringBuilder));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(stringBuilder.toString());
        System.out.println("было записано в "+ file1.getName());
    }
}



