package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) 
	{    
          System.out.println("enter the value of a ");
          int a=Utility.getInt();
          System.out.println("enter the value of b ");
          int b=Utility.getInt();
          System.out.println("enter the value of c");
          int c=Utility.getInt();
          int delta =(b*b)-4*a*c;
          int root1=(int)(-b+Math.sqrt(delta))/(2*a);
          int root2=(int)(-b-Math.sqrt(delta))/(2*a);
         System.out.println("first root of the equation is "+root1);
         System.out.println("second root of the equation is "+root2);
          
	}

}
