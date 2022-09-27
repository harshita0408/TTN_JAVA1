package Java3;
import java.util.*;
public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ans="";
		
		while(true) {
			String s=sc.next();
			if(s.equals("XDONE")) {
				break;
			}
			else {
				ans=ans+s;
			}
		}
		System.out.println(ans);

	}
}
