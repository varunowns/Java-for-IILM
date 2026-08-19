import java.util.Scanner;

public class reverseArray {

    static void reverse1(int arr[], int left, int right){
        if (left>=right) {
            return;
        }
        int temp =  arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse1(arr, left+1, right-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        
        int arr1[] = new int[n];

        System.out.println("Enter elements of Array : ");
        
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        reverse1(arr1, 0, n-1);
        System.out.print("Reversed array : ");

        for(int i = 0; i < n; i++){
            System.out.print(arr1[i] + " ");
        }
        sc.close();
        
    }
}
