/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgame;

import java.util.Random;
import java.util.Scanner;
import javax.swing.text.html.HTML;
import static jdk.nashorn.internal.objects.NativeFunction.function;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author studentadmin
 */
public class GameCodes {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    static void gameCode() {

        //scanner 
        Scanner scanner = new Scanner(System.in);
        //Start game 
        System.out.println("Please enter username");
        String userName = scanner.nextLine();

        System.out.println("Hi " + userName);

//game codes 
        int question = 1, question2 = 4, question3 = 7, question4 = 10;
        int questionAnswer = 0, totalScore = 0, score = 0, userAnswer = 0, minusOne = 0,plusOne = 0,plusTwo = 0,plusThree = 0, plusFour = 0;

        Scanner keyboard = new Scanner(System.in);

//Aditions question x3    
        while (question <= 3) {
//random number generator 1
            int randomNumberOne = 0, randomNumberTwo = 0;
            double random = Math.random();
//Random generator = new Random();
            int randomNumber1 = (int) (random * 100) - 50;
//random number generator 2
            double random2 = Math.random();
            int randomNumber2 = (int) (random2 * 100) - 50;
//questions    
            System.out.printf("\nQuestion %d:  \n", question);
            System.out.println(randomNumber1 + " + " + randomNumber2);
            questionAnswer = randomNumber1 + randomNumber2;
            userAnswer = keyboard.nextInt();
           
           
            if (userAnswer == questionAnswer) {
                System.out.println(ANSI_GREEN + "Correct   +1 point" + ANSI_RESET);
                plusOne++;
            } else {
                System.out.println(ANSI_RED + "Incorrect    -1 point\n" + ANSI_RESET + "Answer is " + ANSI_PURPLE + questionAnswer + ANSI_RESET);
                minusOne++;
            }
            question++;
                       
            
        }
        
        //end while 

//subtractions question x3 
        while (question2 <= 6) {
//random number generator 1
            int randomNumberOne = 0, randomNumberTwo = 0;
            double random = Math.random();
            Random generator = new Random();
            int randomNumber1 = (int) (random * 100) - 50;
//random nymber generator 2
            double random2 = Math.random();
            int randomNumber2 = (int) (random2 * 100) - 50;
//questions    
            System.out.printf("\nQuestion %d:  \n", question2);
            System.out.println(randomNumber1 + " - " + randomNumber2);
            questionAnswer = randomNumber1 - randomNumber2;
            userAnswer = keyboard.nextInt();
            
           
            if (userAnswer == questionAnswer) {
                System.out.println(ANSI_GREEN + "Correct   +2 point" + ANSI_RESET);
                plusTwo++;
            } else {
                System.out.println(ANSI_RED + "Incorrect    -1 point\n" + ANSI_RESET + "Answer is " + ANSI_PURPLE + questionAnswer + ANSI_RESET);
                minusOne++;
            }
            question2++;
            
            plusTwo = plusTwo*2; 
         
           
        }
//end while 

//Multiplication Question x 3 
    //Aditions question x3    
        while (question3 <=9) {
//random number generator 1
            int randomNumberOne = 0, randomNumberTwo = 0;
            double random = Math.random();
//Random generator = new Random();
            int randomNumber1 = (int) (random * 100) - 50;
//random number generator 2
            double random2 = Math.random();
            int randomNumber2 = (int) (random2 * 100) - 50;
//questions    
            System.out.printf("\nQuestion %d:  \n", question3);
            System.out.println(randomNumber1 + " x " + randomNumber2);
            questionAnswer = randomNumber1 * randomNumber2;
            userAnswer = keyboard.nextInt();
            
           
            if (userAnswer == questionAnswer) {
                System.out.println(ANSI_GREEN + "Correct   +3 point" + ANSI_RESET);
                plusThree++;
            } else {
                System.out.println(ANSI_RED + "Incorrect    -1 point\n" + ANSI_RESET + "Answer is " + ANSI_PURPLE + questionAnswer + ANSI_RESET);
                minusOne++;
            }
            question3++;
            
            plusThree = plusThree *3;
           
            
        }
        //end while 

//Aditions question x3    
        while (question4 <= 12) {
//random number generator 1
            int randomNumberOne = 0, randomNumberTwo = 0;
            double random = Math.random();
//Random generator = new Random();
            int randomNumber1 = (int) (random * 100) - 50;
//random number generator 2
            double random2 = Math.random();
            int randomNumber2 = (int) (random2 * 100) - 50;
//questions    
            System.out.printf("\nQuestion %d:  \n", question4);
            System.out.println(randomNumber1 + " / " + randomNumber2);
            questionAnswer = randomNumber1 / randomNumber2;
            userAnswer = keyboard.nextInt();
           
            if (userAnswer == questionAnswer) {
                System.out.println(ANSI_GREEN + "Correct   +4 point" + ANSI_RESET);
                plusFour++;
            } else {
                System.out.println(ANSI_RED + "Incorrect    -1 point\n" + ANSI_RESET + "Answer is " + ANSI_PURPLE + questionAnswer + ANSI_RESET);
                minusOne++;
            }
            question4++;
            
            plusFour = plusFour *4;
            
            
            
            
             //end while 
        }
        int finalScore = plusOne+plusTwo+plusThree+plusFour-minusOne; 
        System.out.println("Your final score is " + finalScore);
        
        
        
    }
    
    
 
    
    
}
       
    


