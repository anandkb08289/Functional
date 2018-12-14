package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Leap_Year {

	public static void main(String[] args) 
	{
           String yyyy=Utility.getString();
           if(yyyy.length()<4||yyyy.length()>4)
           {
        	   System.out.println("enter the four digit year");
           }
           else
           {
        	   int yr=Integer.valueOf(yyyy);
        	   if(yr%4==0&&yr%100!=0 ||yr%400==0)
        	   {
        		   System.out.println(yr+" is leap year");
        	   }
        	   else
        		   System.out.println(yr+"is not  leap year");
           }
	}

}
