

import java.util.Scanner;

public class Quiz {

    //main with no functions
    public static void main(String[] args) {

        int answer1, answer2, answer3, score = 0;
        Scanner userInput = new Scanner(System.in);


        int a;
        System.out.println("What is the capital of Alaska?");
        System.out.print("1.Melbourne\n" + "2.Anchorage\n" + "3.Juneau\n");

        a = userInput.nextInt();
        System.out.println(a);


        if (a == 3) {
            System.out.println("That's correct");
            score++;


        } else {
            System.out.println("That's incorrect");
        }


        int b;
        System.out.println("Can you store the value cat in a variable of type int? ");
        System.out.print("1:Yes\n" + "2:No\n");

        b = userInput.nextInt();


        if (b == 2) {
            System.out.println("nice Job");
            score++;


        } else {
            System.out.println("That's incorrect");
        }


        int c;
        System.out.println("Q3: What is the result of 9+6/3?\n ");
        System.out.println("5\n" + "11\n" + "15/3\n");

        c = userInput.nextInt();
        if (c == 2) {
            System.out.println("That's correct");
            score++;


        } else {
            System.out.println("That's incorrect");

        }


        System.out.println("Overall, you got " + score + " out of 3 correct.");
        System.out.println("Thanks for playing");

    }
}
