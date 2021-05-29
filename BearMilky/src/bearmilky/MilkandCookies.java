package bearmilky;
import java.util.*;

public class MilkandCookies {

	public static void main(String[] args)throws java.lang.Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the test cases");// Enter the test cases T
		int t=sc.nextInt();
		for(int a=0;a<t;a++)
		{
			System.out.println("enter number of minutes");//Enter the time 
			int n=sc.nextInt();													 
			String str[]=new String[n];
			
			for(int i=0;i<n;i++)
			{
				str[i]=sc.next();						//Enter the ingredients
			}
			
			int p=1;
			for(int i=0;i<n;i++)
			{
				if(str[i].equals("cookie")&&str[i+1].equals("cookie"))// check whether the first two strings and last one string is cookie if yes condition fails if no condition passes
				{
					p =0;
					break;
				}
			
			
			if(str[n-1].equals("cookie"))
			{
				p=0;
			}
			}
			
			 if(p==0)
			    {
			        System.out.println("NO");
			    }
			    else
			    {
			        System.out.println("YES");
		}

		}
	}
}

/* psuedo code
 1.Enter the test cases
 2.Enter the minutes.
 3.Enter the Ingredients
 4.Check using string functions if first ,second and last value is cookie.
 5.if above condition satisfies then "no" or else "yes"
 
 logic
 1.just using string function and comparing values.
 str[i].equals("cookie")&&str[i+1].equals("cookie")
 and (str[n-1].equals("cookie")
 
 
 
  
 */
 


