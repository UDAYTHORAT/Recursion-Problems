import java.util.ArrayList;

public class Subsequesces_of_a_string
{
	public static void main(String[] args)
	{
		String a="aabc";
		Subsequences(a,0,"");
		ArrayList<String> lis =new ArrayList<>();
		 SubSeq(a,0,"",lis);
		System.out.println(lis);
		Str(a);

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

	// Return Array list-->
	static ArrayList<String> SubSeq(String  a, int n,String str, ArrayList<String> list){
		if (n==a.length()){
			list.add(str);
			return list;
		}
		char ch=a.charAt(n);

		//include in the list-->

		 SubSeq(a,n+1, str+ch,list);

		//exclude from the  list-->
		 SubSeq(a,n+1,str,list);

		 return list;

	}


	//Using  iteration and not recursion -->
	static void Str(String a){
		int n=a.length();
		int total=1<<n;

		for (int mask = 0; mask <total; mask++)
		{
			StringBuilder sub= new StringBuilder();
			for (int j = 0; j <n; j++)
			{
				if((mask & (1<<j))!=0){
					sub.append(a.charAt(j));
				}

			}
			System.out.println(sub);
		}
	}
}

