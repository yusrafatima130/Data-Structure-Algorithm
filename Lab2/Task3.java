import java.util.*;
class Task3
{
	public static void main(String arg[])
	{
	//An Array oF Double Values Created
	double a[]={9.1, 4.7, 5.8, 1.5, 3.0};
	
	//Sort Method : To Sort Array
	Arrays.sort(a);
	
	//toString METHOD : Array Is Converted Into String and Later Displayed
	System.out.print(Arrays.toString(a));
	
	
	System.out.println();
	
	//binarySearch method 
	System.out.println(Arrays.binarySearch(a,5.8));    //Binary Search Method Implemented
	
	System.out.println(Arrays.binarySearch(a,2));    
	
 	//Equals Method 
	double b[]={9.8, 8.4, 5.0, 3.5, 4.5};
	System.out.println(Arrays.equals(a,b));			//Array A and B will be checked if it is equal then true will be printed else False 
	
	//Fill Method
	double d[]=new double[5];
	Arrays.fill(d,10.0);     //It Is Filling 10.0 at the index
	
	System.out.print(Arrays.toString(d));
	
	System.out.println();
	
	//copyOf METHOD
	double copy[]=new double[5];
	copy=Arrays.copyOf(a,2);
	
	System.out.print(Arrays.toString(copy));
	System.out.println();
	
	//copyOfRange METHOD
	double copyor[]=new double[5];
	copyor=Arrays.copyOfRange(a,2,5);
	
	System.out.print(Arrays.toString(copyor));
	System.out.println();
	
	
	
	}
}