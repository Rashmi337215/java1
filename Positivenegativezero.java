import java.util.Scanner;
public class Positivenegativezero{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        double number=scanner.nextDouble();
        if(number>0){
            System.out.println(number+"is a positive number");
        }else if(number<0){
            System.out.println(number+"is a negative number");
        }else{
            System.out.println("The number is zero");
        }
        scanner.close();
            
        }
}        