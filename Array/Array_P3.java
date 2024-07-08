/*
 * Write a method to find the frequency of each element in 
 * the given integer array.
    Test Case 1: 

	Input :  [1, 8, 6 , 1 , 0 , 8]
	Output :    1 : 2 
                8 : 2 
                6 : 1 
                0 : 1 ​


Test Case 2: 

	Input :   [ 2, 2 , 3 , 3 , 2]
	Output :    2 : 3 
                3 : 2 

 */

import java.util.Arrays;
import java.util.Scanner;;

public class Array_P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        System.out.print("Test Case : " );
        //Test Cases
        int t = input.nextInt(); 
            while(t-->0){
                int [] arr_num = getData(input);
                System.out.println("Created Array : " + Arrays.toString(arr_num));
                findFrequencies(arr_num);
            }            
    }
    //Method for user defined array
    public static int[] getData(Scanner input){
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        int [] arr_num = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr_num[i] = input.nextInt();
        }

        return arr_num;        
    }

    //Method for finding the frequency of each element in the given integer array
    public static void findFrequencies(int[] arr_num){
        Arrays.sort(arr_num);
        System.out.println("Sorted Array : " + Arrays.toString(arr_num));
        int x = arr_num[0];
        int count = 1;

        System.out.println("Element Frequencies : ");
        for(int i=1; i<arr_num.length; i++){
            if (arr_num[i] == x) {
                count++;
            } 
            else{
                System.out.println(x + " : " + count);
                x = arr_num[i];
                count = 1;
            }
        }
        System.out.println(x + " : " + count);
    }
}