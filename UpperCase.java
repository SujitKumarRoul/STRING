package Basic;
import java.util.Scanner;
public class UpperCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String");
	String st=sc.nextLine();
	char ch[]=st.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]>='a'&&ch[i]<='z') {
			ch[i]=(char)(ch[i]-32);
		}
	}
	System.out.println(ch);
}
}
