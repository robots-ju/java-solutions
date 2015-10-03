
public class Ex2AffichageEtoile {

	public static void main(String[] args) {
		// bien, mais trop simple.
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");

		System.out.println("seconde option, un peu plus élégant");

		String st = "*";
		for(int i = 0; i<4; i++){
			System.out.println(st);
			st=st+"*";
		}
	}

}
