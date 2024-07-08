import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System. in);
        int t = input.nextInt();
        while(t-->=1)
        {
            double n = input.nextInt();
            int x = input.nextInt();
            int ans = (int) Math.ceil(n/6);
            System.out.println(ans*x);
        }
        input.close();
	}
}