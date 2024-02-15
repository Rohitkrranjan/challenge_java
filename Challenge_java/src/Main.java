//create a program to input name of the person and respond with "Welcome Name to java coding"

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.print("Welcome " +name +" to java coding");

    }
}