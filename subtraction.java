
package vu.balex;

import java.util.Random;
import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
     
        Scanner save = new Scanner(System.in);
        Random randomNum = new Random();

        // Generate two single-digit integers
        int number1 = randomNum.nextInt(12); 
        int number2 = randomNum.nextInt(12); 

       
        if (number1 < number2) {
            int tempVar = number1;
            number1 = number2;
            number2 = tempVar;
        }

        // get  student answer
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int student_answer = save.nextInt();

        // checking  the answer student gives
        int correctAns = number1 - number2;
        if (student_answer == correctAns) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAns);
        }

       
    }
    
}
