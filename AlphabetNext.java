package Basic;
import java.util.Scanner;
public class AlphabetNext {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
				if(ch[i]=='Z') {
					ch[i]='A';
				}
				else {
					ch[i]=(char)(ch[i]+1);
				}
		}
		
		System.out.println(new String(ch));
	}
	}



