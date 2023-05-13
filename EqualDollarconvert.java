package String_2;
import java.util.Scanner;
public class EqualDollarconvert 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ther String: ");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) 
		{
			if(ch[i] == '$')
			{
				System.out.print(ch[i]);
				continue;
			}
			for(int j=i+1;j<ch.length;j++) 
			{	
				if(ch[i]==ch[j]) 
				{
					ch[j]='$';
					count++;
				}	
				if(j == ch.length-1 && count > 0)
				{
					ch[i]='$';
					count = 0;
				}
			}
			System.out.print(ch[i]);
		}
	}
}
