package String_1;
import java.util.Scanner;
public class Palindrome_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		String s = reverString(st);
		System.out.println(s);
	}
	public static String reverString(String st) {
		String rev="";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			rev=ch+rev;
		}
		//Checking for Plindrome
		for (int i = 0; i < st.length(); i++) {
			for (int j = i; j < rev.length(); j++) {
				if(st.charAt(i)!=rev.charAt(j)) {
					return "Not Palindrome";
				}
				break;
			}
		}
		return "Plaindrome";
	}
}
