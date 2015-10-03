
/**
 * Animal de base
 * Elle est abstract afin d'empêcher de créer un simple animal, mais ça va aussi fonctionner sans
 * @author Clark Winkelmann
 */
public abstract class Animal {

	protected int age = 0;

	/**
	 * Constructeur de l'animal
	 * @param age Nombre entier positif
	 * @throws Exception
	 */
	public Animal(int age) throws Exception
	{
		this.setAge(age);
	}

	/**
	 * Donne un nouvel âge à l'animal
	 * @param age Nombre entier positif pour l'âge
	 * @throws Exception Si le nombre n'est pas valide
	 */
	public void setAge(int age) throws Exception
	{
		// Avant d'appliquer la valeur reçue on véréfie sa validité
		// En cas d'erreur on jette une exception
		if(age < 0) {
			throw new Exception("L'âge ne peut être négatif");
		}

		this.age = age;
	}

	/**
	 * @return Âge de l'animal
	 */
	public int getAge()
	{
		return this.age;
	}

	/**
	 * Demande à l'animal de manger
	 */
	public void manger()
	{
		System.out.println("Omnomnomnom");
	}

	/**
	 * Demande à l'animal de se déplacer
	 */
	public void seDeplacer()
	{
		System.out.println("Je bouge");
	}

}
