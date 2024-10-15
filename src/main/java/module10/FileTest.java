package module10;

import java.io.File;
import java.io.IOException;

public class FileTest {


    public void fileExists (File file) {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("ex.getMessage() = " + ex.getMessage());
            }
            System.out.println("Новый файл был создан");
        } else {
            System.out.println("_______________");
            System.out.println("Файл существует");
            System.out.println("_______________");
            System.out.println();
        }
    }

}
