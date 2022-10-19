import java.util.Scanner;
class Dz2_4{  
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a1 = in.nextDouble();
        double a= 9.0 * (a1 / 5.0) + 32;
        System.out.printf("%2f  \n", a);
        in.close();
    }
}