import java.util.Scanner;

public class T3_1_2 {
    public static void main(String[] args) {
        String input;
int count;
Scanner keyboard = new Scanner(System.in);
input = keyboard.next();

String[] strarray = input.trim().split("\\s");
int intarray[] = new int[strarray.length];

for (count = 0; count < intarray.length ; count++) {
    intarray[count] = Integer.parseInt(strarray[count]);
}
int j = 0;
for (int i = 0; i <  intarray.length; i++){
    System.out.printf("%d \n",j);
    j+=intarray[i];
}
}
}