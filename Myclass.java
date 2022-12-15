package org.KNUJavaLabs.Vitya.lab6;

public class Myclass {
    public static void print(){
        System.out.print("Hello!");
    }
    

    private static void prPrint(){ 
        System.out.printf("Hello! Its private method"); 
    }
    

    protected static void protecPrint(){ 
        System.out.printf("Hello! Its protected method"); 
    }
    

    void defPrint(){
        System.out.printf("Hello! Its default method");
    }
}