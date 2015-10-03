import java.util.Scanner;

public class Ex7Jeu1_100 {

	public static void main(String[] args) {
		double m = Math.random();
		int n = (int) (m * 100+1); // nombre aléatoire *100+1 (sinon on a un nombre entre 1 et 99.
		int o = 0;                 // nombre saisie par l'utilisateur
		int s = 0;                 // nombre de coups compté

		System.out.println("saisir un nombre entre 1 et 100");

		do {
			Scanner sc = new Scanner(System.in);

			o = sc.nextInt();
			if (o > n) {
				System.out.println("plus petit :D");
			}
			if (o < n) {
				System.out.println("plus grand :D");
			}
			if (o == n) {
				System.out.println("Bravo, vous avez trouvé!!!");
			}
			if (o > 100) {
				System.out.println("Vous ne savez pas lire?? J'ai dit entre 0 et 100!!!");
			}
			s = s + 1;
		} while (o != n);

		System.out.println("vous avez trouvé en " + s + " coups");
	}

}
