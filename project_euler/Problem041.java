import java.util.Set;
import java.util.TreeSet;

public class Problem041 {

	public static void main(String[] args) {

		Set<String> numbers = new TreeSet<String>();
		for(int i = 1000000; i < 9999999; i++) {
			if(isPandigital(i) && isPrime(i)) {
				numbers.add(String.valueOf(i));
			}
		}

	}
	public static boolean isPandigital(int n) {
		String concat = n+"";
		Set<Character> mapping = new TreeSet<Character>();
		for(char ch : concat.toCharArray()) {
			if(ch == '0') {
				return false;
			}
			mapping.add(ch);
		}
		return (concat.length() == mapping.size());
	}
	public static boolean isPrime(int n) {
		if(n > 2 && (n & 1) == 0) {
			return false;
		}
		for(int i = 3; i*i <= n; i+=2) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}


}