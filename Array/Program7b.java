// Write a program to execute Merge Sort Algorithm for Array

import java.util.Arrays;
import java.util.Scanner;

public class Program7b{
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);
        System.out.print("Test Case : " );
        //Test Cases
        int t = input.nextInt(); 
            while(t-->0){
                    int [] arr = {2,6,7,3,6};
                    System.out.println("Unsorted Array : "+Arrays.toString(arr));
                    divide(arr, 0, arr.length-1);
                    System.out.println("Sorted Array : "+Arrays.toString(arr));
                }
                input.close();
            }
      
    public static void divide(int [] arr, int start, int end){
        if (start < end) {
            int mid = (start+end)/2;
            divide(arr, start, mid);
            divide(arr, mid+1, end);
            merge(arr, start, mid, end);
        }   
    }
    public static void merge(int [] arr, int start, int mid, int end){
        int ls = mid-start+1; // Left Array Size
        int rs = end-mid; // Right Array Size
        int[] l_arr = new int[ls]; // Left Array
        int[] r_arr = new int[rs]; // Right Array
        
        //Copy data to left array
        for (int i = 0; i < l_arr.length; i++) {
            l_arr[i] = arr[start+i]; 
        }

        //Copy data to right array
        for (int i = 0; i < r_arr.length; i++) {
            r_arr[i] = arr[mid+i+1]; 
        }

        //Merging left and right arrays
        int i = 0;
        int j = 0;
        int k = start;
        while (i < ls && j < rs) {
            if (l_arr[i] < r_arr[j]) {
                arr[k++] = l_arr[i++];
            }
            else{
                arr[k++] = r_arr[j++];
            }
        }
        while (i < ls) {
            arr[k++] = l_arr[i++];
        }
        while (j < rs) {
            arr[k++] = r_arr[j++];
        }
    } 
}