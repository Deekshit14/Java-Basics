package Binary_operators;
import java.util.Scanner;
public class is_Even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        System.out.println(check(num));

    }

    public static boolean check(int num)
    {
        return (num & 1) == 0;
    }
}