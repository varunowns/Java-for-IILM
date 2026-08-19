import java.util.Scanner;

public class countDigitsinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements of an array : ");

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int ctr0 = 0;
        int ctrpositive = 0;
        int ctrnegative = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                ctr0++;
            } else if (arr[i] > 0) {
                ctrpositive++;
            } else {
                ctrnegative++ ;
            }
        }
        System.out.println("Total Psitive no : " + ctrpositive);
        System.out.println("Total Negative no : " + ctrnegative);
        System.out.println("Total Zero's no : " + ctr0);
        sc.close();
    }
}
