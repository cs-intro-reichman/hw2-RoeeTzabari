// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
	String text = args[0].toUpperCase();
        int N = Integer.parseInt(args[1]);
        String specialLetter = "AEFHILMNORSX";
        String letter;

        for (int i = 0; i < text.length(); i++) 
        {
            letter = "" + text.charAt(i);
            if (specialLetter.indexOf(letter) >= 0) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            }
            else {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            }
        }
        
        System.out.println("What does that spell?");

        for (int i = 0; i < N; i++)     {
                System.out.println(text + "! ! !");
        }
    }
}
