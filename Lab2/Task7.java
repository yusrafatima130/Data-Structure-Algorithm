class Task7{       
    public static void main (String[] args) {  
       	int Arr[]={20,20,30,40,50,50,50};		//A Dense Array
	int temp[]=new int[Arr.length];		//A temp array with length of = to Arr length
	int l=1;				
	temp[0]=Arr[0];				//assigning 0 index value of Arr array to temp array
	int a=1;					
	for(int i=1; i<Arr.length; i++){		//loop till Arr length
		int count=0;				//a count variable 
		for(int j=0; j<Arr.length; j++){	//nested loop till Arr length
			if(i==j)			//
				continue;		//skip loop if comparing with itself
			if(Arr[i]==temp[j])		//checking if any element matched with temp array element
			{
				count++;		//adding 1 to count
			}
		}
		if(count==0 || Arr[i]==0)		//if count =0 means if no one matched with already assign value
		{
			
			temp[a]=Arr[i];			//assigning values to temp
			l++;				
			a++;
		}		//end of loop 1
	}			//end of loop 2
	int finalArray[] =new int[l];			//a final array with length equals to times of assigned values to temp
	for(int i=0; i<finalArray.length; i++)		//loop till length of new array
		finalArray[i]=temp[i];			//assigning value from temp to finalArray
	System.out.println("Length of below Final Array is "+ finalArray.length);	//print length of final array
	
	for(int i=0; i<finalArray.length; i++)
		System.out.print(finalArray[i]+"  ");	//printing final array with no dublicates

	}
}
	