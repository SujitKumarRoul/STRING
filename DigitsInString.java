package Basic;
import java.util.Scanner;
public class DigitsInString {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The String");
	String st=s.nextLine();
	int uc=0,lc=0,vc=0,cc=0,dc=0,sc=0;
	for(int i=0;i<st.length();i++) {
		char ch=st.charAt(i);
		if(ch>='A'&&ch<='Z') {
			uc++;
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			vc++;
		else
			cc++;
		}
		if(ch>='a'&&ch<='z') {
			lc++;
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			vc++;
		else
			cc++;
	     }
		else if(ch>='0'&&ch<='9') 
			dc++;
		else 
			sc++;
		 
}
	System.out.println("Number of Vowel Characters "+vc);
	System.out.println("Number of Consonant Characters "+cc);
	System.out.println("Number of Upper Case Characters "+uc);
	System.out.println("Number of Lower Case Characters "+lc);
	System.out.println("Number of Digit Characters "+dc);
	System.out.println("Number of Special Characters "+sc);
}
}
