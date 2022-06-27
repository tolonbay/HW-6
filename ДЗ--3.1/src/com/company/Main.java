package com.company;

public class Main {

    public static void main(String[] args) {
        double[] array = {-2.3, -3.1, 8.5, 6.1, 5.7};
        double sum = 0;
       // double avarage = 0;

            for (double s : array) {
                if (s > 0) { sum = sum + s; }

                System.out.println(sum / array.length);
            }

    }


}