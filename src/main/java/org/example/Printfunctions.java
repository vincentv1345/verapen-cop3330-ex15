package org.example;

public class Printfunctions extends compareUserData{
    public void printF(){
        compareUserData d = new compareUserData();
        String x = d.getUsername();
        String y = d.getPassword();
        System.out.println(d.checkUserName(x));
        System.out.println(d.checkPassword(y));
    }
}
