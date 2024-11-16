// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    
		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int num, count = 0;
		boolean isFirst = true;

		for (int i = 1; i <= N; i++) {
			num = i;

			while (num != 1 || isFirst) {
				isFirst = false;
				if (mode.equals("v")) {
					System.out.print(num + " ");
				}

				if (num % 2 == 0) num /= 2;
				else num = num * 3 + 1;

				count++;
			}
			if (mode.equals("v")) {
				System.out.print(1 + " ");
				System.out.println("(" + (count + 1) + ")");
			}
			count = 0;
		}
		
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
