package Basic;
import java.util.Scanner;
public class VowelCount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String");
	String st=sc.nextLine();
    char ch[]=st.toCharArray();
	String v="aeiouAEIOU";
	int count=0;
	for(int i=0;i<st.length();i++) {
	//	if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
		char c=st.charAt(i);
		if(v.indexOf(c)>=0) {
			count++;
		}	
	}
	System.out.println("No Of Vowels: "+ count);
	}
}
	

