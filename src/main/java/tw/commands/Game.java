package tw.commands;

import java.util.List;

public class Game {

    public String game(Count count,String inputLine){
    	boolean isValid = count.isValid(inputLine);
    	Converse converse = new Converse();
    	if (isValid) {
    		 List<String> inputList = converse.converseList(inputLine);
    	        int sameNumber = count.countSameNumber(inputList);
    	        int sameSpaceNumber = count.countSameSpanceNumber(inputList);
    	        return sameSpaceNumber+"A"+(sameNumber-sameSpaceNumber)+"B";
    	    }else {
				return "输入错误";
			}
		}
       
}
