import java.util.HashMap;
import java.util.Map;

class ResistorColorDuo {
	int value(String[] colors) {
		int sum = 0;
		Map<String, Integer> map = new HashMap<String, Integer>() {
			{
				put("black", 0);
				put("brown", 1);
				put("red", 2);
				put("orange", 3);
				put("yellow", 4);
				put("green", 5);
				put("blue", 6);
				put("violet", 7);
				put("grey", 8);
				put("white", 9);
			}
		};
		for (int i = 0; i < Math.min(colors.length, 2); i++) {
			sum *= 10;
			sum += map.get(colors[i]).intValue();
		}
		return sum;
	}
}
