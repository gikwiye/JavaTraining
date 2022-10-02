package com.dwtech;

public class Main {
    public static void main(String[] args) {


        CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();

        ExchangeRate er = new ExchangeRate();
        er.printCurrencies();

        Student s1 = new Student();
        s1.age = 12;
        Student s2 = new Student();
        s2.age = 34;
        Student s3 = new Student();
        s3.age = 55;

        Student [] students = {s1,s2,s3};

        Student temp = students[0];
        students[0] = students[2];
        students[2] = temp;

        System.out.println(students[0].age);
        System.out.println(students[2].age);


    }
}