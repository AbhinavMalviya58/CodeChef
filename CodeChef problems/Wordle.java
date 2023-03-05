import java.util.Scanner;

public class Wordle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            char[] S = sc.next().toCharArray();
            char[] T = sc.next().toCharArray();
            // int Z = S.length();
            for(int i = 0; i < 5; i++){
                if(S[i] == T[i]){
                    System.out.println("G");
                }
                else{
                    System.out.println("B");
                }
            }
            System.out.println();
        }
    }
}