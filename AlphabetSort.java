package String_2;
import java.util.Scanner;
public class AlphabetSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();  //YZVUXW  ,
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {			
				if(ch[i]>ch[j]) {
					int temp = ch[j];
					ch[j]=ch[i];
					ch[i]=(char) temp;
				}
			}
		}
		// Changing character array to String
		String st = new String(ch);
		System.out.println(st);
	}
}


