package regsys;

import java.util.Scanner;

public class Regsys {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfUsers = 3; // Number of users to register
        String[] names = new String[numberOfUsers];
        String[] emails = new String[numberOfUsers];

        // Registration process
        for (int i = 0; i < numberOfUsers; i++) {
            System.out.println("Register User " + (i + 1));
            System.out.print("Enter your name: ");
            names[i] = input.nextLine();
            System.out.print("Enter your email: ");
            emails[i] = input.nextLine();
            System.out.println("Registration successful for " + names[i] + "!\n");
        }

        // Display registered users
        System.out.println("Registered Users:");
        for (int i = 0; i < numberOfUsers; i++) {
            System.out.println("User " + (i + 1) + ": " + names[i] + ", Email: " + emails[i]);
        }

        input.close();
    }
}
