package Binary_operators;

// Question: Set the ith bit to zero

import java.util.Scanner;
public class Set_ith_bit {
    public static void main(String[] args) {
        int num = 19;  // 10011 in bit form
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the ith bit to find");
        int i = s.nextInt();
        System.out.println(Set_ith_bit(num, i));
        // Output will be 23 when it is provided ith bit is given 3, i.e (10011 to 11011) after setting ith bit
    }   

    public static int Set_ith_bit(int num, int i)
    {
        return num | (1 << (i-1));
    }
}
