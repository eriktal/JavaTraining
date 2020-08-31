package MyJavaProject;

import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        System.out.println("Let's play a game called \"OddsAndEvens\".");
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your userName?");
        String userName = scan.next();
        System.out.println("Hi " + userName + ", which do you choose? (O)dds or (E)Evens ?");
        Scanner scan2 = new Scanner(System.in);
        String str = scan2.next();
        str = str.toUpperCase();
        String odd = "O";
        String even = "E";
        if (str.equals(odd)) {
            System.out.println(userName + " has picked " + str + ". The computer will be " + even + ".");
            System.out.println("Let's have fun !!");
        } else if (str.equals(even)) {
            System.out.println(userName + " has picked " + str + ". The computer will be " + odd + ".");
            System.out.println("Let's have fun !!");
        } else {
            System.out.println("Choose between O or E please");
        }
        System.out.println("------------------------------------------------------------------");
        //Part 2
        System.out.println("How many \" fingers\" do you put out? ");
        Scanner scan3 = new Scanner(System.in);
        int userNumber = scan3.nextInt();
        Random rand = new Random();
        int computerNumber = rand.nextInt(6);
        System.out.println("The computer plays number " + computerNumber + " \"fingers\"");
        System.out.println("------------------------------------------------------------------");

        int sum = userNumber + computerNumber;
        System.out.println("The sum is: " + sum);
       /* if(sum%2 == 0 ){
            System.out.println( "Bravo ! Even win !");
        }
        else{
            System.out.println("Bravo ! Odds wins");
        }*/
        // or
        boolean OddOrEven = sum % 2 == 0;
        if (OddOrEven) {
            System.out.println("The sum is Even");
            if (str.toUpperCase().equals(even)) {
                System.out.println("The winner is " + userName);
            } else {
                System.out.println("The winner is the computer");
            }
        }
        else{
            System.out.println("The sum is odd");
            if (str.toUpperCase().equals(odd)){
                System.out.println("The winner is "+userName);
            }
            else {
                System.out.println("The winner is the computer");

            }

        }
    }
}

