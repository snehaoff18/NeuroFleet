import java.util.*;
public class Conditions {
    //IF ELSE

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int age=sc.nextInt();
    //     int weight=sc.nextInt();
    //     if(age>=18 && weight>=40)
    //     {
    //         System.out.println("Yes this person can vote");
    //     }
    //     else{
    //         System.out.println("No this person cant vote ");
    //     }
    // }

    //IF ELSEIF
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     if(n>0)
    //     {
    //         System.out.println("Positive");
    //     }
    //     else if (n==0)
    //     {
    //         System.out.println("Zero");
    //     }
    //     else if(n<0)
    //     {
    //         System.out.println("Negative");
    //     }
    //     else{
    //         System.out.print("Invalid");
    //     }
    // }
    //SWITCH CASE
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String day=sc.nextLine();
        switch(day){
            case "Mon","Tue","Wed","Thu","Fri":
                System.out.println("Weekday");
            case "Sat","Sun":
                System.out.println("Weekend");
        }
    }
}