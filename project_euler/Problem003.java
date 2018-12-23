public class Problem003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	// prime generation
	public static void sieveOfEratosthenes(int n) {
		boolean prime[] = new boolean[n+1];
		for(int i = 0; i < prime.length; i++) {
			prime[i]= true;
		}
		for(int iterator = 2; iterator*iterator <= n; iterator++) {
			if(prime[iterator]) {
				for(int i = iterator*2; i <= n; i+= iterator) {
					prime[i] = false;
				}
			}
		}
		for(int i = 1; i < prime.length; i++) {
			if(prime[i]) {
				System.out.print(i + " ");
			}
		}
	}
}