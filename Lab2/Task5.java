class Task5{
	public int SecLarg(int Arr[])	//method with int return type and takes int array as perameter for input
	{
		int m=0,n=0;
		for(int i=1; i<Arr.length; i++)	//for loop from 1 to less then array length 
		{
			if(Arr[i]>Arr[m])	//checking if value at index of i is greater then index of m(m=0 at start)
			{
				n=m;		//assigning second largest index to n because now m is less then some index i
				m=i;		//assigning m as largest index
			}
		}
		return n;
	}
	public static void main(String []abcd)
	{
		Task5 t =new Task5();		//making object of class
		int Arr[]={1,2,4,5,7,9};	//making a dense array
		System.out.print("Second Largest is at: "+t.SecLarg(Arr)); //printing return value 
	}
}
   