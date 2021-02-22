package fr.diginamic.props;

public class TestOperation {

	public static void main(String[] args) {

		try {
			// Permet de charger la classe passée en paramètre et donc d'exécuter le bloc static s'il y en 1
			Class.forName("fr.diginamic.props.Operation");
			Class.forName("fr.diginamic.props.Operation");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
