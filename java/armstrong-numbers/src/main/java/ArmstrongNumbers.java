class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int temp = numberToCheck;
		int len = String.valueOf(numberToCheck).length();
		int sum = 0;
		if (len == 1)
			return true;
		for (int i = 0; i < len; i++) {
			sum += (int) Math.pow((temp % 10), len);
			temp /= 10;

		}
		return sum == numberToCheck;
	}

}
