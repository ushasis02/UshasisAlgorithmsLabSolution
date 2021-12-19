package com.greatlearning.service;
import java.util.Arrays;

public class NotesCount {
      public static void notesCountImplementation (int[] array, int amount) {
    	  int noofnotes = 0;
    	  System.out.println("Your payment approach inorder to give min no of notes will be:");
    	  for (int i=0; i<array.length; i++) {
    		  noofnotes = (int) amount/array[i];
    		  if (noofnotes >0)
    			  System.out.println(array[i] + ":" + noofnotes);
    	  amount = amount - noofnotes*array[i];
    	  }
      }
}
