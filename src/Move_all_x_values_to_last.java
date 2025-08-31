public class Move_all_x_values_to_last
{
	public static void main(String[] args)
	{
		String s="axbxxd";
		String a= Move(s,0);
		System.out.println(a);




	}
	static String Move(String a, int c ){

		if(c==a.length()){
			return "";
		}
		char ch=a.charAt(c);
		if(ch=='x'){
			return  Move(a,c+1)+ch;
		}else {
        return ch+Move(a,c+1);
		}

	}
}
