import java.util.*;
public class Loops {
    //FOR LOOP 
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     for(int i=0;i<n;i++)
    //     {
    //         System.out.println(i);
    //     }
    // }
    // //WHILE LOOP 
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int i=0;
    //     int n=sc.nextInt();
    //     while(i<n){
    //         System.out.println(i);
    //         i++;
    //     }
    // }
    //DO WHILE
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int n=sc.nextInt();
        do{
            i++;
            System.out.println(i);
        }while(i<n);
    }
    
}
