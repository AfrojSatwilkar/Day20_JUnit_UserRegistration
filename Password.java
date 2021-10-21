package com.company1.Day19_UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public void validate(String str) {
        int flag = 0;
        Pattern pattern = Pattern.compile("^([A-Z]){1}([a-z0-9-_.]){7}$");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            flag = 1;
        }
        if (flag == 1) {
            System.out.println("valid password");
        } else {
            System.out.println("invalid password");
        }
    }
}
