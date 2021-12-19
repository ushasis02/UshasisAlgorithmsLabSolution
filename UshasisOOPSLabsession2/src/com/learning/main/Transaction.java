package com.learning.main;
import java.util.Scanner;

public class Transaction {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of transaction array:");
     int size = sc.nextInt();
     int arr[] = new int[size];
     
     System.out.println("Enter the values of array:");
          for (int i=0; i<size; i++)
    	arr[i]=sc.nextInt();
    
     System.out.println("Enter total no of targets that needs to be achieved:");
     int iter = sc.nextInt();
     for (int j=0; j<iter; j++) {
    	 System.out.println("Enter the value of target:");
    	 long target = sc.nextInt();
    	 for (int i=0; i<size; i++) {
    		 target = target - arr[i];
    		 if (target <= 0) {
    			 System.out.println("Target acheieved after " + (i+1) + " transactions");
    			 break;}
    		 }
    	 if (target >0)
    		 System.out.println("Given target is not achieved");
            }
  }
}
