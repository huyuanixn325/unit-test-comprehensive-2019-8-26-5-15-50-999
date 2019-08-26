package tw;

import tw.commands.Count;
import tw.commands.Game;
import tw.commands.GuessInputCommand;
import tw.commands.Unit;

import java.util.List;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;

    public static void main(String[] args) throws Exception {
        String answer = "4329";
        Count count = new Count(answer);
        Game game = new Game();
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            System.out.println("你输入的数值为："+input);
            String result = game.game(count,input);
            System.out.println(result);
        }
    }
}
