// Problem Statement
// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/DNASTRAND

import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String s = input.next();
            String ns = "";
            for (int i = 0; i < n; i++) {
                switch (s.charAt(i)) {
                    case 'A':
                        ns += 'T';
                        break;
                    case 'T':
                        ns += 'A';
                        break;
                    case 'C':
                        ns += 'G';
                        break;
                    case 'G':
                        ns += 'C';
                        break;
                    default:
                        break;
                }
            }
            System.out.println(ns);
        }
        input.close();
    }
}
