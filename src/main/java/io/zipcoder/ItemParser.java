package io.zipcoder;

import io.zipcoder.utils.Item;
import io.zipcoder.utils.ItemParseException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

public class ItemParser {
    public List<Item> parseItemList(String valueToParse) {
        try {
            String[] items = valueToParse.split("##");
            ArrayList<Item> list = new ArrayList<>();
            for (String t : items) {
               // list.add(parseSingleItem(t));
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
        // Pattern pattern = Pattern.compile("milk"
//        Matcher matcher = pattern.matcher(valueToParse);
//        //String[] input = valueToParse.split(",\\s*");
//        List<Item> list = new ArrayList<>();
//        while (matcher.find()) {
//            list.add(matcher.group());
//        };
//        String first = mylist.get(valueToParse);
    //return first;

    public Item parseSingleItem(String singleItem) throws ItemParseException {
//        Matcher m = Pattern.compile("(\\b\\B)").matcher(singleItem);
//        while(m.find()) {
//            m.group();
//        }
//        return m;
//    } throw new (ItemParseException());

        String[] props = singleItem.replace(";", " ").split(" ");
        for (String t : props) {
            t.replace("(\\b\\B)", " ");
        }
        throw (new ItemParseException());
    }
}
