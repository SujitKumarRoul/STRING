package Basic;
import java.util.Scanner;
public class VowelNext {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]=='A') {
				ch[i]='E';
			}
			else if(ch[i]=='E') {
				ch[i]='I';
			}
			else if(ch[i]=='I') {
				ch[i]='O';
			}
			else if(ch[i]=='O') {
				ch[i]='U';
			}
			else if(ch[i]=='U') {
				ch[i]='A';
			}
		}
		System.out.println(new String(ch));
	}
}

