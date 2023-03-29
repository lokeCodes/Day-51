// https://www.codechef.com/problems/LOOP
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
		    int icp = s.nextInt();
		    int fcp = s.nextInt();
		    int m = s.nextInt();
		    int r1 = Math.abs(icp-fcp);
            
            if(r1 > (m/2)){
                System.out.println(m-r1);
            }else{
                System.out.println(r1);
            }
		}
	}
}
