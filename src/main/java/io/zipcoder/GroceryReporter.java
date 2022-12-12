package io.zipcoder;

import io.zipcoder.utils.FileReader;

import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroceryReporter {
    private final String originalFileText;

    public GroceryReporter(String jerksonFileName) {
           this.originalFileText = FileReader.readFile(jerksonFileName);
    }

    @Override
    public String toString() {
        String s = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##naME:BreaD;price:1.23;type:Food;expiration:1/02/2016##NAMe:BrEAD;price:1.23;type:Food;expiration:2/25/2016##naMe:MiLK;price:3.23;type:Food^expiration:1/11/2016##naMe:Cookies;price:2.25;type:Food%expiration:1/25/2016##naMe:CoOkieS;price:2.25;type:Food*expiration:1/25/2016##naMe:COokIes;price:2.25;type:Food;expiration:3/22/2016##naMe:COOkieS;price:2.25;type:Food;expiration:1/25/2016##NAME:MilK;price:3.23;type:Food;expiration:1/17/2016##naMe:MilK;price:1.23;type:Food!expiration:4/25/2016##naMe:apPles;price:0.25;type:Food;expiration:1/23/2016##naMe:apPles;price:0.23;type:Food;expiration:5/02/2016##NAMe:BrEAD;price:1.23;type:Food;expiration:1/25/2016##naMe:;price:3.23;type:Food;expiration:1/04/2016##naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##naME:BreaD;price:1.23;type:Food@expiration:1/02/2016##NAMe:BrEAD;price:1.23;type:Food@expiration:2/25/2016##naMe:MiLK;priCe:;type:Food;expiration:1/11/2016##naMe:Cookies;price:2.25;type:Food;expiration:1/25/2016##naMe:Co0kieS;pRice:2.25;type:Food;expiration:1/25/2016##naMe:COokIes;price:2.25;type:Food;expiration:3/22/2016##naMe:COOkieS;Price:2.25;type:Food;expiration:1/25/2016##NAME:MilK;price:3.23;type:Food;expiration:1/17/2016##naMe:MilK;priCe:;type:Food;expiration:4/25/2016##naMe:apPles;prIce:0.25;type:Food;expiration:1/23/2016##naMe:apPles;pRice:0.23;type:Food;expiration:5/02/2016##NAMe:BrEAD;price:1.23;type:Food;expiration:1/25/2016##naMe:;price:3.23;type:Food^expiration:1/04/2016##\n";
        String patternString = "[ ]";
        int count = 0;
        //while(patternString.find()) {
            count++;
            //System.out.println("seen: " + count + "times";
        StringBuilder sb = new StringBuilder(originalFileText)
                .insert(0,"name:" + " \t\t\t\t " + "seen: " + "times\n" + "=============        =============\n" + "Price: " + " \t\t\t " + "seen: " + "times\n" + "-------------        -------------\n" + "Price: " + " \t\t\t " + "seen: " + "times\n");
        String output = sb.toString();
        return output;
//        String ss[] = s.split("\\s");
//        for (int i = 0; i <ss.length; i++) {
//            System.out.println(ss[i]);
//        }
//        return ;
    }

//    public String JsonToString () {
//        JsonParser parser = new JsonParser();
//        JsonObject JSONObject = parser.parse(s).getAsJsonJect();
//        return JSONObject;
//    }
}
