package io.zipcoder;

import io.zipcoder.utils.Item;
import io.zipcoder.utils.ItemParseException;
import io.zipcoder.utils.match.MatchGroup;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

public class ItemParser {
    public List<Item> parseItemList(String valueToParse) {
        String[] items = valueToParse.split("##");
        ArrayList<Item> list = new ArrayList<>();
        for (String t :items) {
            try {
                list.add(parseSingleItem(t));
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
        return list;
    }

    // Pattern pattern = Pattern.compile("milk")
//        Matcher matcher = pattern.matcher(valueToParse);
//        //String[] input = valueToParse.split(",\\s*");
//        List<Item> list = new ArrayList<>();
//        while (matcher.find()) {
//            list.add(matcher.group());
//        };
//        String first = mylist.get(valueToParse);
    //return first;

    public Item parseSingleItem(String singleItem) throws ItemParseException {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher m = pattern.matcher(singleItem);
        MatchGroup mg = new MatchGroup(m);
        try {
            //need to print format of expected ("milk" 3.23 "food" "1/25/2016")
                                  //   1  23 4 5   6  7 8 9   10   spaces are 2,5,7
            Item s = new Item(mg.get(1).getValue().toLowerCase(), Double.parseDouble(mg.get(3).getValue() + "." + mg.get(4).getValue()), mg.get(6).getValue().toLowerCase(), mg.get(8).getValue() + "/" + mg.get(9).getValue() + "/" + mg.get(10).getValue());
            return s;
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
            throw new ItemParseException();
        }
    }
}
