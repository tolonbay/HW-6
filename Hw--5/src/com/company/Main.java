package com.company;



public class Main {

    public static void main(String[] args) {

    Boss sample = new Boss(300,30,"Magic");

        System.out.println(sample.getBossHealth());
        System.out.println(sample.getBoosDamage());
        System.out.println(sample.getBossDefenceType());

        createHeroes();
        System.out.println();

    }
    // Дополнителное задание
    public static int createHeroes(){
        Hero hero1 = new Hero (200,20);
        Hero hero2 = new Hero(100,10);
        Hero hero3 = new Hero(50,5);
        int array ={hero1, hero2, hero3};

        return array;


    }
}
