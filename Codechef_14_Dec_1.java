import java.util.Scanner;

public class Codechef_14_Dec_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            if(n < 3){
                System.out.println("LIGHT");
            }
                else if(n >= 3 && n < 7){
                    System.out.println("MODERATE");
            }
                else{
                    System.out.println("HEAVY");
                }
        }
    }
}
