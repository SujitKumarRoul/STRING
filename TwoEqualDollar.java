package String_2;
import java.util.Scanner;
public class TwoEqualDollar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		String s = DollerString(st);
		System.out.println(s);
	}
	public static String DollerString(String st) {

		char ch[] = st.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]==ch[i+1]) {
				ch[i]='$';
				ch[i+1]='$';
			}
		}
		return new String(ch);
	}
}
//dollar question if duplicate & continuous letter is in string
	
	

