import java.util.Scanner;

public class masterchefFinals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int rank = sc.nextInt();
                if(rank > 10){
                    System.out.println("no");
                }
                else{
                    System.out.println("yes");
                }
        }
    }
}
