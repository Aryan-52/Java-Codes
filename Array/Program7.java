import java.util.Arrays;
import java.util.Scanner;

public class Program7{
    public static void main(String[] args) {
        int [] a1 = {2,5,7,9};
        int [] a2 = {3,4,8,11,13};
        int [] a = new int[a1.length+a2.length];
        Scanner input = new Scanner(System. in);
        System.out.print("Test Case : " );
        //Test Cases
        int t = input.nextInt(); 
            while(t-->0){
                for (int i = 0; i < a1.length; i++) {
                    for (int j = 0; j < a2.length; j++) {
                        for (int k = 0; k < a.length; k++) {
                            while (i < a1.length && j < a2.length) {
                                if (a1[i] < a2[j]) {
                                    a[k++] = a1[i++];
                                }
                                else{
                                    a[k++] = a2[j++];
                                }
                            }
                            while (i < a1.length) {
                                a[k++] = a1[i++];
                            }
                            while (j < a2.length) {
                                a[k++] = a2[j++];
                            }
                        }
                    }
                }
                System.out.println("Sorted Array : "+Arrays.toString(a));
            }
        input.close();
    }
}