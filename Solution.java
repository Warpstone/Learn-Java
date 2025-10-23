

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
       try (Scanner console = new Scanner(System.in)) {
		int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        
        Boolean chi = (a == b);
        Boolean chis = (b == c);
        Boolean chisl = (a == c);
        
        if (chi)
        	System.out.println(a + " " + b);
        else
        	System.out.println(a);
            if (chis)
            	System.out.println(b + " " + c);           
            if (chisl)
                System.out.println(a + " " + c);
                else
                System.out.println(c);
            
        
	   }
    }
}
