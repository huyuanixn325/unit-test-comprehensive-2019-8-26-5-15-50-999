package tw.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CountTest {

	@Test
    public void should_return_the_same_number_when_input_the_list(){
    	//given
    	String answer = "3426";
        Count count = new Count(answer);
        List<String> converseList = Unit.converseList("1 2 3 4");
        //when
        int sameCount = count.countSameNumber(converseList);
        //then
        assertEquals(3, sameCount);

        //count.countSameNumber()
    }

    public void should_return_the_same_number_and_the_same_space_when_input_the_list(){

    }
}
