import java.util.*;
class Area{
	double length;
	double breadth;
	
	public void setDim(double length,double breadth) //setDim method to set value of length and breadth variable using perameter input
	{
		this.length=length;	//assigning perameter values to instance variables , using this keyowrd because both have same name
		this.breadth=breadth;
	}
	
	public double getArea(){	//getArea with double return type to get Area
		
		return length*breadth;

	}
	public static void main(String []abcd)		
	{
		double length1,breadth1;		
		Area a=new Area();			//creating object of Area class
		Scanner s=new Scanner(System.in);
		System.out.println("Input Length");
		length1=s.nextDouble();				//taking input length
		System.out.println("Input Breadth");
		breadth1=s.nextDouble();			//taking input breadth
		a.setDim(length1,breadth1);			//using class object calling setDim method with assiging perameters
		System.out.println(a.getArea());		//printing the return value of getArea method
		
	}
}