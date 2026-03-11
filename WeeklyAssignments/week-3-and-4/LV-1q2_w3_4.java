import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1, number2, number3: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        boolean isFirstSmallest = (n1 < n2 && n1 < n3);
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
        sc.close();
    }
}