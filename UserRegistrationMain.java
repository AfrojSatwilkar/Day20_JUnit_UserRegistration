package com.company1.Day19_UserRegistration;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String getFirstName = sc.next();
        FirstName first = new FirstName();
        first.firstName(getFirstName);
    }
}
