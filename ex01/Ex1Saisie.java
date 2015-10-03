import java.util.Scanner;

public class Ex1Saisie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1=0, i2=0;

		System.out.println("Saisir le premier nombre");
		i1 = sc.nextInt();

		System.out.println("Saisir le second nombre");
		i2 = sc.nextInt();

		System.out.println("addition de i1 + i2 = "+i1+" + "+i2+" = "+(i1+i2));

		sc.close(); // facultatif
	}

}
