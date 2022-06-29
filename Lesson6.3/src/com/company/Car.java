package com.company;

public class Car {
    private int year;
    private String color;

    public static int carCounter;
    public static int methodCounter;


    public Car() {
        carCounter++;
    }

    public int getYear() {
        methodCounter++;
        return year;
    }

    public void setYear(int year) {
        methodCounter++;
        this.year = year;
    }

    public String getColor() {
        methodCounter++;
        return color;
    }

    public void setColor(String color) {
        methodCounter++;

        this.color = color;
    }

    public static void addition( int num1, int num2){
        methodCounter++;

        System.out.println(num1 + num2);
    }

}
