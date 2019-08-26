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
        System.out.println(answer.contains(guestNumberList.get(2)));
        for(String s:guestNumberList) {
        	if(answer.contains(s)) {
        		sameCount ++;
        	}
        }
		return sameCount;

    }

    public int countSameSpanceNumber(List<String> guessNumberList){
        return 0;
    }
//    public void createNumAnswer(){
//        answer = (int)((Math.random()*9+1)*1000);
//    }
}
