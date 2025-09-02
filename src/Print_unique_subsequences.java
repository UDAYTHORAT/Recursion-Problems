import java.util.HashSet;

public class Print_unique_subsequences
{
	public static void main(String[] args)
	{
		String a="aaa";
		HashSet<String> set = new HashSet<>();
		UniqueSub(a,0,"",set);

	}
	static void UniqueSub(String a,int c,String newString, HashSet<String> set){

		if(c==a.length())
		{
			if (!set.contains(newString))
			{
				System.out.println(newString);
				set.add(newString);
			}
			return;
		}
			char ch = a.charAt(c);

			//include in the string-->
			UniqueSub(a,c+1,newString+ch,set);

			//Exclude from the string-->
			UniqueSub(a,c+1,newString,set);
		}
	}

