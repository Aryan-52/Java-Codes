import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System. in);
		int X = input.nextInt();
        double Y = input.nextDouble();
        if(X%5==0 && X<=(Y-0.5))
        {
            System.out.println((Y-X)-0.5);
        }
        else
        {
            System.out.println(Y);
        }
        input.close();
	}
}