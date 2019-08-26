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

    @Test
    public void should_return_the_same_number_and_the_same_space_when_input_the_list(){
        String answer = "5237";
        Count count = new Count(answer);
        List<String> converseList = Unit.converseList("1 2 3 4");
        int sameSpaceCount = count.countSameSpanceNumber(converseList);
        assertEquals(2,sameSpaceCount);
    }
    @Test
    public void should_return_the_XAXB_when_input_the_String(){
	    Count count = new Count("5237");
	    Game game = new Game();
	    String inputLine = "1 2 3 4";
	    String gameResult = game.game(count,inputLine);
	    assertEquals("2A0B",gameResult);
    }
}
