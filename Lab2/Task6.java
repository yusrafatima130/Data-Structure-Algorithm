import java.util.*;
class Task6
{
	public static void main(String []abcd)
	{
		int a=0;
		int b=0;
		int row =2;
		int col =2;
		int myArr[][]=new int [row][col];		//Defining Array
		myArr[0][0]=3;					//
		myArr[0][1]=4;					//Asigning random values 
		myArr[1][0]=2;					//
		myArr[1][1]=1;					//
		int[] myArrayx=new int[row*col];	//assigning total numbers of values as size of linear Array
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)		//
			{					//
				myArrayx[a]=myArr[i][j];	//converting 2D Array into linear Array
				a++;
			}
		}
		Arrays.sort(myArrayx);				//soorting linear array using Arrays.sort() method
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				myArr[i][j]=myArrayx[b];	//sorting linear array again into 2D array
				b++;
			}
		}		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(myArr[i][j]+" ");	//printing
			}
			System.out.println();
		}
	}
}