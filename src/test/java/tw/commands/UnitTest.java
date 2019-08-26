package example;

import org.junit.jupiter.api.Test;
import tw.commands.Unit;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
    @Test
    void should_return_list_when_input_string(){
        //given
        String guestLine = "1 2 3 4";
        List<Integer> resultList = new ArrayList<>();
        resultList.add(1);
        resultList.add(2);
        resultList.add(3);
        resultList.add(4);
        //when
        List<Integer> guestNumberList  = Unit.converseList(guestLine);
        //then
        assertEquals(resultList.get(0),guestNumberList.get(0));
        assertEquals(resultList.get(1),guestNumberList.get(1));
    }
}
