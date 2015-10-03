import java.util.ArrayList;

/**
 * Programme de test de l'abattoir
 * @author Clark Winkelmann
 */
public class Ex11Abattoir {

	// throws Exception est requis parce que le constructeur des animaux peut lui-même jeter une exception
	public static void main(String[] args) throws Exception {
		// Je créé mes animaux et les ajoute immédiatement à une liste
		ArrayList<Animal> animaux = new ArrayList<Animal>();
		animaux.add(new Vache(5));
		animaux.add(new Vache(6));
		animaux.add(new Vache(7));
		animaux.add(new Vache(10));
		animaux.add(new Vache(20));
		animaux.add(new Vache(54)); // Ok une vache ne vit probablement jamais si longtemps mais c'est pour le test
		animaux.add(new Cochon(6));
		animaux.add(new Cochon(7));
		animaux.add(new Cochon(8));
		animaux.add(new Cochon(8));

		// Je créé une ferme en donnant les animaux au constructeur
		Ferme maFerme = new Ferme(animaux);

		// J'ai aussi une méthode pour ajouter des animaux par la suite
		maFerme.addAnimal(new Vache(2));

		System.out.println("Il y a " + maFerme.populationActuelle() + " animaux dans la ferme");

		// Je bouchoie la population jusqu'à ce qu'il n'en reste aucun (oui je suis cruel)
		while(maFerme.populationActuelle() > 0) {
			maFerme.bouchoyerAnimaux();
			System.out.println("Il reste " + maFerme.populationActuelle() + " animaux dans la ferme");
		}

		System.out.println("Fin du massacre");
	}

}
