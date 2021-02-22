package fr.diginamic.props;

public class Operation {

	static {
		System.out.println("Exécution du bloc static");
	}

	public Operation() {
		System.out.println("Création d'une instance");
	}
}
