package Basic;
import java.util.Scanner;
public class AskiValue {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Word");
	String st=sc.nextLine();
	char ch[]=st.toCharArray();
	for(int i=0;i<ch.length;i++) {
		//char c=st.charAt(i);
		System.out.println("Character;"+ch);
		System.out.println("Ascii value :"+(int)ch[i]);
		
	}
}
}
