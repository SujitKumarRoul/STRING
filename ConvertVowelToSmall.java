package Basic;
import java.util.Scanner;
public class ConvertVowelToSmall {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String");
	String st=sc.nextLine();
	char ch[]=st.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
			ch[i]=(char)(ch[i]+32);
		}
		else if(ch[i]>='a'&& ch[i]<='z'){
			if((ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')==false) 
				ch[i]=(char)(ch[i]-32);
		}
	}
	System.out.println(ch);
}
}
