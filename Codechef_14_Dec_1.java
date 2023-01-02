import java.util.Scanner;

public class Codechef_14_Dec_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            if(n < 4){
                System.out.println("MILD");
            }
                else if(n >= 4 && n < 7){
                    System.out.println("MEDIUM");
            }
                else{
                    System.out.println("HOT");
                }
        }
    }
}
