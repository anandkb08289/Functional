/*
 * 
 */
package org.bridgelabz.utility;

import java.util.Scanner;

public class Utility 
{ static  Scanner sc=new Scanner(System.in);
   
    //this method is used to get integer type value from the user
    
	public static int getInt()
	{ 
		System.out.println("enter the number");
		int i=sc.nextInt();
		return i;
	}
	 //this method is used to get double type value from the user
	public static double getDouble()
	{
		System.out.println("enter the number");
		double i=sc.nextDouble();
		return i;
	}
	 //this method is used to get string type value from the user
	public static String getString()
	{
		System.out.println("enter the string");
		String i=sc.next();
		return i;
	}
	 //this method is used to get float type value from the user
	public static float getFloat()
	{
		System.out.println("enter the number");
		float i=sc.nextFloat();
		return i;
	}
	/*
	 * this method returns whether the passed string is anagram or not
	 * @param string s1
	 * @param string s2
	 */
	public static boolean isAnangram(String s1,String s2)
	{
		int[] c1=countAlp(s1);
		int[] c2=countAlp(s2);
		for (int i = 0; i < 26; i++) 
		{
			if(c1[i]!=c2[i])
			{
				return false;
			}
		}
		return true;
	}
	/*
	 * this method returns the count of alphabets present in the string
	 * @param String s
	 */
	public static int[] countAlp(String s)
	{
		int[] arr=new int[26];
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				arr[ch-65]++;
			}
			if(ch>='a'&&ch<='z')
			{
				arr[ch-97]++;
			}
		}
		return arr;
	}
	/*
	 * this method returns whether the passed string is panagram is not
	 * @param string s
	 */
	
	public static boolean isPanagram(String s)
	{
		int[] c1=countAlp(s);
		for (int i = 0; i < 26; i++) 
		{
			if(c1[i]>=1)
			{
				return true;
			}
		}
		return false;
	}
	/*
	 * this method calculates the power of number and return it
	 * @param it takes base as b
	 * @param it takes power as p
	 */
	
	public static int power(int b,double p)
	{
		int pw=1;
		while(p>0)
		{
			pw=b*pw;
			p--;
		}
		return pw;
	}
	private void permute(String str, int l, int r) 
	{ 
		if(l==r)
			System.out.println(str);
		else
		{
			for (int i = l; i <=r; i++)
			{
				str=swap(str,l,i);
				permute(str,l+1,r);
				str=swap(str,l,i);
			}
		}
           		
	}
    /*
     * this method returns the swapped string 
     * @param it takes string as input
     * 
     */
	public static String swap(String str, int i, int j) 
	{
		char temp;
		char[] ch=str.toCharArray();
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;

		return String.valueOf(ch);
	}
	/*
	 * this method returns the two dimensional array
	 * @param number of rows is m
	 * @param number of columns is n
	 */
	public static int[][] getTwoDArray()
	{
		 System.out.println("enter the number of rows");
	        int m=Utility.getInt();
	        System.out.println("enter the number of columns");
	        int n=Utility.getInt();
	        int[][] arr=new int[m][n];
	        System.out.println("enter the array elements");
	        
	         //this loop is to store user input into two dimensional array
	        
	        for (int i = 0; i < m; i++) 
	        {
	        	for (int j = 0; j < n; j++) 
	        	{
					arr[i][j]=sc.nextInt();
				}
	        	System.out.println();
				
			}
	        System.out.println("the entered array elements are");
	        //this loop is to dispaly the two dimensional array elements
	        for (int i = 0; i < m; i++) 
	        {
	        	for (int j = 0; j < n; j++) 
	        	{
					System.out.print(arr[i][j]+" ");
				}
	        	System.out.println();
				
			}
	        return arr;
	}
	
}


