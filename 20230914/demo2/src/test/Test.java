package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person p = Ghost.catchPerson(in.nextInt());
        Ghost.eat(p);
    }
}
