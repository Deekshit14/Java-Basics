package Binary_operators;

// This is used to reset ith bit to zero
import java.util.Scanner;
public class reset_ith_bit {
    public static void main(String[] args) {
        int num = 6;  // 110 in bit form
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the ith bit to find");
        int i = s.nextInt();
        System.out.println(find_ith_bit(num, i));
        // The answer would be 4 i.e, (110 to 100) when ith bit is given 2
    }

    public static int find_ith_bit(int num, int i)
    {
        return num & (~(1 << (i-1)));
    }
}
