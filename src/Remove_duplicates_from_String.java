public class Remove_duplicates_from_String
{
	public static void main(String[] args)
	{
		String a="aabcbcddgfdggred";
		String k="";
		Remove(a,0,k);

	}
	static void Remove(String a,int c,String k){
		if(c==a.length()){
			System.out.println(k);
			return;
		}
		char ch=a.charAt(c);
		if(k.indexOf(ch)==-1)
		{
			k += a.charAt(c);

		}
		Remove(a,c+1,k);


	}
}

/*
indexOf in Java:
- indexOf() is a String method that returns the index (position) of a character or substring.
- If the character/substring is found, it returns the first index.
- If it is not found, it returns -1.

Use in this code:
- We are building a result string k without duplicates.
- For each character ch in the input string:
    - We check if k.indexOf(ch) == -1
        → This means ch is not in k yet, so we add it.
    - Otherwise ch already exists in k, so we skip it.
- This way only the first occurrence of each character is kept.

Example with "aabb":
- First 'a': k="" → indexOf('a')=-1 → add → k="a"
- Second 'a': k="a" → indexOf('a')=0 → skip
- First 'b': k="a" → indexOf('b')=-1 → add → k="ab"
- Second 'b': k="ab" → indexOf('b')=1 → skip
Final result: "ab"
*/

