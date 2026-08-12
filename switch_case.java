import java.util.*;
// Write a menu driven program that allows useer to enter five numbers and 
// then choose b/w finding the smallest, largest and sum of avg. 
// Use switch case to determine what action to take. Provide error message if an invalid choice is entered.
public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter five numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        
        System.out.println("-----------MENU----------- ");
        System.out.println("1 Smallest\n2 Largest\n3 Sum\n4 Average ");
        
        System.out.println("Enter your choice : ");
        int ch = sc.nextInt();
        int sum=0;
        switch(ch) {
            case 1: {
                int smallest = Math.min(Math.min(Math.min(num1, num2), Math.min(num3, num4)), num5);
                System.out.println("Smallest = " + smallest);
                break;
            }
            case 2: {
                int largest = Math.max(Math.max(Math.max(num1, num2), Math.max(num3, num4)), num5);
                System.out.println("Largest = " + largest);
                break;
            }
            case 3: {
                sum = num1 + num2 + num3 + num4 + num5;
                System.out.println("Sum = " + sum);
                break;
            }
            case 4: {
                double avg = sum/5.0;
                System.out.println("Average = " + avg);
                break;
            }
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
