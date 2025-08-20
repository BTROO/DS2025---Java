package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente cl1 = new Cliente("Noemi", 25);
        Cliente cl2 = new Cliente("Alex", 55);

        System.out.println(cl1.toString());
        System.out.println(cl2.toString());
    }
}