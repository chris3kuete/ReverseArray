/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversearray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sa
 */
public class ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int[] arr = new int[10];
        
        System.out.println("Enter the numbers ");
        for (int i = 0; i < 10; i++) {
            arr[i]= scan.nextInt();
        }
        reverse(arr);
    }
    public static void reverse(int[] array){
        
        int[] revArray = new int[array.length];
        int j = array.length-1;
        
        for (int i = 0; i < array.length; i++) {
            
            revArray[i] = array[j--];
            System.out.println("the new array is "+ revArray[i]);  
        }
        System.out.println("the new array is "+ Arrays.toString(revArray)); 
        
    }
  
}
