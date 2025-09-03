import java.util.HashSet;

public class Print_unique_subsequences
{
	public static void main(String[] args)
	{
		String a="aabc";
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

	/*


HashSet-->
1. No duplicates** → it only keeps unique elements.
2. No order** → it does not remember the order of insertion.
3. Allows `null`** → but only one `null` value.
4. Fast → adding, removing, and searching is very quick (`O(1)` on average).
5. Part of Collections Framework→ found in `java.util`.
6. Backed by a HashTable** → uses hashing internally to store data.


	 */

