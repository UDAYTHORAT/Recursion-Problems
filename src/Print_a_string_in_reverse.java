public class Print_a_string_in_reverse
{
	public static void main(String[] args)
	{
		String s="UDAY";
//		Reverse(s);
		Reverse1(s,0);
	}
	static void Reverse(String a){

		for (int i = a.length()-1; i >=0 ; i--)
		{
			System.out.print(a.charAt(i));
		}

	}
	static void Reverse1(String a,int i){

		if(i==a.length()){
			return;
		}
		Reverse1(a,i+1);
		System.out.print(a.charAt(i)+" ");
	}
}
