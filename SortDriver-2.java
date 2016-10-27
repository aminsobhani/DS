import java.util.*;
import java.io.*;

/**
 * A class for generating statistical information about the basis sort performance.
 * 
 * @author Charles Hoot
 * @version 4.0
 */

        
public class SortDriver
{
    
    
    
    public static void main(String args[])
    {
        int arraySize; //shoule be 100, 10000, 100000 when testing for sorts
        int trials; // should be 20 for average case 
        int data[]; 
        
		
		/** one short example to show how the code works.
			
		arraySize = 10;
		data = generateRandomArray(arraySize); //crate an array
		System.out.println("The array is: "); 
		for(int i = 0; i < arraySize; i ++){
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
		long startTime = System.nanoTime();
        Sort.selectionSort(data);
	    long endTime = System.nanoTime();
	    long duration = (endTime - startTime);
		
		System.out.println("Time spend for selectionSort is: " + duration);
		
		
		System.out.println("The sorted array is: ");
		for(int i = 0; i < arraySize; i ++){
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
		
		Sort.reverseSort(data);
		
		System.out.println("The reversed array is: ");
		for(int i = 0; i < arraySize; i ++){
			System.out.print(data[i] + " ");
		}
		System.out.println();
		*/


		//add code to calculate time for different sort algorithms for best case(the array is already sorted) 
		
		
		//add code to calculate time for different sort algorithms for worst case
		
		
		//add code to calculate time for different sort algorithms for average case 

        
        
    }



    /**
     * Generate an array of random integer values.  The values will be between 0 and size.
     *
     * @param   size    The size of the array to generate.
     * @return  The array of integers. 
     */
    private static int[] generateRandomArray(int size)
    {
        int result[] = new int[size];
        Random generator = new Random();
        
        for(int i = 0; i< size; i++)
        {
            int value = generator.nextInt(size);
            result[i] = new Integer(value);
        }
        
        return result;
    }

}
