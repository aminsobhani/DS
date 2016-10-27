import java.util.*;
import java.io.*;

/**
 * A class for generating statistical information about the basis sort performance.
 * 
 * @author Charles Hoot
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        
 * @version 4.1 (Modified for the Solution)
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 */

        
public class SortDriver
{
    
    
    
    public static void main(String args[])
    {
        int arraySize;
        int trials;
        Integer data[];
        
        //CREATE THE INSTANCE OF THE INSTRUMENTED SORT CLASS HERE
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>        
        SortArrayInstrumented sai = new SortArrayInstrumented();
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
        System.out.println("What size arrays should be used?");
        arraySize = getInt("   It should be an integer value greater than or equal to 1.");
        
        // MODIFY THE FOLLOWING TO GET THE NUMBER OF TRIALS AND LOOP      
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>        
        System.out.println("How many trials would you like?");
        trials = getInt("   It should be an integer value greater than or equal to 1.");

        for(int i = 0; i<trials; i++)
        {
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
            data = generateRandomArray(arraySize);
            
           
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>        
            sai.shellSort(data, arraySize);
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
          
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>        
        }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        // ADD CODE TO REPORT THE NUMBER OF COMPARISONS
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>        
        System.out.println("Total comparisons made: " + sai.getTotalComparisons());
        System.out.println("Average comparisons made: " + sai.getTotalComparisons()/trials);
        System.out.println("Minimum comparisons made: " + sai.getMinComparisons());
        System.out.println("Maximum comparisons made: " + sai.getMaxComparisons());
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        
        
    }



    /**
     * Generate an array of random integer values.  The values will be between 0 and size.
     *
     * @param   size    The size of the array to generate.
     * @return  The array of integers. 
     */
    private static Integer[] generateRandomArray(int size)
    {
        Integer result[] = new Integer[size];
        Random generator = new Random();
        
        for(int i = 0; i< size; i++)
        {
            int value = generator.nextInt(size);
            result[i] = new Integer(value);
        }
        
        return result;
    }


    /**
     *  A displayable representation of an array of Objects where toString is 
     *  applied on each object in the array
     *
     * @param   data    The array to display.
     * @return  A printable string.
     */
    private static String getString(Object [] data)
    {
        String result = new String("[ ");
        
        for(int i = 0; i< data.length; i++)
        {
            result = result + data[i].toString() + " ";
        }
        
        result = result + "]";
        
        return result;
    }
    
    
    /**
     * Get an integer value
     *
     * @return     An integer. 
     */
    private static int getInt(String rangePrompt)
    {
        Scanner input;
        int result = 10;        //default value is 10
        try
        {
            input = new Scanner(System.in);
            System.out.println(rangePrompt);
            result = input.nextInt();
            
        }
        catch(NumberFormatException e)
        {
            System.out.println("Could not convert input to an integer");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }        
        catch(Exception e)
        {
            System.out.println("There was an error with System.in");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }
        return result;
                                    
    }
}
