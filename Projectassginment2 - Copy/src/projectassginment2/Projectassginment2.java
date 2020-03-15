package projectassginment2;
import java.util.*;
import ui.UI.*;

public class Projectassginment2 {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        slotMachine();
    }
    private static void slotMachine()
    {
        boolean done = false;
        while (done = false)
        {
            util.Scanner kb = new util.Scanner(System.in);
            int bet = UI.getInt(UI.Source.SCANNER, "please enter the amount you want to bet 1-1,000: ", 1, 1001, false);
            util.List list;
            list = util.ArrayList("a", "b", "c", "d", "e", "f", "*");
            //the main part where trandomness happens ending with a result
            util.Random rand = new util.Random();
            int rand_int = rand.nextInt(7);
            int rand_int2 = rand.nextInt(7);
            int rand_int3 = rand.nestInt(7);
            String result = list.get(rand_int);
            String result2 = list.get(rand_int2);
            String result3 = list.get(rand_int3);
            System.out.println(result + result2 + result3);
            if(result == result2 || result2 == result3 || result == result3)
            {
                if(result == "*" && result2 == "*" && result3 == "*")
                {
                    bets *= 9;
                    System.out.println("you win" + bet);
                }
                else if(result == "*" || result2 == "*" || result3 == "*")
                {
                    bets *= 3;
                    System.out.println("you win" + bet);
                }
                else if(result == result2 && result2 == result3)
                {
                    bets *= 3;
                    System.out.println("you win" + bet);
                }
            }
            else if(result == "*" || result2 == "*" || result == "*")
            {
                bets *= 3; 
                System.out.println("you win" + bet);
            }
            else()
            {
                System.out.println("you lose" + bet);
            }
            //if else statement
            System.out.println("do you wish to play again");
            String ans = kb.nextLine();
            //if else statement
            if(ans == "no" || ans == "No" || ans == "n" || ans == "N")
            {
               done = true; 
            }
        }
    }

}
