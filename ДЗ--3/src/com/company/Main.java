package com.company;

public class Main {

    public static void main(String[] args) {

        double[] array = new double[]{-2.3, -3.1, 8.5, 6.1, 5.7};
        double sum = 0;
        double average =0;
        if(array.length >0){
            for (int j = 0; j < array.length; j++) {sum+= array[j];} average= sum/array.length; }
       for (int i = 0; i < array.length; i++) {
            if (i > 0)
                sum += 1;
                
            sum = sum + array.length;
        }
        System.out.println(sum);
       System.out.println(average);
    }
}

