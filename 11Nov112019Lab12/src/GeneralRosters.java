//I Shobaki
//ReadSequentialFile
//this reads the master file from
//    ArtifactRecord layout

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class GeneralRosters {
	private ObjectInputStream input;
	private General [] roster = new General[20];

	

    // **** SORT ROUTINE *******
    public void sortRoster(){
    	System.out.println("***********************");
		System.out.println("** The Sorted Roster **");
		System.out.println("***********************");
		//ADD SORT CODE HERE  MUST BE A MERGE SORT
		mergeSort(roster);
		for(int i=0; i < roster.length; i++) {
    		System.out.println(roster[i]);
    		System.out.println();
    	}
		
		System.out.println("**************************");
		System.out.println("** End of Sorted Roster **");
		System.out.println("**************************");
	
		
	}  //end sortRoster
    public static void mergeSort(General[] data) {
		sortArray(data, 0, data.length -1); //sort entire array
	}//end method sort
	
  //splits array, sorts subarrays and merges subarrays into sorted array
  	private static void sortArray(General[] data, int low, int high) {
  		//test base case; size of array equals 1
  		if((high - low) >= 1)//if not base case
  		{
  			int middle1 = (low + high) / 2; //calculate middle of array
  			int middle2 = middle1 + 1; //calculate next element over

  			
  			//split array in half; sort each half (recursive calls)
  			sortArray(data, low, middle1);//first half of array
  			sortArray(data, middle2, high);//second half of array
  			
  			//merge two sorted arrays after split calls return
  			merge(data, low, middle1, middle2,high);
  			
  		}//end if
  	}//end method sortArray
  	//merge two sorted subarrays into one sorted subarray
  	private static void merge(General[] data, int left, int middle1, int middle2, int right) {
  		int leftIndex = left; //index into left subarray
  		int rightIndex = middle2; // index into right subarray
  		int combinedIndex = left;//index into temporary working array
  		General[] combined = new General[data.length];//working array
  		

  		
  		//merge arrays until reaching end of either
  		while(leftIndex <= middle1 && rightIndex <= right)
  		{
  			//place smaller of two current element into result
  			//and move to next space in arrays
  			if(data[leftIndex].getID() <= data[rightIndex].getID())
  				combined[combinedIndex++] = data[leftIndex++];
  			else
  				combined[combinedIndex++] = data[rightIndex++];
  			
  		}
  		
  		//if left array is empty
  		if(leftIndex == middle2)
  			//copy in rest of right array
  			while(rightIndex <= right)
  				combined[combinedIndex++] = data[rightIndex++];
  		else //right array is empty
  			while(leftIndex <= middle1)
  				combined[combinedIndex++] = data[leftIndex++];
  		
  		//copy values back into original array
  		for(int i = left; i <= right; i++)
  			data[i] = combined[i];
  		
  	}//end method merge
 
    
  	
    //******* SEARCH ROUTINE *******

    public void searchRoster(){
    	System.out.println();
		//System.out.println("** searchRoster **");
		Scanner reader = new Scanner(System.in);
		
		//get input from user
		System.out.print("Please enter the general ID that you wish to find or 0 to quit: ");
		int searchInt = reader.nextInt();
		
		//repeatedly input an integer; 0 terminates the program
		while (searchInt != 0)
		{
			//perform search
			int location = binarySearch(roster, searchInt);
			
			if(location == 0)//not found
				System.out.printf("********** Target %d was not found. **********%n", searchInt);		
			else //found
			{
				System.out.println("Target Found  *****");
				System.out.println(roster[location]);	
			}
				
			
			//get input from user
			System.out.print("Please enter the general ID that you wish to find or 0 to quit: ");
			searchInt = reader.nextInt();
		}
		//User should be allowed mutiple searches
		//if the target is not found you should alert
		//the user to that fact

		//ADD Search CODE HERE MUST BE A BINARY SEARCH
     }  //end searchRoster
	public static int binarySearch(General[] data, int key) {
			
			int low = 0; //low end of the search area
			int high = data.length -1; //high end of the search area
			int middle  = (low + high + 1 ) / 2; //middle element
			int location = 0; //return value; 0 if not found
			
			do // loop to search for element
			{			
				
				//if the element is found at the middle
				if(key == data[middle].getID())
					location = middle; //location is the current middle
				else if (key < data[middle].getID()) //middle element is too high
					high = middle -1; //eliminate the higher half
				else //middle element is too low
					low = middle + 1; //eliminate the lower half
				
				middle = (low + high + 1) / 2; // recalculate the middle
	
			}while ((low <= high) && (location == 0));
			
			return location; //return location of search key
		}//end method binarySearch
	
	
    //  ******* OPEN FILE ROUTINE *******
    //  make sure that generalMaster.ser  is in the folder from
    //  whih your programs are running...for Eclipse the .ser file
    //  needs to be at the project Level...for TextPad the .ser will
    // will be in the folder containing the .jav file
    //  NO CHANGES ARE NEEDED IN THIS METHOD
	public void openFile(){
		//System.out.println("** In openFile **");
		try	{
			input = new ObjectInputStream(new FileInputStream("generalMaster.ser"));
	    }
	    catch(IOException ioException) {
			System.err.println("can't open or accesss file  " + ioException + "\n");
	    }
	}  //end openFile

 //******* READ FILE and LOAD ARRAY ROUTINE *******

	public void readRecords(){
		//System.out.println("** In readRecords **");
		General  record;
	    int count = 0;   //Used to populate array in while loop
	    
		System.out.printf("%-12s%-20s%-12s\n","ID","Name","Age");
		try	{
			while(true)	{
				//ADD TWO LINES HERE... TO POPULATE YOUR Roster ARRAY and increment your array index...
				record = (General) input.readObject();
				roster[count] = record;
				count++;
                
				System.out.printf("%-12d%-20s%-12d\n",record.getID(), record.getName(), record.getAge());
				
				
	        }  //end while
        }
	    catch(EOFException e){
			System.out.println("....catch ...." + e + "\n");
			return;
		}
		catch(ClassNotFoundException eclassNotFound){
			System.out.println("....catch ...." + eclassNotFound + "\n");
		}
		catch(IOException eIO){
			System.out.println("....catch ...." + eIO + "\n");
		}
	}  //end readRecords

 //******* CLOSE FILE ROUTINE *******
 //  NO CHANGES ARE NEEDED IN THIS METHOD
	public void closeFile(){
		//System.out.println("** In closeFile **");
		try	{
		    if (input != null)
			    input.close();
		}
		catch(IOException ioExcetion) {
			System.err.println("Error closing file");
			System.exit(1);
		}
    }  //end closeFile
}//end class
