import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System. in);
            int t = input.nextInt(); 
            while(t-->0){
                int x = input.nextInt();
                int y = input.nextInt();
                int z = input.nextInt();
                System.out.println(Math.max(0,z-(y/x)));
            }
        input.close();
    }
}
