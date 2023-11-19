package ru.otus;

import com.google.common.base.Preconditions;
import java.util.Scanner;

@SuppressWarnings("java:S106")
public class HelloOtus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = in.nextInt();
        Preconditions.checkArgument(age > 0, "Invalid age");
    }
}
