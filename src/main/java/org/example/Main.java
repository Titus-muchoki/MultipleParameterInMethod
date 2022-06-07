package org.example;

public class Main {
    static void myName(String name, int num){
        System.out.println(name+ "is " +num);
    }
    static void myCity(String city, int address){
        System.out.println(city+ "" +address);
    }
    static int myNumber(int y){
        return y+4;
    }
    public static void main(String[] args) {
        myName("tito ",22);
        myName("kajela",8444);
        myCity("nairobi ",1824);
        System.out.println(myNumber(10));

    }
}
