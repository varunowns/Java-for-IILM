import java.util.Scanner;

public class printReversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements of an array : ");

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Printing in reverse order : ");

        for (int i = n-1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
