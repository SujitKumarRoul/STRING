package String_2;
import java.util.Scanner;
public class ReverseTheWordOfSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		String rs=" ";
		for(int i=0;i<ch.length;i++) {//taking one by one Char
			int f=i;              //i Store in f(Last Char)
			while(i<ch.length&&ch[i]!=' ') {
				i++;
			}
			int l=i-1;
			while(l>=f) {
				rs=rs+ch[l];
				l++;
			}
			if(i<ch.length)
				rs=rs+ch[i];
		}
		System.out.println(new String(rs));
	}
}
