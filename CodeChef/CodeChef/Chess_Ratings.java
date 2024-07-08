import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System. in);
            int t = input.nextInt(); 
            while(t-->0){
                int x = input.nextInt();
                int y = input.nextInt();
                int count = 0;
                if(x<y){
                    while(x<y){
                        x+=8;
                        count++;
                    }
                    System.out.println(count);
                }
                else{
                    System.out.println("0");
                }
            }
        input.close();
    }
}
