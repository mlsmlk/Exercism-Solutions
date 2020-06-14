class ReverseString {

	String reverse(String inputString) {
		StringBuilder str = new StringBuilder();
		str.append(inputString);
		str = str.reverse();
		return str.toString();
	}

}
