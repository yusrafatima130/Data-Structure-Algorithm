class Binary{
	public static void main(String []abcd){			//Main Body					
		String A[]={"Abc","Xyz","Etc","Acap","Zzzz"};		//Random String Array
		int n=A.length;							//assigning length to n variable 
		String x="Zzzz";						//input string to be findout
		boolean Notfound=false;						//boolean variable for while loop statement
		int lowerBound=1;					
		int upperBound=n;	
			
		while(!Notfound){					//start of while loop with condition till NotFound became true
			if(upperBound < lowerBound)			//if condition for string not found
				{System.out.print("Doesn't exitst");		//print statement
				break;}						//break loop
			int midPoint=lowerBound+(upperBound-lowerBound)/2;	//assigning mid point value 
			if(A[midPoint].compareTo(x)<0)				//comparing if string value is less then mid point
				lowerBound=midPoint+1;				//setting lower bond = midpoint +1
			if(A[midPoint].compareTo(x)>0)				//comparing if string value is greater then mid point
				upperBound=midPoint-1;				//setting lower bond = midpoint -1
			if(A[midPoint].compareTo(x)==0)				//comparing if string value is greater then mid point
				{System.out.print(x+" at:"+midPoint);		//printing founded string index in array
				Notfound=true;					//setting NotFound variable true
				break;}						//breaking loop
		}
		
	}
}