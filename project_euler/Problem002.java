import java.util.*;
import java.io.*;
import java.math.*;
public class Problem002 {

	public static void main(String[] args) {

		int limit = 4000000;
		long sum = 0;
		int a = 1;
		int b = 1;
		while(b < limit) {
			if(b% 2 == 0) {
				sum+=b;
			}
			int h = a+b;
			a = b;
			b = h;
		}
		System.out.println(sum);
	}
}