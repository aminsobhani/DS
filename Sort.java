public class Sort {
 
 	//selection sort
    public static int[] selectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
	
	public static int[] reverseSort(int[] arr){
		int n = arr.length;
		int[] intArray = new int[n];
		
		for(int i = 0; i < n/2; i++){
			int temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
			//intArray[n-1-i] = arr[i];
		}
		return intArray;
	}
	
    public static int[] bubbleSort(int[] intArray) {
               
         int n = intArray.length;
         int temp = 0;
               
         for(int i=0; i < n; i++){
             for(int j=1; j < (n-i); j++){
                 if(intArray[j-1] > intArray[j]){
                  //swap the elements!
                      temp = intArray[j-1];
                      intArray[j-1] = intArray[j];
                      intArray[j] = temp;
                 }
             }
          }
		  return intArray;
   }
   
   public static int[] insertionSort(int[] input){

	   	int temp;
		for (int i = 1; i < input.length; i++) {
			for(int j = i ; j > 0 ; j--){
				if(input[j] < input[j-1]){
					temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}
		}
		return input;
	}
     

}