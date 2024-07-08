// Problem Statement
// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/TRANSFORM

import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System. in);
            int t = input.nextInt(); 
            while(t-->0){
                int x = input.nextInt();
                if(x%3==0){
                    System.out.println("Normal");
                }
                else if(x%3==1){
                    System.out.println("Huge");
                }
                else{
                    System.out.println("Small");
                }
            }
        input.close();
    }
}
