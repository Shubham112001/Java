import java.util.Scanner;

public class Array {
	private static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[] myInt=getIntegers(5);
		int[] sorted=sortIntegers(myInt);
		printArray(sorted);
		

	}
	
	public static int[] getIntegers(int capacity) {
		int[] array = new int[capacity];
		System.out.println("Enter "+capacity+" Intergers value:\r");
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		return array;
		
	}
	
	public static void printArray(int[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.println("Elment "+i+" Contains "+array[i]);
		}
	}
	
	public static int[] sortIntegers(int[] array) {
		int[] sortedArray=new int[array.length];
		for(int i=0;i<array.length;i++) {
			sortedArray[i]=array[i];
		}
		boolean check=true;
		int temp;
		while(check) {
			check=false;
			for (int i=0; i<sortedArray.length-1; i++) {
				if(sortedArray[i]<sortedArray[i+1]) {
					temp=sortedArray[i];
					sortedArray[i]=sortedArray[i+1];
					sortedArray[i+1]=temp;
					check=true;
				}
			}
			
		}
		return sortedArray;
	}

}





















