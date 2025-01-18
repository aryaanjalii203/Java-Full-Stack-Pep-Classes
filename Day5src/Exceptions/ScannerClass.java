package Exceptions;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your ID:");
        int id = sc.nextInt();

        System.out.println("Your ID is: " + id);
        sc.nextLine();

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Your name is: " + name);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Your age is: " + age);

        sc.close();
    }
}
