
/**
 * This class performs tests on the extensions to the ArrayBag class.
 *
 * @author Charles Hoot
 * @version 4.0
 */
public class BagTest {
	

    public static void main(String args[]) {


	 	ArrayBag<String> testBag1 = new ArrayBag<String>(2);
	 	ArrayBag<String> testBag2 = new ArrayBag<String>(11);
	 	ArrayBag<String> testBag3 = new ArrayBag<String>(4);
	 	//ArrayBag<String> testBag4 = new ArrayBag<String>(10);
		
		//ArrayBag<String> array = new ArrayBag<String>("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S");
		
		//String[] array = new String("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S");
		
        testBag2.clear();
        testBag2.add("A");
        testBag2.add("B");
        testBag2.add("C");
        testBag2.add("D");
        testBag2.add("E");
        testBag2.add("F");
        testBag2.add("G");
        testBag2.add("H");
        testBag2.add("I");
        testBag2.add("J");
        testBag2.add("K");
		
		
        System.out.println("*************test add*****************");
		
        testBag1.clear();
        if(testBag1.add("Jack"))
			System.out.println("passed!");
		else 
			System.out.println("failed");
        if(testBag1.add("Jill"))
			System.out.println("passed!");
		else 
			System.out.println("failed");
        if(testBag1.add("John"))
			System.out.println("passed!");
		else 
			System.out.println("failed");
        if(testBag1.add("Jack"))
			System.out.println("passed!");
		else 
			System.out.println("failed");
		
		
		
        System.out.println("******************test remove*******************************");
        System.out.println("Verify that each item is removed and the size is correct after the remove");
        int startSize = testBag2.getCurrentSize();
        boolean failed = false;
        for (int i = 0; i < startSize; i++) {
            String got = testBag2.remove();
            if (testBag2.getCurrentSize() != startSize - (i + 1)) {
                System.out.println("*** Failed test: After remove size should have been " + (startSize - (i + 1)));
                failed = true;
            }
            if (testBag2.contains(got)) {
                System.out.println("*** Failed test: After remove item " + got + " still in the bag");
                failed = true;
            }
        }
        if (!failed) {
            System.out.println("Passed!");
        }
        System.out.println();
		
		
	    System.out.println("*************test addAll*****************");
		//testBag3.addAll(["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S"]);
		//testBag3.addAll(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" });
		testBag3.addAll(new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" });
	    int size = testBag3.getCurrentSize();
		System.out.println(size);
		if(size == 11){
			System.out.println("Passed!");
		}
		else
			System.out.println("Failed!");
		System.out.println();
		
		
		
		
		
		
    }
	
    
	
	 
}
