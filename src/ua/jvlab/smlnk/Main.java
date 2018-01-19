package ua.jvlab.smlnk;

/* Drawing on the screen a rectangle of asterisks "*" */

/* @version 1.0.0;
 * @date 2018-01-19;
 * @author "$.m.lnk";
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a scanner to enter the height and width of the rectangle;

        Scanner sc = new Scanner(System.in);

        int height;
        int width;

        System.out.println("Enter the height of the rectangle:");
        height = sc.nextInt();
        System.out.println("Enter the width of the rectangle:");
        width = sc.nextInt();

        drawingRectangle(height, width); // use method;
        sc.close();

    }

    // method of outputting a rectangle by setting parameters;

    public static void drawingRectangle(int height, int width) {

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
