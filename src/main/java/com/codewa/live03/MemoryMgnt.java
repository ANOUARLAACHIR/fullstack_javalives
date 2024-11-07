package com.codewa.live03;

import java.awt.Point;

public class MemoryMgnt {
    public static void main(String[] args) {
        //primitive types hold the actual value
        int x = 1;
        int y = x;
        x = 2;
        System.out.println("primitives : x = " + x + ", y = " + y);

        //reference types hold the address to the actual object, not the object itself
        Point point1 = new Point(1, 2);
        Point point2 = new Point(2, 2);
        point2.x = 3;
        System.out.println("point1 : " + point1);
        System.out.println("point2 : " + point2);
    }
}
