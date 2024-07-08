import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System. in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = input.nextInt();
        }
        int e=0, o=0;
        for (int i = 0; i < n; i++) 
        {
            if(a[i]%2==0)
            {
                e++; 
            }
            else
            {
                o++;
            }
        }
        if(e>o)
        {
            System.out.println("READY FOR BATTLE"); 
        }
        else
        {
            System.out.println("NOT READY");
        }
        input.close();
	}
}

