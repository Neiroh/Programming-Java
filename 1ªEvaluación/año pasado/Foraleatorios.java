//Este programa genera números aleatorios entre el 1 y el 49//
public class Foraleatorios {
	public static void main(String args[]) {
		int i;

		for (i = 0; i < 7; i++) {
			int n = (int) (Math.random() * 49 + 1);
			System.out.println(n);
		}
	}
}