// https://www.codechef.com/problems/FLOW005
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
            int x = s.nextInt();
            int denom=0;
            
		    if(x<=1000000 && x>=1){
	            if(x>=100){
	                denom = denom + x/100;
	                x=x%100;
	            }

	        
	            if(x<100 && x>=50){
	                denom=denom+x/50;
	                x=x%50;
	            }

	            if(x<50 && x>=10){
	                denom=denom+x/10;
	                x=x%10;
	            }

	            if(x<10 && x>=5){
	                denom=denom+x/5;
	                x=x%5;
	            }

	            if(x<=4 && x>1){
	                denom=denom+x/2;
	                x=x%2;
	            }

	            if(x==1){
	                denom=denom+1;
	            }
	        
		        System.out.println(denom);
		    }
        }
	}
}
