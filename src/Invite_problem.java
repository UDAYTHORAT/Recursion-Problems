public class Invite_problem
{
	public static void main(String[] args)
	{
		int n=4;

		InviteCombiantion(n,"");

		System.out.println();

		System.out.println(InviteCount(n));

	}
	static void InviteCombiantion(int n, String s){

		if(n==0){

			System.out.println(s);
			return;
		}
		InviteCombiantion(n-1, s + " ("+n+")");

		for(int i=1; i<n; i++){
			InviteCombiantion(n-2, s + " ("+i+","+n+")");
		}
	}
	static int InviteCount(int n){

		if(n<=1){
			return 1;
		}
		//alone-->
		int alone = InviteCount(n-1);

		//pair-->
		int pair = (n-1) * InviteCount(n-2);

		return alone+pair;
	}
}
