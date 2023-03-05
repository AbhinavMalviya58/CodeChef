import java.util.*;
public class Overspeeding_Fine_16_JAN_2023 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner scr = new Scanner(System.in);
            int t = scr.nextInt();
            while(t-- != 0){
                    int x = scr.nextInt();
                    if(x <= 70){
                        System.out.println("0");
                    }
                    else if(x <= 70 && x < 100){
                        System.out.println("500");
                    }
                    else{
                        System.out.println("2000");
                    }
            }
	}
}



/*
        speed X km/hour
            input        output
            7           
            40           0
            110          2000
            70           0
            100          500
            69           0
            101          2000
            85           500
*/