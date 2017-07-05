
package com.javaassignment0104;

/*
 * this class will show the type casting between various data types.
 */

public class TypeCastingAssignment {					//this class will show the type casting between various datatypes
			public static void main(String[] args) {
				byte	num1=11;						//initializing the variable
				short	num2=20;						//initializing the variable
				int		num3;							//assigning the datatype to the variable
				long	num4;							//assigning the datatype to the variable
				float	num5;							//assigning the datatype to the variable
				double	num6;							//assigning the datatype to the variable
				
				num3= num1+num2;						//performing operation on byte and short 
				System.out.println("addition of byte variable and short variable and saving in int variable gives: "+num3);	//output shows widening typecast
				
				num4=num2+num3;							//performing operation on short and int
				System.out.println("addition of short variable and int variable and saving in long gives: "+num4);			//output shows widening typecast
				
				num5=num3+num4;							//performing operation on int and long
				System.out.println("addition of int variable and long variable and saving in float variable gives: "+num5);	//output shows widening typecast
				
				num6=num4+num5;							//performing operation on long and float
				System.out.println("addition of long variable and float variable into double variable gives: "+num6);		//output shows widening typecast
				
			


	}

}
