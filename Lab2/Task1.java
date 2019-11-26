class Task1{
	public static void main(String []abcd){
		int Arr[]=new int[100];		//creating an Array with length of 100
		for(int i=0; i<Arr.length; i++)	//for loop from 0 to array length-1(99)	
		{
			if(i%2==0)			//			
				Arr[i]=(i+2*i);		//
			else if(i<=50 && i%2!=0)	//
				Arr[i]=(i+4/3);		//Random logics to assign random vlaues
			else if(i>50 && i%2==0)		//
				Arr[i]=(i*i*i);		//
			else				//
				Arr[i]=i;		//
		}
		for(int x=0; x<Arr.length; x++)		//loop for printing Array values
			System.out.print(Arr[x]+" ");
	}
}
				