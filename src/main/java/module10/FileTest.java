package module10;

import java.io.File;
import java.io.IOException;

public class FileTest {


    public void fileExists(File file) {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("_______________");
                System.out.println("ex.getMessage() = " + ex.getMessage());
                System.out.println("_______________");
            }
            System.out.println("Файл (" + file.getName() + ") был создан");
        } else {
            System.out.println("_______________");
            System.out.println("Файл (" + file.getName() + ") существует");
            System.out.println("_______________");
        }
    }

}
