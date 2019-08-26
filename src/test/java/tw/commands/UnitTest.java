package tw.commands;

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
        //when
        List<String> guestNumberList  = Unit.converseList(guestLine);
        //then
        assertEquals("1",guestNumberList.get(0));
        assertEquals("2",guestNumberList.get(1));
    }
}
