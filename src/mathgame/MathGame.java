/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgame;

import java.util.Scanner;

/**
 *
 * @author studentadmin
 */
public class MathGame {
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//introduction 
        
    GameCodes.gameCode();
    System.out.println("Welcome to "+ANSI_PURPLE +"Math Game!!! \n"+ANSI_RESET+"Where you will be tests on basic math skills (Addition, Subtraction, Multiplication, Division)");
        System.out.println("--------------------------");
        System.out.println("Select your choice by typing 1-5\n\n"+ANSI_RESET+ "1. "+ANSI_GREEN+"Start Game\n"+ANSI_WHITE+"2. Display highest and lowest scores\n"+"3. Display users from highest to lowest\n"+"4. Display users from lowest to highest\n"+ "5. "+ANSI_RED+"Quit"+ANSI_RESET);

//Scanner 
        Scanner scanner = new Scanner(System.in);
        
//menu selection code 

int selection = scanner.nextInt();
if (selection == 1){
    System.out.print("Game");
}
else if (selection ==2){
        System.out.print("H+L");
}
 else if (selection ==3){
        System.out.print("H-L");
} 
 else if (selection ==4){
        System.out.print("L-H");
}
 else if(selection ==5){
         System.out.print("Quit");
 }   
 else {
           System.out.print("Invalid Input");
 
    }
    }
}
    

