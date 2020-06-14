class RnaTranscription {

	String transcribe(String dnaStrand) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < dnaStrand.length(); i++) {
			switch (dnaStrand.charAt(i)) {
			case 'A':
				str.append("U");
				break;
			case 'T':
				str.append("A");
				break;
			case 'G':
				str.append("C");
				break;
			case 'C':
				str.append("G");
				break;
			}
		}
		return str.toString();
	}

}
