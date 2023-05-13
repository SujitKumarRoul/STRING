package Basic;
import java.util.Scanner; 
public class SumOfDigitInString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String");
	String st=sc.nextLine();
	char ch[]=st.toCharArray();
	int sum=0;
	for(int i=0;i<ch.length;i++) {
		if(ch[i]>='1'&&ch[i]<='9') {
			sum=sum+(ch[i]-48);     //0+'0'=48 (ASCII VALUE)
		}
	}
	System.out.println("The Sum Of Digit"+sum);
}
}
