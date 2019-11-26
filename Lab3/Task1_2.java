public class Task1{
   public int linearSearch(char [] arr , char value ){  //LinearSearch method with int return type and array and char values in perameter as input
	   for(int i=0; i<arr.length ; i++)		//for loop till array length
	   {
		   if(arr[i]==value)			//if condition (value of array at index i = value)
			   {
			   return i;			//return i(index)
		   }
		   
	   }
	   return -1;					//return -1 if nothing found
	   
   }
public static void main(String args[])			//main body
{
char [] arr={'A','E','I','O','U'};			//random characters

Task1 t=new Task1();					//object of class
System.out.print(t.linearSearch(arr, 'U'));		//print Linear search method by calling it by object of class with perameters (array and input character to be find)
	
	
}
}