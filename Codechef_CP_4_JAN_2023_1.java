import java.util.Scanner;

public class Codechef_CP_4_JAN_2023_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int c = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if( (a+b) == c )
                System.out.println("Yes");
            else
                System.out.println("No");
        }   
    }
}
