package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing main.Triangle class...");
        System.out.println("Testing valid triangle: isTriangle(3, 4, 5) = " + Triangle.isTriangle(3, 4, 5));
        System.out.println("Testing invalid triangle: isTriangle(1, 1, 10) = " + Triangle.isTriangle(1, 1, 10));
    }
}