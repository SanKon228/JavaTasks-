import java.math.BigDecimal;
import java.math.RoundingMode;
public class Task4_1{
    public static void main(String[] args){
        BigDecimal num1=new BigDecimal("8647");
        BigDecimal num2=new BigDecimal("9000");

        BigDecimal num3 = num1.divide(num2, 2,RoundingMode.HALF_DOWN);
        System.out.println(num3);
    }
}