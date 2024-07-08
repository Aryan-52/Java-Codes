import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
            Scanner input = new Scanner(System.in);
            int t = input.nextInt();
            while (t-- > 0) {
                int n = input.nextInt();
                int[] d = new int[n];
                for (int i = 0; i < n; i++) {
                    d[i] = input.nextInt();
                }
                int r = 0;
                for (int i = 0; i < n; i++) {
                    if (d[i] >= 1000) {
                        r++;
                    } 
                }
                System.out.println(r);
            }
            input.close();
        }
    }
