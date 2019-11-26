class Task4{
	public float Avg(int Arr[])		//Avg Method of float return type and an array as input through perameter
	{
		int a=0;
		float x=0.0f;
		while(a<Arr.length)		//runnig loop untill 'a' value is less then length of array
		{	
			x+=Arr[a];		//adding all values of array in 'x' variable
			a++;
		}
		x/=Arr.length;			//dividing x by length of array
		return x;			//returning avgrage value stored in x
	}
	public static void main(String []abcd)
	{
		int Arr[]={1,5,8,9,6,4};	//a dense array with random values
		Task4 t=new Task4();		//creating object of class
		System.out.println("Avg: vlaues of Array is :"+t.Avg(Arr));	//printing then return value by calling method through object.method_name
	}
}