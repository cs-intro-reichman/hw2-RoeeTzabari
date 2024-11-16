// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		int terms = Integer.parseInt(args[0]);
		double denominator = 3.0;
		double counter = -1.0;
		double sum = 1.0;
		for (int i = 0; i < terms - 1 ; i++) {
			sum += counter / denominator;
			counter *= -1;
			denominator += 2;
		}
		sum *= 4.0;
		System.out.println("pi, according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + sum);
	}
}
