package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Power_Two {

	public static void main(String[] args) 
	{
		int n=Utility.getInt();
		int res=Utility.power(2, n);
		System.out.println(res);
		for (int i=1;i<=n;i++)
		{    int r=Utility.power(2, i);
		if(r<=res)
			System.out.println(Utility.power(2, i));


		}
	}

}
