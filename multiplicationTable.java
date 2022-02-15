import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for multiplication");
        double num= input.nextDouble();

        System.out.println("The multiplication table of "+num+" is given below");
        for(int i=0;i<=10;i++){
            double result=num*i;
            System.out.println(num+" * "+i+" = "+result);

        }

    }
}
