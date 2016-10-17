/*HACKER RANK -> ALGORITHM -> IMPLEMENTATION
Repeated String Problem */

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int a_count = count_a(s, 0, s.length());
		long d = n / s.length();
        long r = n % s.length();
        
        if (s.length() == 1 && a_count>0)
        	System.out.println(n);
        else if (r==0)
        	System.out.println(d*a_count);
        else{
        	int subCount = count_a(s,0,(int) r);
        	System.out.println(d*a_count + subCount);
        }
	}
	
	private static int count_a(String s, int start, int end){
		int count=0;
		for(int i = start; i < end; i++){
			if(s.charAt(i) == 'a')
				count ++;
		}
		return count;
	}
}
