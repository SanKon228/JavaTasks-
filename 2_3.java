import java.util.Scanner;
import java.lang.Math;
class Dz2_3{  
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 2 numbers: ");
        String string = in.nextLine();
        String[] parts = string.split(" ");
        String part1 = parts[0]; 
        String part2 = parts[1];
        int a=Integer.parseInt(part1);
        int b=Integer.parseInt(part2);
        double a1 =a*b;
        double res = Math. sqrt(a1);
        System.out.printf("%.2f",res);
        in.close();
    }
    }
