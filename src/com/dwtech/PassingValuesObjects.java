package com.dwtech;

public class PassingValuesObjects {

    void updateValue(Student s1){
        s1.age = 21;
    }

    public static void main (String[] args){
        Student s = new Student();
        s.age = 20;
        PassingValuesObjects pvo = new PassingValuesObjects();
        pvo.updateValue(s);
        System.out.println(s.age);// Value is changed to 21
    }
}
