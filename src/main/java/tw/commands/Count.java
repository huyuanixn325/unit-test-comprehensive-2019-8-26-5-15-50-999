package tw.commands;

import java.util.ArrayList;
import java.util.List;

public class Count {

    private String answer;

    public Count(String answer) {
        this.answer = answer;
    }

    public int countSameNumber(List<String> guestNumberList){
        int sameCount = 0;
        //System.out.println(answer.contains(guestNumberList.get(2)));
        for(String s:guestNumberList) {
        	if(answer.contains(s)) {
        		sameCount ++;
        	}
        }
		return sameCount;

    }

    public int countSameSpanceNumber(List<String> guessNumberList){
        int sameSpaceNumber = 0;
        for(int i = 0;i<answer.length();i++){
            if (String.valueOf(answer.charAt(i)).equals(guessNumberList.get(i))){
                sameSpaceNumber++;
            }
        }
        return sameSpaceNumber;
    }

    public boolean isValid(String input){
        String[] inputNumbers = input.split(" ");
        if (inputNumbers.length!=4){
            return false;
        }else{
            for(int i = 0;i<inputNumbers.length;i++){
                if(inputNumbers[i].charAt(0)<48||inputNumbers[i].charAt(0)>57){
                    return false;
                }
            }
        }
        return true;
    }
//    public void createNumAnswer(){
//        answer = (int)((Math.random()*9+1)*1000);
//    }
}
