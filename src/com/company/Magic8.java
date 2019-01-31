package com.company;

/* Create a program that mimics the Magic 8 Ball. If you don't know what a Magic 8 Ball is ... it's a toy ball containing a clear 'window'. You shake the ball and ask it a question. A random response rises to the window. You can read about the Magic 8 Ball on Wikipedia
 (Links to an external site).
Links to an external site.
Your program will prompt the user for a question and select a random answer from the list below. See the required output below the responses.
● It is certain
● It is decidedly so
● Without a doubt
● Yes definitely
● You may rely on it
● As I see it, yes
● Most likely
● Outlook good
● Yes
● Signs point to yes
● Reply hazy try again
● Ask again later
● Better not tell you now
● Cannot predict now
● Concentrate and ask again
● Don't count on it
● My reply is no
● My sources say no
● Outlook not so good
● Very doubtful
Implement a loop to continue asking the user for more questions until they enter "No" to stop.
Write a method to handle the generating of the random response.
Display the question and the answer to the user.
*/

import java.util.Scanner;
import java.util.Random;

public class Magic8 {

    static String random_response() {
        Random phrase = new Random();
        String answer = "";
        int rand = phrase.nextInt(20);
        switch (rand) {
            case 0:
                answer = "It is certain.";
                break;
            case 1:
                answer = "It is decidedly so.";
                break;
            case 2:
                answer = "Without a doubt.";
                break;
            case 3:
                answer = "Yes definitely.";
                break;
            case 4:
                answer = "You may rely on it.";
                break;
            case 5:
                answer = "As I see it, yes.";
                break;
            case 6:
                answer = "Most likely.";
                break;
            case 7:
                answer = "Outlook good.";
                break;
            case 8:
                answer = "Yes.";
                break;
            case 9:
                answer = "Signs point to yes.";
                break;
            case 10:
                answer = "Reply hazy, try again.";
                break;
            case 11:
                answer = "Ask again later.";
                break;
            case 12:
                answer = "Better not tell you now.";
                break;
            case 13:
                answer = "Cannot predict now.";
                break;
            case 14:
                answer = "Concentrate and ask again.";
                break;
            case 15:
                answer = "Don't count on it.";
                break;
            case 16:
                answer = "My reply is no.";
                break;
            case 17:
                answer = "My sources say no.";
                break;
            case 18:
                answer = "Outlook not so good.";
                break;
            case 19:
                answer = "Very doubtful.";
                break;
            default:
                answer = "Welcome Magic 8-ball User.";

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String another = "y";
        String response = "";
        do {
            System.out.println("\nState your inquiry: ");
            String inquiry = scanner.nextLine();
            System.out.println("\nYOU ASKED:  " + inquiry);
            response = random_response();
            System.out.println ("MAGIC 8-BALL SAYS: " + response);
            System.out.println("\nDo you have another question for the Magic 8-Ball? (y/n)");
            another = scanner.nextLine();
        } while ((another.equals("y")) || (another.equals("Y")) || (another.equals("yes")) || (another.equals("YES")) || (another.equals("Yes")));

    }
}
