import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println("Enter a numbers: ");

        Scanner x = new Scanner(System.in);

        int number = x.nextInt();

        if( number%5==0 && number%3==0){
            System.out.println("BIZZFIZZ");
        }
        else if(number%5==0){
            System.out.println("FIZZ");
        }
        else if(number%3==0){
            System.out.println("BUZZ");
        }
        else {
            System.out.println(number+" is not divisible by 3 and 5.");
        }
    }
}
