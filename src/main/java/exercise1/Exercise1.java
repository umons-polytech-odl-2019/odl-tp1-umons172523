package exercise1;

public class Exercise1 {
	static Person createPerson(String name, int age)
	{
		// Ok:Ajoutez les champs name et age à la classe Person.
		// Ok:Créez un constructeur public permettant d'initialiser ces valeurs au moment de la construction.
		// Ok:Créez des getters publics pour lire ces valeurs une fois la classe construite.
		//return null; on doit le retirer et creer une personne
		Person A=new Person(name, age);
		return A;
	}

	public static void main(String[] args)
	{
		// Considérant que cette classe est démarrée en ligne de commande avec un premier paramètre donnant le nom
		// et un second donnant l'âge (nombre entier), créez un objet Person sur base de ceux-ci.
		// Ecrivez ensuite le nom et l'âge de cette personne sur la sortie standard.
		Person A= new Person(args[0], Integer.parseInt(args[1]));// car on le fait a partir d'une ligne de commande
		System.out.println(A.getName()+" "+A.getAge());
	}
}
