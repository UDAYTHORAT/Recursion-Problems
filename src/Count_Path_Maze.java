public class Count_Path_Maze
{
	public static void main(String[] args)
	{
		int n=3;
		int m=3;
		System.out.println("In the formation of "+n+"x"+m +" maze we have following paths to reach to the goal-->");
		System.out.println(Paths(0,0,n,m));
	}
	static int Paths(int i,int j,int n,int m){

		if(i==n || j==m){
			return 0;
		}
		if(i==n-1 && j==m-1){
			return 1;
		}
		int down=Paths(i+1,j,n,m);
		int right=Paths(i,j+1,n,m);
		return down+right;


	}
}
