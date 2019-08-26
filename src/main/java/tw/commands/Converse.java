package tw.commands;

import java.util.ArrayList;
import java.util.List;

public class Converse {

    public static List<String> converseList(String line){
        List<String> inputList = new ArrayList<>();

        String[] guestNumbers = line.split(" ");
        
        for (int i=0;i<guestNumbers.length;i++){
            inputList.add(guestNumbers[i]);
        }
        return inputList;
    }

}
