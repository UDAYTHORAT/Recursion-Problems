import java.util.ArrayList;

public class First_and_last_occurance_in_string {
	public static void main(String[] args) {
		String a = "abccadafcfja";
		ArrayList<Integer> list = new ArrayList<>();
		Occurence(a, 0, -1, -1, list);
		System.out.println(list);
	}

	static ArrayList<Integer> Occurence(String a, int c, int first, int last, ArrayList<Integer> list) {
		if (c == a.length()) {
			// when string ends, add the results to the list
			list.add(first);
			list.add(last);
			return list;
		}

		if (a.charAt(c) == 'a') {
			if (first == -1) {
				first = c;
			}
			last = c;
		}
		return Occurence(a, c + 1, first, last, list);
	}
}
