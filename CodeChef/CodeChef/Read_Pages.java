import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System. in);
		int t = input.nextInt();
        while(t>0)
        {
            int N = input.nextInt();
            int X = input.nextInt();
            int Y = input.nextInt();
            int count = (N - 1) / X + 1;
            if(count <= Y)
            {
                System.out.println("Yes"); 
            }
            else
            {
                System.out.println("No");
            }
            t--;
        }
        input.close();
	}
}