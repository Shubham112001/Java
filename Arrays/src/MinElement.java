import java.util.Scanner;

public class MinElement {
	private static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter no of elments you want to enter");
		int count=s.nextInt();
		int[] returnedArray=getIntegers(count);
		int returnMin=findMin(returnedArray);
		
		System.out.println("Min Value:- "+returnMin);

	}
	
	public static int[] getIntegers(int count) {
		int[] array =new int[count];
		System.out.println("Enter "+count+" integers value");
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		return array;
	}
	public static int findMin(int[] array) {
		int min= Integer.MAX_VALUE;
		for (int i=0;i<array.length;i++) {
			int value=array[i];
			if(value<min) {
				min=value;
			}
		}
		return min;
	}

}
