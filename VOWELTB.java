// https://www.codechef.com/problems/VOWELTB
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		char in = s.next().charAt(0);
		char arr[] ={'A','E','I','O','U'};
		for(int i=0;i<arr.length;i++){
		    if(in==arr[i]){
		        System.out.println("Vowel");
		        break;
		    }else if(i==arr.length-1){
		        System.out.println("Consonant");
		    }
		    
		}

		
	}
}
