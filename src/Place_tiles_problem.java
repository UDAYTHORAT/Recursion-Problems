public class Place_tiles_problem
{
	public static void main(String[] args)
	{
		int n=4;
		int m=3;
		System.out.println("Following are the ways you cam place a 1x"+m+" tile in the "+n+"x"+m+" space-->");
		System.out.println(tiles(n,m));

	}
	static int tiles(int n,int m){
		if(n==m){
			return 2;
		}
		if(n<m){
			return 1;
		}

		int PlaceVertical=tiles(n-1,m);
		int PlaceHorizontal=tiles(n-m,m);

		return PlaceVertical+PlaceHorizontal;
	}
}
