import java.util.*;

class student {
    String name, address;
    int rollNumber;
    long mobileNum;

    // Default Constructor
    student() {
        name = "";
        address = "";
        rollNumber = 0;
        mobileNum = 0;
    }

    // Method to take input
    void input_data() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of student : ");
        name = sc.nextLine();

        System.out.println("Enter the address of student : ");
        address = sc.nextLine();

        System.out.println("Enter the mobile number of student: ");
        mobileNum = sc.nextLong();

        System.out.println("Enter the roll number of student: ");
        rollNumber = sc.nextInt();

        sc.close();
    }

    // Method to display data
    void display_data() {
        System.out.println("Name of the student is : " + name);
        System.out.println("Address of the student is : " + address);
        System.out.println("Roll number of the student is : " + rollNumber);
        System.out.println("Mobile number of the student is : " + mobileNum);
    }

    public static void main(String args[]) {
        student obj = new student();

        obj.input_data();
        obj.display_data();
    }
    
}