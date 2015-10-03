import java.util.ArrayList;

/**
 * Ferme hébergeant différents animaux
 * @author Clark Winkelmann
 */
public class Ferme {

	ArrayList<Animal> animaux;

	/**
	 * Simple constructeur pour la ferme
	 */
	public Ferme()
	{
		this.animaux = new ArrayList<Animal>();
	}

	/**
	 * Contructeur avec un ensemble initial d'animaux
	 * @param animaux Liste d'animaux à placer dans la ferme
	 */
	public Ferme(ArrayList<Animal> animaux)
	{
		this.animaux = animaux;
	}

	/**
	 * Ajoute un animal à une ferme existante
	 * @param animal Animal à ajouter
	 */
	public void addAnimal(Animal animal)
	{
		this.animaux.add(animal);
	}

	/**
	 * @return Nombre d'animaux actuellement dans la ferme
	 */
	public int populationActuelle()
	{
		return this.animaux.size();
	}

	/**
	 * Bouchoie les 3 animaux les + âgés de la ferme
	 */
	public void bouchoyerAnimaux()
	{
		// Pour + de clarté j'ai fait une 2e méthode qui accepte un nombre en paramètre
		// Vous pourriez tout mettre dans cette méthode
		this.bouchoyerAnimaux(3);
	}

	/**
	 * Bouchoie les animaux les + âgés de la ferme
	 * @param animauxABouchoyer Nombre d'animaux à bouchoyer
	 */
	public void bouchoyerAnimaux(int animauxABouchoyer)
	{
		int animauxBouchoyes = 0;

		// On continue à éliminer le + âgé jusqu'à ce que le nombre requis aient été retirés ou que la liste soit vide
		while(animauxBouchoyes < animauxABouchoyer && this.animaux.size() > 0) {
			int maxAge = -1;

			// On cherche l'âge maximal actuellement dans la liste
			for(Animal animal : this.animaux) {
				if(animal.getAge() > maxAge) {
					maxAge = animal.getAge(); // On met à jour maxAge si on a trouvé + âgé
				}
			}

			System.out.println("L'animal le plus âgé a " + maxAge + " ans !");

			// On va prendre l'animal qui a cet âge maximum
			// (ou le premier si plusieurs avaient cet âge)
			for(Animal animal : this.animaux) {
				if(animal.getAge() == maxAge) {
					animal.seDeplacer(); // Il se déplace à la boucherie
					this.animaux.remove(animal); // On retire l'animal (il est mort !)
					animauxBouchoyes++; // Cela fait un animal de plus !
					System.out.println("Couic !");
					break; // quitte immédiatement cette boucle for pour éviter de parcourir inutilement des autres animaux
				}
			}
		}

		System.out.println(animauxBouchoyes + " animaux envoyés à la boucherie !");
	}

}
