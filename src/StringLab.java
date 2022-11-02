public class StringLab {
	public static void main(String[] args) {
		// Ex1
		capitalize("guts");
		// Ex2
		wheresWaldo("Puck, have you seen Waldo?");
		// Ex3
		firstThingsFirst("Miura", "Berserk");
		// Ex4
		reverse("Casca");
		// Ex5
		soLong("Griffith", "Femto");
		// Ex6
		afterMath("Judeau is a thief, but when it comes to math, he is one of the best.");
		// Ex7
		letterize("Eclipse");
	}

	public static void capitalize(String word) {
		String inputWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		System.out.println("" + inputWord);
	}

	public static void wheresWaldo(String phrase) {
		int indexWaldo = phrase.indexOf("Waldo");
		System.out.println("Waldo is in the " + indexWaldo + " spot.");
	}

	public static void firstThingsFirst(String a, String b) {
		int compare = a.compareTo(b);
		if (compare < 0) {
			System.out.println("" + a + " " + b);
		} else if (compare > 0) {
			System.out.println("" + b + " " + a);
		} else {
			System.out.println("No alphabetical differences");
		}
	}

	public static void reverse(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		System.out.println("" + s + " becomes " + reverse);
	}

	public static void soLong(String a, String b) {
		int word1 = a.length();
		int word2 = b.length();
		if (word1 > word2) {
			System.out.println("" + a);
		} else if (word2 > word1) {
			System.out.println("" + b);
		} else {
			System.out.println("" + a + " " + b);
		}
	}

	public static void afterMath(String phrase) {
		int indexMath = phrase.indexOf("math");
		if (indexMath > -1) {
			System.out.println(phrase.substring(indexMath));
		} else {
			System.out.println("Dud.");
		}
	}

	public static void letterize(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
}