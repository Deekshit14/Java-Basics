package Binary_operators;

import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(magical_num(n));    
    }    

    public static int magical_num(int n)
    {
        int sum = 0;
        int base = 5;
        while (n > 0)
        {
            int last = n & 1;
            sum += last * base;
            n = n>>1;
            base *= 5;
        }
        return sum;
    }
}
