import java.math.*;
public class Problem001 {

	public static void main(String[] args) {

		System.out.println(SumOfMultiplesOf3and5(1000));
		System.out.println(Math.abs(100-101));

	}
	public static int SumOfMultiplesOf3and5(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(i % 3 == 0|| i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}