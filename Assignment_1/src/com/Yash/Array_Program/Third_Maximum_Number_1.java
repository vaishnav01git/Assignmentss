//WAP to find third maximum number from list of numbers.
package com.Yash.Array_Program;

public class Third_Maximum_Number_1 {


		   public static void main(String args[]){
		   int temp, size;
		   int array[] = {2,3,6,4,1,8,4};
		   size = array.length;
		   
		   for(int i = 0; i<size; i++ ){
		      for(int j = i+1; j<size; j++){
		         if(array[i]>array[j]){
		            temp = array[i];
		            array[i] = array[j];
		            array[j] = temp;
		         }
		      }
		   }
		   System.out.println("Third largest number is: "+array[size-3]);
		   }
		}
