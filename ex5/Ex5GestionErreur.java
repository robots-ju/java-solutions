import java.util.Scanner;

public class Ex5GestionErreur {

	public static void main (String [] arg){
		// peut être un peu difficile
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.print("saisir du texte : ");

		try{
			System.out.println("ça doit poser problème normalement...");
			i=Integer.valueOf(sc.next());
		}
		catch (Exception e){
			System.out.println("ça a bien posé problème");
			e.printStackTrace();
		}

		finally{
			System.out.println("voilà, l'idée était que vous \"attrapiez\" une exception." );
		}
	}

}
