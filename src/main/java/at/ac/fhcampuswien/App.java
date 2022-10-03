package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        double input = 1;
        double maxval =0;

        System.out.print("Number " + counter + ": ");
        counter++;
        input = scan.nextDouble();

        if (input <= 0){
            System.out.println("No number entered.");
            return;
        }
         while(input > 0){
            System.out.print("Number " + counter++ + ": ");
            input = scan.nextDouble();

            if(input > maxval){
                maxval = input;
    }
}
        System.out.println("The largest number is " + String.format("%.2f", maxval));

    }

    //todo Task 2
    public void stairs(){

        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int maxzeilen = scan.nextInt();
        int counter = 1;

        if (maxzeilen < 0){

            System.out.println("Invalid number!");

        }
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
        Scanner scan = new Scanner(System.in);

        double mark = 1;
        int sum = 0;
        int counter = 1;
        double average = 0;
        int negative = 0;
        System.out.print("Number " + counter++ + ": ");
        mark=scan.nextDouble();

        while(mark > 0){
            System.out.print("Number " + counter++ + ": ");
            mark = scan.nextDouble();
            average = (average + mark);

            if(mark < 0 || mark >5 ){
                System.out.println("Invalid mark!");
                counter -= 1;

            } else if (mark==5) {
                negative += 1;
            }
        }
        System.out.println("Negative marks: " + negative);
        System.out.println("Average: " + average/counter);
    }

    //todo Task 6
    public void happyNumbers(){
        int i = 1;
        int input;
        int sum = 0;

        System.out.print("n: ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();

        while (input>9){

            while (input > 0){

                i = input % 10;
                sum += (i*i);
                input = input / 10;
            }

            input = sum;
            sum = 0;
        }
        if(input==1){
            System.out.println("Happy number!");
        }
        else {
            System.out.println("Sad number!");
        }
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