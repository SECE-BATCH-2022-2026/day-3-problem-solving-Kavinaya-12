import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(UserMainCode.regularExpression(input));
		
	}
}


class UserMainCode{
	public static boolean regularExpression(String inp){
		return inp.matches("(^[2][1-9]$)|(^[3][0-9]$)|(^[4][0-5]$)");
	}
}