import java.util.Scanner;

public class Good_Turn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int runsRequired = sc.nextInt();
        int oversRemaining = sc.nextInt();
            int ballsRemaining = oversRemaining * 6;
        int maxRuns = ballsRemaining * 6;

        if (maxRuns >= runsRequired) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        }
    }
}
