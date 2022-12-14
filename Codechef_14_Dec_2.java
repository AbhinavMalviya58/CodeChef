import java.util.Scanner;

public class Codechef_14_Dec_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- != 0){
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
            if(A != B && B != C && C != A){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
    }

    }
}