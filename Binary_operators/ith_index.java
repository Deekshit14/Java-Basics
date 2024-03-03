package Binary_operators;
import java.util.Scanner;
public class ith_index {
    public static void main(String[] args) {
        int num = 182;  // 10110110 in bit form
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the ith bit to find");
        int i = s.nextInt();
        System.out.println(find_ith_bit(num, i));
    }

    public static int find_ith_bit(int num, int i)
    {
        return num & (1 << (i-1));
    }
}
