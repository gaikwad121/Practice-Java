package com.Practice;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email:");
        String inputEmail = scanner.nextLine();

        // Regex for basic email validation
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(inputEmail);

        if (matcher.matches()) {
            System.out.println("✅ Valid Email Format");
        } else {
            System.out.println("❌ Invalid Email Format");
        }

        scanner.close();
    }
}
