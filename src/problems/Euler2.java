package problems;

public class Euler2 extends Euler {

	public static void main(String[] args) {

		i = 1;
		total = 0;

		while (i < 10) {
				if (i % 2 == 0) {
					total += i;
			}
			System.out.println(i);
			i += i - 1;
			System.out.println(i);
		}
		
		System.out.println(total);
	}

}
