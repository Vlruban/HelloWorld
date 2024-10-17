package module10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileReaderTest {
    File file;

    public FileReaderTest(File file) {
        this.file = file;
    }

    public String fileReaderTest() throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(file)) {
            int read = fileReader.read();
            while (read != -1) {
                stringBuilder.append((char) read);
                read = fileReader.read();
            }
        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        }
        return stringBuilder.toString();

    }
}