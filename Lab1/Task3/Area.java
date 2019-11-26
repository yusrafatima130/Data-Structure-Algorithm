import java.util.*;
class Area{
	double length;
	double breadth;
	Area(double length , double breadth)	//counstructor for assing values to instance variables
	{
		this.length=length;    //assigning perameter values to instance variables , using this keyowrd because both have same name
		this.breadth=breadth;
	}
	public double returnArea()	//returnArea with double return type to get Area
	{
		return length*breadth;
	}
	public static void main(String []abcd){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Input Length");
		double length1=s.nextDouble();		//taking input length
		System.out.println("Input Breadth");
		double breadth1=s.nextDouble();		//taking input breadth
		
		Area a=new Area(length1,breadth1);	//creating object of Area class with perameters for constructor
		
		System.out.println(a.returnArea());	//printing the return value of returnArea method
	}
}