import java.util.Scanner;
public class Simplecalculator{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number(num1):");
        double num1=scanner.nextDouble();
        System.out.println("Enter the second number(num2):");
        double num2=scanner.nextDouble();
        double sum=num1+num2;
        double diff=num1-num2;
        double prod=num1*num2;
        double div1=num1/num2;
        long div2=(long)num1/(long)num2;
        double rem1=num1%num2;
        double exp1=Math.pow(num1,num2);
        System.out.println("Sum="+sum);
        System.out.println("Difference="+diff);
        System.out.println("Product="+prod);
        System.out.println("Decimal Division="+div1);
        System.out.println("Quotient="+div2);
        System.out.println("Remainder="+rem1);
        System.out.println("Exponentiation="+exp1);
        scanner.close();
        
        
    }
    
}