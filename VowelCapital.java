package String_1;
import java.util.Scanner;
public class VowelCapital {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++) {  //Vowel Small Into Capital
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A'&&ch[i]<='Z'){  //Consonant Capital into Small
				ch[i]=(char)(ch[i]+32);
			}
		}
		System.out.println(ch);
	}

}
