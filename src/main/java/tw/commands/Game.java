package tw.commands;

import java.util.List;

public class Game {

    public String game(Count count,String inputLine){
        List<String> inputList = Unit.converseList(inputLine);
        int sameNumber = count.countSameNumber(inputList);
        int sameSpaceNumber = count.countSameSpanceNumber(inputList);
        return sameSpaceNumber+"A"+(sameNumber-sameSpaceNumber)+"B";
    }
}
