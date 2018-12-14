package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Triplets {

	
	public static void main(String[] args) 
	{System.out.println("enter the number of array elements");
	int n=Utility.getInt();
	int [] arr=new int[n];
	System.out.println("enter the "+n+"array elements");
	for (int i = 0; i < arr.length; i++) 
	{
		arr[i]=Utility.getInt();	
	}
	System.out.println("the entered array elements are");
	for (int i = 0; i < arr.length; i++) 
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	for (int i = 0; i < arr.length; i++) 
	{
		for (int j = i+1; j < arr.length; j++) 
		{
			for (int k = j+1; k < arr.length; k++) 
			{
				if(arr[i]+arr[j]+arr[k]==0)
					System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
				
			}
		}
	}
	}

}
