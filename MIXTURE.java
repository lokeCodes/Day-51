// https://www.codechef.com/problems/MIXTURE
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-- > 0){
	        int a = s.nextInt();
	        int b = s.nextInt();
	        if(a==0){
	            System.out.println("Liquid");
	        }else if(b==0){
	            System.out.println("Solid");
	        }else{
	            System.out.println("Solution");
	        }
	    }
	}
}
