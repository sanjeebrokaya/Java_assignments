import java.util.Scanner;

public class printingWeekdays {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the number between 1 and 7");
        int day=input.nextInt();
        String dayName;

        switch (day) {

            case 1:             
            dayName = "Sunday"; 
            break;

            case 2: 
            dayName = "Monday"; 
            break;
            
            case 3: 
            dayName = "Tuesday"; 
            break;

            case 4: 
            dayName = "Wednesday"; 
            break;

            case 5: 
            dayName = "Thursday"; 
            break;

            case 6: dayName = "Friday"; 
            break;

            case 7: dayName = "Saturday"; 
            break;
            
            default:
            dayName = "Invalid day range";
        }
        System.out.println("you have choosed "+dayName);
    }
}
