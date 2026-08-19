import java.util.Scanner;

public class prime_no {
    static void prime(int n, int ctr){
        for(int i = 1; i<=n; i++){
            if (n%i == 0) {
            ctr++;
        }
        }
        if (ctr == 2) {
            System.out.println("Prime.");
        }
        else {
            System.out.println("Not Prime.");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int N = sc.nextInt();

        prime(N, 0);
        sc.close();
    }
}
