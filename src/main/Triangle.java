package main;

public class Triangle {
    public static boolean isTriangle(double side1, double side2, double side3) {
        // main.Triangle inequality theorem: The sum of the lengths of any two sides must be greater than the length of the third side.
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}
