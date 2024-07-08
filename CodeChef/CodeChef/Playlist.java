import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System. in);
		int t = input.nextInt();
        while(t-->0){
            int n = input.nextInt();
            int x = input.nextInt();
            System.out.println(n/(x*3));
        }
        input.close();
	}
}