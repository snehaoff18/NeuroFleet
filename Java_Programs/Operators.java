import java.util.*;
public class Operators {
    //Arithmetic operators
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     System.out.println("a + b "+(a+b));
    //     System.out.println("a - b "+(a-b));
    //     System.out.println("a * b "+(a*b));
    //     System.out.println("a / b "+(a/b));
    //     System.out.println("a % b "+(a%b));
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //BASIC BITWISE OPERATORS 
        System.out.println("a & b "+(a & b)); //  AND 0 & 1=0
        System.out.println("a | b "+(a | b));//  OR 0 | 1 =1
        System.out.println("a ^ b "+(a ^ b));//  XOR same bits 0 , diff bits 1
        System.out.println("~a "+(~a)); //NOT compliment of a
        
        //SHIFT OPERATORS 
        System.out.println("a << b "+(a<<b));// LEFT SHIFT (a * 2^b)
        System.out.println("a >> b "+(a>>b));// RIGHT SHIFT (a /2^b) 
    }
    
}
