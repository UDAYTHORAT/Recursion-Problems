import java.util.ArrayList;

public class Subset_of_n_natural_numbers
{
	public static void main(String[] args)
	{
		int n=3;
		Subset(n,1,"");
		System.out.println(Subset(n,1,"",new ArrayList<>()));

	}
	static  void Subset(int n,int c,String s){
		if(c>n){
			System.out.println(s);
			return;
		}
		//include-->
		Subset(n,c+1,s+c);

		//exclude-->
		Subset(n,c+1,s);
	}
	static ArrayList<String> Subset(int n, int c, String s,ArrayList<String> list){
		if(c>n){
			list.add(s);
			return list;
		}
		//include-->
		Subset(n,c+1,s+c,list);

		//exclude-->
		Subset(n,c+1,s,list);

		return list;
	}
}
