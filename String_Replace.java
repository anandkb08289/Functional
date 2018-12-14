package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class String_Replace {

	public static void main(String[] args) 
	{
          String st="HELLO <<USERNAME>>, HOW ARE YOU?";
          String str=getReplaced(st);
          System.out.println(str);
	}

	private static String getReplaced(String st) 
	{
		String usn=Utility.getString();
		if(usn.length()<=3)
		{System.out.println("enter the user name with atleast 3 character");
		 return null;}
		else
		{ String temp=" ";
		   	temp=st.substring(0, 6);
		   	temp+=usn;
		   	temp+=st.substring(18,32);
		   return temp;
		}
	}

}
