import java.util.Scanner;

public class Ex4MotifPaireImpaire {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int i1 = 0;

		System.out
				.print("Saisir le nombre de fois ou le motif doit être repété : ");
		i1 = sc.nextInt();

		String st = "*";
		for (int i = 0; i < i1; i++) {
			System.out.println(st);
			if (i%2 == 1) {
				st = st + "*";
			}
			if (i%2 == 0) {
				st = st + "-";
			}
		}

		sc.close();
	}

}
