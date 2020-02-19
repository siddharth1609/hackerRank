package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultipleTurnarayWithFilter {
	
	public static void main(String[] args) {
		
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Size of array:");
		
		int n = sc.nextInt();
		
		int arr[] = new  int[n];
		
		System.out.println("Enter array elelemt:");
		
		for(int i=0; i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
			
			
		}
		
	  /*   for(int i =0 ;i<arr.length;i++) {
		  
	    	 if(arr[i] % 3==0 && arr[i] % 5==0) {
				   
				   System.out.println("FizzBUss");
				   
			   } 
	    	 
	    	 else if(arr[i] % 3==0) {
			   System.out.println("Fizz");
			   
		   }else if(arr[i] % 5==0) {
			   
			   System.out.println("BIzz");
		   }else {
			   
			   System.out.println(":"+arr[i]);
		   }
		   
		  
		  
		  
	  }*/
		
		IntStream stream = Arrays.stream(arr);
		
		
		
	}

}
