import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System. in);
            int t = input.nextInt(); 
            while(t-->0){
                int x = input.nextInt();
                int y = input.nextInt();
                int z = input.nextInt();
                int a = 0;
                if(x>3){
                    for(int i=1; i<=x; i++){
                        a += y; 
                        if(i%3==0 && i!=x){
                            a += z;
                        }
                    }
                    System.out.println(a);
                }
                else{
                    System.out.println(x*y);
                }   
            }
        input.close();
    }
}
