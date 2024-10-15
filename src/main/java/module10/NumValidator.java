package module10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.regex.Pattern;

public class NumValidator {
    File file;
    String [] number;
public NumValidator(File file){
    this.file=file;
}
    public void FilePrinterValidNumbers() {
        try (FileReader fileReader = new FileReader(file)) {
            int read = fileReader.read();
            StringBuilder stringBuilder = new StringBuilder();
            while (read != -1) {
               stringBuilder.append( (char)read );
                read = fileReader.read();
            }
            String[] numbers = stringBuilder.toString().split("\\n");
            for (String str : numbers){
                if (getValid(str)){
                    System.out.println(str);
                }
            }
        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static boolean getValid(String number) {
        String valid = "^\\(\\d{3}\\) \\d{3}-\\d{4}$|^\\d{3}-\\d{3}-\\d{4}$";
        Pattern pattern = Pattern.compile(valid);
        return pattern.matcher(number).matches();
    }


}
