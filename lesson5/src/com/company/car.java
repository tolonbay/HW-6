package com.company;

public class car {
    // Поля нашего класса
    public int year;
    public String model;
    public double volume;
    //Конструкторы по умолчанию
    public car(){

    }
    // конструкторы
    public car(int year, String model, double volume) {
        this.year = year;
        this.model = model;
        this.volume = volume;
    }
    public car( String model, double volume) {
        this.model = model;
        this.volume = volume;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // методы
   public void makeSignal(){
       System.out.println(this.model + "БИИП");
   }
   public void move (String city){
       System.out.println( "Машина  " + this.model + "  поехала в город" + city);
   }

}
