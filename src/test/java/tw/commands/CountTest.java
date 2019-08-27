package tw.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CountTest {
    private static Count count;
    private static Converse converse;
    @BeforeAll
    public static void setUp(){
        count = new Count("5237");
        converse = new Converse();
    }

	@Test
    public void should_return_the_same_number_when_input_the_list(){
    	//given
        List<String> converseList = converse.converseList("1 2 3 4");
        //when
        int sameCount = count.countSameNumber(converseList);
        //then
        assertEquals(2, sameCount);

        //count.countSameNumber()
    }

    @Test
    public void should_return_the_same_number_and_the_same_space_when_input_the_list(){

        List<String> converseList = converse.converseList("1 2 3 4");
        int sameSpaceCount = count.countSameSpanceNumber(converseList);
        assertEquals(2,sameSpaceCount);
    }
    @Test
    public void should_return_the_XAXB_when_input_the_String(){

	    Game game = new Game();
	    String inputLine = "1 2 3 4";
	    String gameResult = game.game(count,inputLine);
	    assertEquals("2A0B",gameResult);
    }
    
    @Test
    public void should_return_the_XAXB_when_input_the_error_String(){

	    Game game = new Game();
	    String inputLine = "1 2";
	    String gameResult = game.game(count,inputLine);
	    assertEquals("输入错误",gameResult);
    }
    
    @Test
    public void should_return_true_when_input_1234() {

    	 String input = "1 2 3 4";
    	 Boolean isValid = count.isValid(input);
    	 assertEquals(true,isValid);
    }
    
    @Test
    public void should_return_false_when_input_12() {

    	 String input = "1 2";
    	 Boolean isValid = count.isValid(input);
    	 assertEquals(false,isValid);
    }
    
    @Test
    public void should_return_false_when_input_ab() {

    	 String input = "a b c d";
    	 Boolean isValid = count.isValid(input);
    	 assertEquals(false,isValid);
    }


    
}
