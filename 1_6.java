import java.util.Scanner;
class Dz1_6{  
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1: ");
        float  one = in.nextFloat();
        System.out.print("Input 2: ");
        float two = in.nextFloat();
        System.out.print("Input 3: ");
        float three = in.nextFloat();
        float res=one + two + three;
        System.out.printf(" %.2f +  %.2f + %.2f = %.2f \n", one, two, three,res);
        in.close();
}
}