package fr.diginamic.props;

import java.util.List;

import fr.diginamic.props.dao.BonDao;
import fr.diginamic.props.entites.Bon;

public class TestConnection { // Contrôleur

	public static void main(String[] args) {

		// Etape 2: je récupère ma liste de bons de commande. Comment faire ???
		BonDao bonDao = new BonDao();
		List<Bon> listesBons = bonDao.extraireBons();

		for (Bon bon : listesBons) {
			System.out.println(bon);
		}
	}

}
