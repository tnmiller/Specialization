package com.example.myfirstapp;

public class LoginUtils {

    /**
     * this method checks if the entered string is a valid email address
     * @param email
     * @return
     */
    public boolean isValid(String email){
        boolean hasAtSign = email.indexOf('@')>-1;
        return hasAtSign;
    }

    /**
     * this method returns the length of the local part of the email address entered (part before the @ sign)
     * @param email
     * @return
     */
    public int getLocalPartLength(String email){
        int start= email.indexOf('@');
        String localPart = email.substring(0, start);
        return localPart.length();
    }
}
