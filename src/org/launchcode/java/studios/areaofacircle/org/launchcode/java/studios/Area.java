package org.launchcode.java.studios.areaofacircle.org.launchcode.java.studios;

import  java.util.Scanner;

public class Area {

    public static void main(String[] args) {
    Area areaOfCircle = new Area();
    areaOfCircle.calculateAreaOfCircle();
    }

    public void  calculateAreaOfCircle() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");

        Double myCircleRadius = input.nextDouble();

        //Double pi = 3.14;
        //area is pi * r * r;
        Double area = Circle.getArea(myCircleRadius);

        System.out.println("The area of a circle of radius " + myCircleRadius.toString() + " is: " + area.toString());
    }

}
