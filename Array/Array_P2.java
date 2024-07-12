/*
 * Write a method to return the largest element in the given integer array
 * Test Case 1: 

	Input :[1,6,9,0,25,16]
	Output : 25

    Test Case 2: 

	Input : [ 4, 78, 98, 87, 120 ]
	Output : 120

    Test Case 3: 

	Input : [ 5, -24, 46,- 20 ,98]
	Output : 98

 */
import java.util.Arrays;
import java.util.Scanner;

public class Array_P2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Test Case : ");
    int t = input.nextInt();
    while (t-->0) {
        int [] arr_num = getData(input);
        System.out.println("Created Array : "+Arrays.toString(arr_num));
        findLargest(arr_num);
    }
}    
    //Method for user defined array
    public static int[] getData(Scanner input){
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        int [] arr_num = new int[size];

        System.out.print("Enter "+size+" elements : ");
        for(int i=0; i<size; i++){
            arr_num[i] = input.nextInt();
        }
        return arr_num;
    }
    //Method to return the largest element in the given integer array
    public static void findLargest(int[] arr_num){
        int largest = arr_num[0];
        for(int i=1; i<arr_num.length; i++){
            if (largest < arr_num[i]) {
                largest = arr_num[i];
            }
        }
        System.out.println("The largest element in the array is "+largest);
    }
}
