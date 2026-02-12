class ReverseProduct {

	static void reverseText() {

		String words[] = {
			"FAN",
			"TV",
			"TABLE",
			"PHONE",
			"LAPTOP",
			"BOOK",
			"PEN",
			"CHAIR",
			"LIGHT",
			"WATCH",
			"BAG"
		};

		for (int j = 0; j < words.length; j++) {

			String item = words[j];
			String result = "";

			for (int index = item.length() - 1; index >= 0; index--) {
				result = result + item.charAt(index);
			}

			System.out.println("Original: " + item + "  Reversed: " + result);
		}
	}

	public static void main(String[] args) {
		reverseText();
	}
}

