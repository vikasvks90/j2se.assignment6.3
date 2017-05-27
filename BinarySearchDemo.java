/**
* <h1>BinarySearchDemo</h1>
* This program is used to search an element in an array
* based on binary search algorithm 
* @author  Vikas
* @version 1.0
* @since   2017-05-27 
*/
package assignment6.session3;

//binary search algorithm works on sorted array so we have used a sorted array
public class BinarySearchDemo {

	public static void main(String[] args) {
		int[] arr1 = {2,45,103,277,300,359,476,999};
		int index;
        index = searchElement(arr1,0,arr1.length,45);
        printPosition(index,45);
        index = searchElement(arr1,0,arr1.length,999);
        printPosition(index,999);
        index = searchElement(arr1,0,arr1.length,300);
        printPosition(index,300);
        index = searchElement(arr1,0,arr1.length,876);
        printPosition(index,876);
	}
	
	//this method implements the binary search
	private static int searchElement(int[] arr1, int start, int end, int keyToBeFound) {
		if(start < end){
			int mid = start + (end-start)/2;
			if(keyToBeFound < arr1[mid]){
				return searchElement(arr1, start, mid, keyToBeFound);
			}
			else if(keyToBeFound > arr1[mid]){
				return searchElement(arr1, mid+1, end, keyToBeFound);
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	
	//this method will print the index if the element is found in the array
	//otherwise will give the message that element not found
	private static void printPosition(int i,int j){
		if(i > 0){
			System.out.println("Key "+j+" has been found at index "+i);
		}
		else{
			System.out.println("Key "+j+" has not been found in the given array");
		}
	}

}
