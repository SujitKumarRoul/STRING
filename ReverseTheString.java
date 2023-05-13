package String_1;
import java.util.Scanner;
public class ReverseTheString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String st=sc.nextLine();
	reverString(st);
}
public static void reverString(String st) {
	String rev="";
	for(int i=0;i<st.length();i++) {
		char ch=st.charAt(i);
			rev=ch+rev;
	}
	System.out.println("string is reverse:" +" "+ rev);
	}
}

