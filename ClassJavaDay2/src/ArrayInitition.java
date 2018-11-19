import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayInitition {
	
	
	public int get(int n) {
		int array[]=new int[n];
		System.out.println("Enter array elements:");
		for(int index=0;index<n;index++)
			{
				Scanner scanner2= new Scanner(System.in);	
				array[index]=scanner2.nextInt();
			}
				
		for(int index=0;index<n;index++)
			{
				System.out.println(array[index]);			 
			}
		
		return array[n];
		}
	
	
	public int ascending1(int array[n]) {
		for(int index=0;index<array.length;index++) {
			 
			for(int index1=0;index1<array.length-index-1;index1++) {
				 
				if (array[index1]>array[index1 +1]) {
					  int temp= array[index1];
					  array[index1]=array[index1 +1];
					  array[index1 +1]=temp; 
				  }
			 }
			
		
		 }
		return array[n];
	}
	
	public void descending1(int array[]) {
		for(int index=0;index<10;index++) {
			 
			for(int index1=0;index1<10-index-1;index1++) {
				 
				if (array[index1]<array[index1 +1]) {
					  int temp= array[index1];
					  array[index1]=array[index1 +1];
					  array[index1 +1]=temp; 
				  }
			 }
		 }
	}

	
	
}
		

