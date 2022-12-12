package io.zipcoder;

import io.zipcoder.utils.FileReader;

import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroceryReporter {
    private final String originalFileText;

    public GroceryReporter(String jerksonFileName) {
        try {
            this.originalFileText = FileReader.readFile(jerksonFileName);
            try {
                Matcher m = Pattern.compile("[Milk]").matcher(jerksonFileName);
                while (m.find()) {
                    System.out.println(m.group());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        String s = "";
        String ss[] = s.split("\\s");
        for (int i = 0; i <ss.length; i++) {
            System.out.println(ss[i]);
        }
        return null;
    }
}
