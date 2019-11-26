class Employee{
	int salary;
	int hour;
	public void getInfo(int salary, int hour)	//getInfo method with perameters for input
	{
		this.salary=salary;			//assigning values of perameters to instance variables ,using this keyword cause both have same name
		this.hour=hour;
	}
	public void AddSal()			//AddSal method with some conditions to add amount in salary
	{
		if(salary<500)
			salary+=10;
	}
	public void AddWork(){			//Addwork method with some conditions to add amount in salary
		if(hour>6)
			salary+=5;
	}
 public static void main(String []abd){
	Employee e=new Employee();		//making object of Employee class
	e.getInfo(150, 8);			//using method to call getInfo method with assigning perameters
	e.AddSal();				//calling AddSal method				
	e.AddWork();				//calling AddWork method
	System.out.print("Salary:"+ e.salary+"\nNo: of Hours:"+e.hour);		//printing final salary and hours 
	}
}