package com.company;

public class Statistica {
    private Dato[] Arr=new Dato[10];
    private int count;
    Statistica(Dato[] Arr,int count){
        this.Arr=Arr;
        this.count=count;
    }
    public Dato[] getArr(Dato[] Arr){
        return Arr;
    }
    public int getCount(int count){
        return count;
    }
}