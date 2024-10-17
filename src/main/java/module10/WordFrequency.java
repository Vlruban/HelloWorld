package module10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFrequency extends FileReaderTest {


    public WordFrequency(File file) {
        super(file);
    }

    public void wordsCounter() throws FileNotFoundException {
        String[] array = fileReaderTest().split("[\\s\\n]+");
        String valid = "\\b\\w+\\b";
        Pattern pattern = Pattern.compile(valid);
        Map<String, Integer> map = new HashMap<>();
        for (String str : array) {
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                String word = matcher.group();
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}


