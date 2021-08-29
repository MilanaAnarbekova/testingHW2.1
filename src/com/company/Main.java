package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(walking(20, 30));
        System.out.println(walking(15, 25));
        System.out.println(walking(50, -1));
        // доп дз:
        System.out.println("Можно ли идти гулять?" +" если мне " + generateRandomAge(5 ,80) + " лет");
        System.out.println("Можно ли идти гулять?" +" если мне " + generateRandomAge(1,100) + " лет");
        System.out.println("Можно ли идти гулять?" +" если мне " + generateRandomAge(10 ,20) + " лет");

    }
    //Основное задание :
    public static String walking(int age, int temp) {
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
//доп дз:
    public static int generateRandomAge(int age1, int age2) {
        int randomAge = age1 + (int) (Math.random() * age2 );
        return randomAge;
    }
}
