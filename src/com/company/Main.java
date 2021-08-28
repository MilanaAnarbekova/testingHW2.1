package com.company;

public class Main {
//Основное задание :
    public static void main(String[] args) {

        walking(20,30 ,"go go ");
        walking(15,38 ,"haha");
        walking(50,20 ,"hehe");
        walking(19,10 ,"hihi");
        walking(27,-2 ,"hoho");

    }

    public static int walking(int age, int temp , String text) {
        if ((age >= 20 && age <= 45) && (temp >= -20 && temp <= 30)) {
            System.out.println("можно  идти гулять :)");
        } else if (age < 20 && (temp >= 0 && temp <= 28)) {
            System.out.println("можно идти гулять <3");
        } else if (age > 45 && (temp >= -10 && temp <= 25))
            System.out.println("можно идти гулять");
        else
            System.out.println("останься дома :(");
        return 0;
    }
}