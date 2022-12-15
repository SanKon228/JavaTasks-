package org.KNUJavaLabs.Vitya.lab10;
public class T1_6 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Some sample string |||| ");
        String another = "that we use to ilustrate the methods of class StringBuffer";
        sb.append(another);
        System.out.println("Modified string: ");
        System.out.println(sb);
    }
}
