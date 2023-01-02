import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef_14_Dec_3 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            
            Arrays.sort(arr); // SORT THE GIVEN ARRAY FOR COMPARISON
            
            int opr = 0; // REQUIRED NO OF OPERATIONS
            
            boolean pos = true; // POSSIBILITY TO CONVERT THE GIVEN ARRAY
            for (int i = 1; i <= n; i++) {
                // if: arr[cur] > permute[cur] then conversion not possible.
                if (arr[i - 1] > i) {
                    pos = false;
                    break;
                }
                // if: arr[cur] < permute[cur] then find the diff and opr++ accordingly.
                else if (arr[i - 1] < i) {
                    int dif = i - arr[i - 1]; // calculation of difference
                    opr += dif;
                }
            }
            // PRINT -1 IF CONVERSION NOT POSSIBLE
            if (pos == false) {
                System.out.println(-1);
                continue;
            }
            // OTHERWISE PRINT REQ NO OF OPERATIONS
            System.out.println(opr);
        }
    }
}