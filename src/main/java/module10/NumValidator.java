package module10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class NumValidator extends FileReaderTest {

    public NumValidator(File file){
        super(file);
    }

    public void FilePrinterValidNumbers() throws FileNotFoundException {
        for (String str : fileReaderTest().split("\\n")) {
            if (getValid(str)) {
                System.out.println(str);
            }
        }
    }

    public static boolean getValid(String number) {
        String valid = "^\\(\\d{3}\\) \\d{3}-\\d{4}$|^\\d{3}-\\d{3}-\\d{4}$";
        Pattern pattern = Pattern.compile(valid);
        return pattern.matcher(number).matches();
    }


}
