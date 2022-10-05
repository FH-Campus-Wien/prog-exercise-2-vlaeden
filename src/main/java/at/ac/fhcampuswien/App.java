package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public int ceilNumber(int a, int b){

        if (a % b == 0)
    {
        return (a / b);
    }
else
    {
        return (a / b) + 1;
    }
}

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
        Scanner scan = new Scanner(System.in);
        System.out.print("h: ");
        int n;
        n = scan.nextInt();
        int counter1 = 1;
        int counter2 = 0;
        System.out.print("c: ");
        String a = scan.next(); //Character
        char b = a.charAt(0);

        if(n%2==0){
            System.out.println("Invalid number!");
            return;
        }

        for (int i = 0; i < n; i++)
        {

            for (int spc = (n-3) - counter2; spc > 0; spc--)
            //print space
            {
                System.out.print(" ");
            }
                counter2++;


            for (int j = 0; j < counter1; j++)
            {

                System.out.print(b);//print Character
                if (j < counter1 / 2)
                 {
                    b++;
                 } else {
                    b--;
                 }

            }
            if (i < (n/2))
            {
                 counter1 = counter1 + 2;

            }
            else
            {
            counter1 = counter1 - 2;

            }

        if (i >= (n/2)){
            b+=2;
            counter2=1;
            if (i >= ceilNumber(n,2))
            {
                counter2--;
            }
        }
        System.out.println();
        }
    }



    //todo Task 5
    public void marks(){
        Scanner scan = new Scanner(System.in);

        double mark = 1;
        int sum = 0;
        int counter = 0;
        double average = 0;
        int negative = 0;

        System.out.print("Mark " + ++counter + ": ");
        mark=scan.nextDouble();
        average += mark;

        while(mark > 0){

            if(mark < 0 || mark >5 ){
                System.out.println("Invalid mark!");
                average -= mark;
                counter--;


            } else if (mark==5) {
                negative += 1;
            }

            System.out.print("Mark " + ++counter + ": ");
            mark = scan.nextDouble();
            if (mark!=0){
                average = (average + mark);
            }

        }
        if(average==0){
            System.out.printf("Average: %.2f", average);
            System.out.println();
            System.out.println("Negative marks: " + negative);
            return;
        }
        double averagequote = average/((double)counter-1);

        System.out.printf("Average: %.2f", averagequote);
        System.out.println();
        System.out.println("Negative marks: " + negative);
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