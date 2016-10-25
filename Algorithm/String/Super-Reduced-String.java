/*
* HACKER RANK -> ALGORITHM -> STRING
* Super Reduced String Problem 
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner (System.in);
        StringBuilder s = new StringBuilder(in.next());
       
        for(int i = 1 ; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                s.delete(i-1,i+1);
                i=0;   
            }
        }
        
        if(s.length() == 0)
            System.out.println("Empty String");
        else
            System.out.println(s);
    }
}
