import java.util.*;
class Swap
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Before swap: a=" + a +", b = " + b);
        int t = a;
        a = b;
        b = t;
        System.out.println("After swap: a = " + a + ", b = " + b);
        sc.close();
    }
}