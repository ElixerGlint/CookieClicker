import java.util.Scanner;
//spam protection
//test
public class cookie {
    public static void main(String[] args) {
        System.out.println("Welcome to cookie clicker");
        System.out.println("You can type in prestige at any moment in time to see your prestige, and how many cookies you need to get to your next prestige");
        System.out.println("Im currently working on a shop (not functional right now), type shop to enter the shop");
        Scanner input;
        input = new Scanner(System.in);
        String newcookie;
        double cookies = 0.0;
        double prestigecookieamount = 100.0;
        int prestige = 0;
        double cookierate = 1.0;
        
        String DoPrestige = "no";
        String enterkey = "Press enter for a cookie!";
        while (true) {
            enterkey = input.nextLine();

            if (enterkey.equals("")) {
                System.out.println("You gained a cookie!");
                cookies += cookierate;
            }
            System.out.println("You have " + cookies + " cookies!");

            if(enterkey.equals("prestige")) {
                System.out.println("Your current prestige is " + prestige);
                System.err.println("You need to reach " + prestigecookieamount + " in order to prestige!");
            }

            if(cookies > prestigecookieamount) {
                System.out.println("You can presige! You get 0.25 more cookies per click if you do!");
                System.out.println("Would you like to?");
                if(enterkey.equals("yes")) {
                    prestige++;
                    cookies = 0.0;
                    cookierate += 0.25;
                    prestigecookieamount += 50*prestige;
                }
            }

        }
    }
}
