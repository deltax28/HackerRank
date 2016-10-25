/*
* HACKER RANK -> ALGORITHM -> STRINGS
* Beautiful Binary String Problem 
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        System.out.println((B.length() - B.replaceAll("010", "").length())/3);
    }
}
