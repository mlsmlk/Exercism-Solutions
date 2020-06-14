class Darts {
	double dist;

	Darts(double x, double y) {
		dist = Math.sqrt((x * x) + (y * y));
	}

	int score() {
		if (dist <= 10.0 && dist > 5)
			return 1;
		else if (dist <= 5 && dist > 1)
			return 5;
		else if (dist <= 1.0)
			return 10;
		return 0;
	}
}
