import java.util.ArrayList;

public class Dice_problem
{
	public static void main(String[] args)
	{
		int [] a={1,2,3,4,5,6};
		int target=4;
		ArrayList<String> list =new ArrayList<>();
		Find("",target,list);
		System.out.println(list);

	}
	static ArrayList<String> Find(String s, int target , ArrayList<String> list){
		if(target==0){
			list.add(s);
			return list;
		}
		for (int i = 1; i <=6 && i<=target ; i++)
		{
         Find(s+i,target-i,list);
		}
		return  list;
	}
}

/*
-----------------------------------------
Step-by-step execution for target = 3
-----------------------------------------

Start: Find("", 3)

Loop i = 1..3 (because i <= 6 && i <= target)

i = 1:
  → Find("1", 2)
     i = 1:
       → Find("11", 1)
          i = 1:
            → Find("111", 0) → base case → add "111"
     i = 2:
       → Find("12", 0) → base case → add "12"

i = 2:
  → Find("2", 1)
     i = 1:
       → Find("21", 0) → base case → add "21"

i = 3:
  → Find("3", 0) → base case → add "3"

Final list for target=3 → [111, 12, 21, 3]


-----------------------------------------
Step-by-step execution for target = 4
-----------------------------------------

Start: Find("", 4)

Loop i = 1..4

i = 1:
  → Find("1", 3)
     i = 1:
       → Find("11", 2)
          i = 1:
            → Find("111", 1)
               i = 1:
                 → Find("1111", 0) → add "1111"
          i = 2:
            → Find("112", 0) → add "112"
     i = 2:
       → Find("12", 1)
          i = 1:
            → Find("121", 0) → add "121"
     i = 3:
       → Find("13", 0) → add "13"

i = 2:
  → Find("2", 2)
     i = 1:
       → Find("21", 1)
          i = 1:
            → Find("211", 0) → add "211"
     i = 2:
       → Find("22", 0) → add "22"

i = 3:
  → Find("3", 1)
     i = 1:
       → Find("31", 0) → add "31"

i = 4:
  → Find("4", 0) → add "4"

Final list for target=4 → [1111, 112, 121, 13, 211, 22, 31, 4]

-----------------------------------------
Key Points
-----------------------------------------
1. Each recursion call tries dice values 1..6, but only if i <= target.
2. The string `s` keeps track of the sequence of dice rolls.
3. When target == 0 → base case: valid sequence found → add to list.
4. Recursion explores all possibilities in depth-first order.
*/

