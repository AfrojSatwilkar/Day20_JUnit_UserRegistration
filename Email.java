package com.company1.Day19_UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    // validating email
    public int email(String str) {
        int flag = 0;
        Pattern pattern = Pattern.compile("^abc.?[A-Za-z]?+@bl\\.co(\\.in)?$");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            flag = 1;
        }
        if (flag == 1) {
            System.out.println("valid email");
            return 1;
        } else {
            System.out.println("invalid email");
            return 0;
        }
    }
}

