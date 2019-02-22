package qotd2;

import java.util.List;

public final class QuoteUtil {
	private QuoteUtil() {
	};
	
	public static String decompress(String input, List<Integer> indices) {
		for (Integer index : indices) {
			String lhs = input.substring(0, index);
			input = lhs + " " + input.substring(index);
		}
		return input;
	}
}
