/*
* HACKER RANK -> ALGORITHM -> STRINGS
* Alternating Characters Problem 
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            String test = in.next();
            int count=0;
            for (int j = 0; j < test.length()-1; j++) {
                if(test.charAt(j)==test.charAt(j+1))
                    count++;
            } 
            System.out.println(count);
        }
    }
}
