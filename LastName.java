package com.company1.Day19_UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
    // validating last name
    public void lastName(String str) {
        int flag = 0;
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            flag = 1;
        }
        if (flag == 1) {
            System.out.println("valid Last Name");
        } else {
            System.out.println("invalid Last Name");
        }
    }
}

