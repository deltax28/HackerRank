/*
* HACKER RANK -> ALGORITHM -> STRINGS
* Panagrams Problem
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); 
        String s = scan.nextLine(); 
        int[] a = new int[26]; 
        int counter = 0; 
        for (int i = 0; i < s.length(); i++){ 
            char c = Character.toLowerCase(s.charAt(i)); 
            int index = c - 'a'; 
            if(index >=0 && index < 26) { 
                if (a[index] == 0) { 
                    a[index] = 1; 
                    counter++; } 
            } 
        }
        String sol = counter == 26 ? "pangram" : "not pangram";
        System.out.println(sol);
    }
}
