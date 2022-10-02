package com.dwtech;

public class PassingValuesPrimitives {

    void updateId(int id){
        id = 1001;
    }

    public static void main (String[] args){
        int id = 1000;
        PassingValuesPrimitives pv = new PassingValuesPrimitives();
        pv.updateId(id);
        System.out.println(id);// Value stays 1000
    }
}
