public class Skip_a_char
{
	public static void main(String[] args)
	{
		 String a ="bcappcb";
		 String b="bcapplecb";
		 String c="bcappcb";
		 Skip(a,0,"");

		System.out.println(skipApple(b));

		System.out.println(skipAppNotApple(c));

	}
	//Skip a  specific character from the String -->
	static  void Skip(String a,int n,String newString){
		if(n==a.length()){
			System.out.println(newString);
			return;
		}
		char c= a.charAt(n);

		if(c=='a'){
			Skip(a,n+1,newString);
		}else {
			Skip(a,n+1,newString+c);
		}
	}

	//Skip a string from the String-->
	static String skipApple(String a) {
		if (a.isEmpty()) return "";

		if (a.startsWith("apple")) {
			return skipApple(a.substring(5)); // skip "apple"
		} else {
			return a.charAt(0) + skipApple(a.substring(1));
		}
	}

	//Skip a string from a string if it is not the required string-->
	static String skipAppNotApple(String a) {
		if (a.isEmpty()) return "";

		if (a.startsWith("app")&& !a.startsWith("apple")) {
			return skipAppNotApple(a.substring(3)); // skip "apple"
		} else {
			return a.charAt(0) + skipAppNotApple(a.substring(1));
		}
	}


}
