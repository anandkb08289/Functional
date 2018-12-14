package org.bridgelabz.functional;
import org.bridgelabz.utility.*;
public class HarmonicNumber 
{

	public static void main(String[] args) 
	{
        int N=Utility.getInt();
        System.out.println(N);
        double sum=0;
        for (double i = 1; i <=N; i++) 
        	{
    			sum=sum+1/i;
    			
    		}
        System.out.println("the "+ N +" harmonic number is "+ sum);
	}

}
