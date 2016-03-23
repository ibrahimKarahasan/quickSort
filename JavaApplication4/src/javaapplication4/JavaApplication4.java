/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

import java.util.Random;

/**
 *
 * @author BM
 */
public class JavaApplication4 {
   static int swap=0;
   static int karsi =0;
   public static void quickSort(int[] arr, int low, int high ) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
                                karsi++;
			}
 
			while (arr[j] > pivot) {
				j--;
                                karsi++;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
                                swap++;
			}
		}
      
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
                
               
    
	}
   
  public static void main(String[] args) {
    int temp;   
   
    int [] dizi= new int[10];
    int i;
    Random rnd = new Random();
     for (i=0; i<dizi.length; i++){
       dizi[i]=rnd.nextInt(10);
     }
    
    
      JavaApplication4 q = new JavaApplication4();
     long baslangic = System.currentTimeMillis(); 

     q.quickSort(dizi, 0, dizi.length-1);
      
    long gecenSure = System.currentTimeMillis()-baslangic;
    System.out.printf("\nToplam karsilastirma : " +q.karsi);
     System.out.printf("\nToplam swap : " +q.swap + "\n");
    System.out.println("Geçen sure : "+ gecenSure); 	
  
    
  
    
    }
    
    
    
}
