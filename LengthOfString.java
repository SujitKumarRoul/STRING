package String_1;
import java.util.Scanner;
public class LengthOfString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String");
	String st=sc.nextLine(); // take next() method if you want only single word,
					//but if you want to take sentence then take nextLine() method
	int count=0;
	for(int i=0;i<st.length();i++) {
		
		char ch=st.charAt(i);
		if(ch!=' ')
			count++;
	}
	System.out.println("The length of the String is:"+count);
}
}
