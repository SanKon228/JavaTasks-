import java.util.Scanner;
class Dz2_2{  
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        String a = in.nextLine();
        int a1 = a.length();
        System.out.print("Input a: ");
        String b = in.nextLine();
        int b1 = b.length();
        System.out.printf("a - %d, b - %d  \n", a1,b1);
        in.close();
        float a11 = a1;
        float b11 = b1;
        double res = 2.0 / (1 / a11) + (1 / b11);
        System.out.printf("%2f  \n", res);
    }
    }
