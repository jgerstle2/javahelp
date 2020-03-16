package projectassginment2;
import java.util.*;
import ui.UI;

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
        while (done == false)
        {
            Scanner kb = new Scanner(System.in);
            int bet = UI.getInt(UI.Source.SCANNER, "please enter the amount you want to bet 1-1,000: ", 1, 1001, false);
            //System.out.println("please enter a number ");
            //String bets = kb.nextLine();
            //int bet = Integer.parseInt(bets);
            ArrayList<String> list = new ArrayList<>();
            list.add("a");
            list.add("b");
            list.add("c");
            list.add("d");
            list.add("e");
            list.add("f");
            list.add("*");
            //the main part where trandomness happens ending with a result
            Random rand = new Random();
            int rand_int = rand.nextInt(7);
            int rand_int2 = rand.nextInt(7);
            int rand_int3 = rand.nextInt(7);
            String result = list.get(rand_int);
            String result2 = list.get(rand_int2);
            String result3 = list.get(rand_int3);
            System.out.println(result + result2 + result3);
            if(result.equals(result2) || result2.equals(result3) || result.equals(result3))
            {
                if(result.equals("*") && result2.equals("*") && result3.equals("*"))
                {
                    bet *= 9;
                    System.out.println("you win " + bet);
                }
                else if(result.equals("*") || result2.equals("*") || result3.equals("*"))
                {
                    bet *= 3;
                    System.out.println("you win " + bet);
                }
                else if(result.equals(result2) && result2.equals(result3))
                {
                    bet *= 3;
                    System.out.println("you win " + bet);
                }
                else 
                {
                    System.out.println("you win " + bet);
                }
            }
            else if(result.equals("*") || result2.equals("*") || result.equals("*"))
            {
                bet *= 3; 
                System.out.println("you win " + bet);
            }
            else
            {
                System.out.println("you lose " + bet);
            }
            //if else statement
            System.out.println("do you wish to play again ");
            String ans = kb.nextLine();
            //if else statement
            if(ans.equals("no") || ans.equals("No") || ans.equals("n") || ans.equals("N"))
            {
               done = true; 
            }
        }
    }

}
