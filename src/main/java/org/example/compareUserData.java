package org.example;

public class compareUserData extends getUserData{
    public String checkPassword(String p) {
        if (p.equals("paSsword123")) {
            return "Welcome";
        } else {
            return "I don't know you";
        }
    }

    public String checkUserName(String u) {
        if (u.equals("user123")) {
           return "Right Username";
        }
        else{
            return "Wrong Username";
        }
    }
}