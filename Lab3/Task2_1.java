class Binary{
	public static void main(String []abcd){		//start of main method
		char A[]={'a','b','d','r','x','y','z'};	//rendom sorted character in dense array
		int n=A.length;				//assigning array length in n variable 
		char x='d';				//the input character to be findout
		boolean Notfound=false;			//just for while loop condition
		int lowerBound=1;			//lowerBound varible assigned 1 
		int upperBound=n;			//uppernound variable assigned with n (length of array)
		
		while(!Notfound){			//while loop start till NotFound variable beacme true
			if(upperBound < lowerBound)	//if statement for the variable not found
				{System.out.print("Doesn't exitst");	//print statement
				break;}					//breake the while loop
			int midPoint=lowerBound+(upperBound-lowerBound)/2;	//calculating mid point vale and saving it in midPoint variable
			if((int)A[midPoint]<(int)x)				//checking if the giving character is greater then mid point character by checking their assici code
				lowerBound=midPoint+1;				//setting lb to mp+1
			if((int)A[midPoint]>(int)x)				//checking if the giving character is less then mid point character by checking their assici code
				upperBound=midPoint-1;				//setting up to mp-1
			if((int)A[midPoint]==(int)x)				//checking if the giving character is equals to mid point character by checking their assici code
				{System.out.print(x+" at:"+midPoint);		//printing statement 
				Notfound=true;					//making NotFound variable true
				break;}						//breaking while loop
		}								//end of main body
		
	}
}