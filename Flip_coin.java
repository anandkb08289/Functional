package org.bridgelabz.functional;
import java.util.*;
public class Flip_coin {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of times to flip the coin");
		int N=sc.nextInt();
		Random rn =new Random(1);
		float head=0;
		float tail=0;
		float r=0;
		for (int i = 0; i < N; i++) 
		{
			r=rn.nextFloat();
			if(r>0.5)
			{
				head++;
			}
			else
			{
				tail++;
			}
		}
		float hp=(head/N)*100;
		float tp=(tail/N)*100;
		System.out.println("the percentage of head appearing is "+hp);
		System.out.println("the percentage of tail appearing is "+tp); 
		sc.close();
	}
}
