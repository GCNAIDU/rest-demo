package com.example.demo;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		/*
		 * int[] arr= new int[] {3,2,9,0}; int[] intArray = new int[]{
		 * 1,2,3,4,5,6,7,8,9,10 }; Arrays.stream(intArray).forEach(x->
		 * System.out.println(x)); int[] ints= new int[10]; System.arraycopy(intArray,
		 * 0, ints, 0, intArray.length); Arrays.stream(ints).forEach(x->
		 * System.out.println(ints.length+" : "+x));
		 */
		
		
        int[] source = {2, 3, 12, 4, 12, -2};
        
        // copying entire source array to destination
        int[] destination1 = Arrays.copyOfRange(source, 0, source.length);      
        System.out.println("destination1 = " + Arrays.toString(destination1)); 
      
        // copying from index 2 to 5 (5 is not included) 
        int[] destination2 = Arrays.copyOfRange(source, 2, 5); 
        System.out.println("destination2 = " + Arrays.toString(destination2));

	}

}
