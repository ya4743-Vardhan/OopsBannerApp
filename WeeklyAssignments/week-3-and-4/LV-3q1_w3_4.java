import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("The program only works for years >= 1582.");
        } else {
            // Part A: Using multiple if-else
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }

            // Part B: Using single if with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Confirmed: " + year + " is a Leap Year");
            }
        }
        sc.close();
    }
}