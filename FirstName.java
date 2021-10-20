package com.company1.Day19_UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
    // validating first name
    public void firstName(String str) {
        int flag = 0;
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            flag = 1;
        }
        if (flag == 1) {
            System.out.println("valid First Name");
        } else {
            System.out.println("invalid First Name");
        }
    }
}

