/*
    Write a method to return the count of even elements  
    in the given integer array

    Test Case 1: 

	Input :[1,6,9,0,25,16]
	Output : 3

    Test Case 2: 

	Input : [ 4, 78, 98, 87, 120 ]
	Output : 4

    Test Case 3: 

	Input : [ 5, -24, 47,- 21 ,58]
	Output : 1


 */
import java.util.Arrays;
import java.util.Scanner;

public class Array_P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Test Case : ");
        // Test Cases
        int t = input.nextInt();
        while (t-- > 0) {
            int[] arr_num = getData(input);
            System.out.println("Created Array : " + Arrays.toString(arr_num));
            evenCount(arr_num);
        }
        input.close(); // Close the scanner after use
    }

    // Method for user-defined array
    public static int[] getData(Scanner input) {
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        int[] arr_num = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr_num[i] = input.nextInt();
        }

        return arr_num;
    }

    // Method to return the count of even elements in the given integer array
    public static void evenCount(int[] arr_num) {
        int count = 0;
        for (int i = 0; i < arr_num.length; i++) {
            // Check if the element at index i is even
            if (arr_num[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Output : " + count);
    }
}

