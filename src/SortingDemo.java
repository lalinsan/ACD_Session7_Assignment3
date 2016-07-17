/*
 * Student: Eduardo Aguirre
 * Session 7
 * Assignment 3
 * Java Class that runs a selection sort on the elements of an Array in Ascending order
 *  
 */


import java.util.Arrays; //Import the Arrays Class from the Java Library
import java.util.Scanner; //Import the Scanner Java Class that allows the User to Input

public class SortingDemo 
{
	public static void main (String [] args) //Main method to start the Program
	{
		//Array of Integers
		int myArray[]; //Variable to store the Array
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in); //Creates an instance of the Scanner
		System.out.print ("What is the size of the Array ? "); // Prompts the user to enter the size of the array
		int size=sc.nextInt(); //Stores the value entered by the user in the size variable
		myArray = new int [size]; // assigns the size of the array to the variable my Array
		
		System.out.println ("Enter number on the Array : "); //Prompts the user to enter the Array numbers
		for (int i=0; i<size; i++) //Loops to store the values on the Array as per defined array size 
		{
			myArray[i]=sc.nextInt(); //Assigns the value to myArray
		}
		
		System.out.println ("============ Before Sorting ===========");
		System.out.println ("=======================================");
		System.out.println (Arrays.toString(myArray));  //
		System.out.println ("=======================================");
		
		selectionSort(myArray); //Executes method to sort the Array
		
		System.out.println ("============ After Sorting ============");
		System.out.println ("=======================================");
		System.out.println (Arrays.toString(myArray));
		System.out.println ("=======================================");
			
	}

	public static void selectionSort (int[ ] myArray) //Method to sort array values in Ascending order
	{
		int i; //Variable used by outer for loop
		int j; //variable used by the nested (inner) loop
		int first; //variable to store first value
		int temp; //variable to store temporary value
		
		for (i=myArray.length-1; i>0; i--)
		{
			first =0; //initializes to subscript of first Array element
			for (j=1; j<=i; j++) //locates the smallest element
			{
				if (myArray[j]>myArray [first])
					first=j;
			}
			temp = myArray[first]; //swamps the numbers in the array
			myArray[first]=myArray[i];
			myArray[i]= temp;
		}
			
	}
	
}
