import java.util.ArrayList;

public class Permutation_using_recursion
{
	public static void main(String[] args)
	{
		String a= "abc";
		Permutation(a,0,"");
		ArrayList<String> res = new ArrayList<>();
		System.out.println("-----");
		Permutation(a,0,"",res);
		System.out.println(res);

	}
	static void Permutation(String a , int n,String s ){
		if(n==a.length()){
			System.out.println(s);
			return;
		}
	 char ch=a.charAt(n);
		for (int i = 0; i <=s.length() ; i++)
		{
			String left = s.substring(0,i);
			String right=s.substring(i);
			Permutation(a,n+1,left+ch+right);
		}
	}

	//Return ArrayList of the Permutation -->
	static ArrayList<String> Permutation(String a , int n, String s,ArrayList<String> list ){

		if(n==a.length()){
			list.add(s);
			return list;
		}
		char ch=a.charAt(n);
		for (int i = 0; i <=s.length() ; i++)
		{
			String left = s.substring(0,i);
			String right=s.substring(i);
			Permutation(a,n+1,left+ch+right,list);
		}
     return list;
	}
}
