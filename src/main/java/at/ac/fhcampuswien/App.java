package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
    }

    //todo Task 2
    public void stairs(){
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int maxzeilen = scan.nextInt();
        int counter = 1;
        if (maxzeilen < 0){
            System.out.println("Invalid number!");
        };
        for(int i = 0; i < maxzeilen; i++) {

            for(int j = 0; j < maxzeilen; j++) {

                if(i >= j)

                    System.out.print(counter++ + " ");

            }

            System.out.println();

        }

    }




    //todo Task 3
    public void printPyramid(){
        Scanner scan = new Scanner(System.in);
        int rows = 6;
        for (int i= 1; i <= rows; i++) {

            for( int j= i; j < rows; j++) {
                System.out.print(" ");
            }
            for(int h = 1; h<i*2; h++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}