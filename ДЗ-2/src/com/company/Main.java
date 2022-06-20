package com.company;


public class Main {



    public static void main(String[] args) {
    walkingOut(25,15);
    walkingOut(20,29);
    walkingOut(19,20);
    walkingOut(30,25);
    walkingOut(50,-11);
    }

    public static String walkingOut( int age, int temperature ) {
        if(age > 20 && age < 45 && temperature > -20 && temperature < 30 ) {
            System.out.println("Можно идти гулят");
        }
        if(age < 20 && temperature > 0 && temperature < 28){
            System.out.println("Можно идти гулят");
        }
        if(age > 45 && temperature > -10 && temperature < 25){
            System.out.println("Можно идти гулят");
        }
        else {
            System.out.println("Оставайтесь дома");

        }
        return "Можно идти гулят";
    }

}

