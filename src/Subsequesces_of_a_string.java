public class Subsequesces_of_a_string
{
	public static void main(String[] args)
	{
		String a="abc";
		Subsequences(a,0,"");

	}
	static void Subsequences(String a,int c,String newString){

		if(c==a.length()){
			System.out.println(newString);
			return;
		}

		char ch =a.charAt(c);

		//include the character -->
		Subsequences(a,c+1,newString+ch);
		//exclude the character-->
		Subsequences(a,c+1,newString);
	}
}
