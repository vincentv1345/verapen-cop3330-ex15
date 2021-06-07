package org.example;
import java.util.Scanner;
public class getUserData {
    public String getUsername(){
        System.out.println("Please enter your username: ");
        Scanner u = new Scanner(System.in);
        String username = u.next();
        return username;
    }
    public String getPassword(){
        System.out.println("Please enter your password: ");
        Scanner p = new Scanner(System.in);
        String password = p.next();
        return password;
    }
}
