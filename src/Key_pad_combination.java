public class Key_pad_combination {
	public static void main(String[] args) {
		String[] a = {
				"",    // 0
				"abc", // 1
				"def", // 2
				"ghi", // 3
				"jkl", // 4
				"mno", // 5
				"pqrs",// 6
				"tuv", // 7
				"wxyz" // 8
		};

		String str = "23";
		KeyPad(a, str.length(), 0, "", str);
	}

	static void KeyPad(String[] a, int length, int n, String newStr, String s) {
		if (n == length) {
			System.out.println(newStr);
			return;
		}

		int digit = s.charAt(n) - '0';
		//it converts the string values in the integer values so we can get the index values
		String letters = a[digit];
		//we use the integer value to get the index

		// try each letter for this digit
		for (int i = 0; i < letters.length(); i++) {
			KeyPad(a, length, n + 1, newStr + letters.charAt(i), s);

			//#1--> the (a,2,1,"d","2") is called then this calls the --> (a,2,2,"dg","3")
			//now the base case is hit then the fist keypad  combination is "de" then return
			//again  (a,2,1,"d","2") this is called then we hit the } of for loop then
			// i=1 that then it calls the (a,2,2,"dh","3") then hit the base case then print "dh" and it continues.
		}
	}
}

/*

 How the code works (for input "23")

1. Start with call: `KeyPad(a, 2, 0, "", "23")`

   * `n=0` → digit = `'2'` → `"def"`

2. Loop over `"def"`

   * For `i=0` → call `KeyPad(a, 2, 1, "d", "23")`
   * For `i=1` → call `KeyPad(a, 2, 1, "e", "23")`
   * For `i=2` → call `KeyPad(a, 2, 1, "f", "23")`

3. Inside `KeyPad(a, 2, 1, "d", "23")`

   * `n=1` → digit = `'3'` → `"ghi"`
   * Loop over `"ghi"`:

     * `i=0` → call `KeyPad(a, 2, 2, "dg", "23")` → base case → print `dg`
     * `i=1` → call `KeyPad(a, 2, 2, "dh", "23")` → base case → print `dh`
     * `i=2` → call `KeyPad(a, 2, 2, "di", "23")` → base case → print `di`

4. Inside `KeyPad(a, 2, 1, "e", "23")`

   * `n=1` → digit = `'3'` → `"ghi"`
   * Loop over `"ghi"`:

     * print `eg`, `eh`, `ei`

5. Inside `KeyPad(a, 2, 1, "f", "23")`

   * `n=1` → digit = `'3'` → `"ghi"`
   * Loop over `"ghi"`:

     * print `fg`, `fh`, `fi`

6. After all loops finish, the program ends.


 */
