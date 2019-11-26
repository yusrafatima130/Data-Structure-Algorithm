public class Task1{
   public int linearSearch(String [] arr , String value ){ 	//LinearSearch method with int return type and taikng array and strig value as input in perameter
	   for(int i=0; i<arr.length ; i++)			//for loop till array length 
	   {
		   if(arr[i]==value)				//if statement with condition of array at indext i = value 
		   {
			   return i;				//return i(index)
		   }
		   
	   }
	   return -1;						//return -1 means nothing found 
	   
   }
public static void main(String args[])				//main method
{
	String [] arr={"Abc","Abx","Bbc","Mno"};		//random sring in dense array

	Task1 t=new Task1();					//creating object of class
	System.out.print(t.linearSearch(arr, "Bbc"));		//printing the method,calling it by object of class and giving perameters for input
	
	
}
}
