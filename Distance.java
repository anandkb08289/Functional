package org.bridgelabz.functional;

public class Distance {

	public static void main(String[] args) 
	{
      int x=Integer.parseInt(args[0]);
      int y=Integer.parseInt(args[1]);
      double x1=Math.pow(x, x);
      double x2=Math.pow(y, y);
      double res=x1+x2;
     
      double d=Math.pow(res, 0.5);
      System.out.println("the distance between the two points is :"+d);
      
	}

}
