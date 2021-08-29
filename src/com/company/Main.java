package com.company;

public class Main {
//Основное задание :
    public static void main(String[] args) {

        System.out.println( walking(20,30 ));
        System.out.println( walking(15,25 ));
        System.out.println( walking(50,-1 ));

    }

    public static String walking(int age, int temp ) {
        if ((age >= 20 && age <= 45) && (temp >= -20 && temp <= 30)) {
            return "Можно идти гулять!";
        } else if (age < 20 && (temp >= 0 && temp <= 28)) {
            return "Можно идти гулять";
        } else if (age > 45 && (temp >= -10 && temp <= 25)) {
            return "Можно идти гулять :)";
        } else {
            return "Останься дома :(";
        }
    }

    }
