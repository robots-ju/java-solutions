import java.util.Scanner;

public class Ex6Factoriel {

	public static void main(String[] arg) {
		System.out.println("un factoriel est un nombre qui se multiplie n fois jusqu'à lui même.");
		System.out.println("ex factoriel de 5 ==> 1 * 2 * 3 * 4 * 5");

		System.out.print("saisir un nombre: ");

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		System.out.println(factorielRecursif(i+1));
	}

	public static int factorielRecursif(int parametre) {
		int i = parametre;
		if (parametre > 1) {
			i = i - 1;
			System.out.println("passage dans boucle s'arrête dans "+i);
			i = i * factorielRecursif(i);
		}

		return i;
	}

}
