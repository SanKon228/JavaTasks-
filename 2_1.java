import java.util.Scanner;
class Dz2_1{  
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.printf("Hello %s  \n", name);
        in.close();
}
}
