package com.box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {

        float length;
        float width;
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter object's length:");
        length = scanner.nextFloat();
        System.out.print("Please enter object's width:");
        width = scanner.nextFloat();
        System.out.print("Please enter object's height:");
        height = scanner.nextInt();

        Box3 box3 = new Box3(23,14,13);
        Box5 box5 = new Box5(39.5f, 27.5f,23);

        if(box3.validate(length,width,height)){
            System.out.println("Box3");
        } else if(box5.validate(length,width,height)){
            System.out.println("Box5");
        } else {
            System.out.println("Out of Size!!!");
        }

    }
}
