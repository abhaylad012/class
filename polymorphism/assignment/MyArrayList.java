package com.polymorphism.assignment;

import java.util.Scanner;

public class MyArrayList implements MyList {
	
	int[] array=new int[10];
	int index =0;
	
	
	
	public MyArrayList(int ArrayValue) {
		
		
		
	}
	

	@Override
	public int Add() {
		
	System.out.println("Add array elements:");
	for(int index=0;index<10;index++)
	{
			Scanner scanner= new Scanner(System.in);	
			array[index]=scanner.nextInt();
		
		}
	return array[10];
	
	}

	@Override
	public int get() {
		System.out.println("Enter searching Element");
		Scanner scanner= new Scanner(System.in);	
 
		int key=scanner.nextInt();
		 
		 for(int index=0;index<10;index++) {
			 if(array[index]==key) {
				 System.out.println("Entered Element is found"+key+"index of element is"+index);
				 break;
			 }
			 else if(index==9) {
				 System.out.println("Entered Element is not found");
			 }
		 }
		return key;
		
	}

	@Override
	public int getAll() {
		for(int index=0;index<10;index++)
		{
			System.out.println(array[index]);			 
		}
	
	return array[10];
	}

	@Override
	public int Update() {
		System.out.println("Enter searching Element");
		Scanner scanner= new Scanner(System.in);	
 
		int key=scanner.nextInt();
		 
		 for(int index=0;index<10;index++) {
			 if(array[index]==key) {
				 System.out.println("Entered Element is found"+key+"index of element is"+index);
				 break;
			 }
			 else if(index==9) {
				 System.out.println("Entered Element is not found");
			 }
		 }
		return key;
	}

	@Override
	public int Remove() {
		// TODO Auto-generated method stub
		return 0;
	}

}
