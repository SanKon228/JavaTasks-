package org.KNUJavaLabs.Vitya.lab6;
class Newclass{
    protected int x = 2;
    protected void foo(int y){
        x = 5 + y;
        System.out.printf("result: %d\n", x);
    }
}
public class T1_4 {
    public static void main(String[] args){
        Newclass newclass = new Newclass();
        newclass.foo(5); 
    }
}
