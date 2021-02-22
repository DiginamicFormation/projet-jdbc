package fr.diginamic.props.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.diginamic.props.entites.Bon;

public class BonDao {

	public List<Bon> extraireBons() {

		List<Bon> listeBons = new ArrayList<>();

		try {
			Connection connection = ConnexionMgr.getConnection();

			// Etape n°3: création du statement
			Statement statement = connection.createStatement();
			ResultSet curseur = statement.executeQuery("select * from bon"); // Accès en lecture à la table BON

			while (curseur.next()) {
				Integer id = curseur.getInt("id");
				Integer numero = curseur.getInt("numero");
				Date dateCommande = curseur.getDate("date_cmde");

				Bon bon = new Bon(id, numero, dateCommande);
				listeBons.add(bon);

			}
			curseur.close();
			statement.close();
			connection.close();

		} catch (SQLException e) {
			if (e.getErrorCode() == 1045) {
				System.out.println("Impossible de se connecter à la base de données:" + e.getMessage());
			} else {
				System.out.println("Pb de requête: " + e.getMessage());
			}
		}
		return listeBons;
	}

	public Bon extraireBon(int numero) {

		Bon bon = null;

		try {
			Connection connection = ConnexionMgr.getConnection();

			// Etape n°3: création du statement
			Statement statement = connection.createStatement();
			ResultSet curseur = statement.executeQuery("select * from bon where numero=" + numero); // Accès en lecture
																									// à la table BON
			if (curseur.next()) {
				Integer id = curseur.getInt("id");
				Date dateCommande = curseur.getDate("date_cmde");

				bon = new Bon(id, numero, dateCommande);
			}
			curseur.close();
			statement.close();
			connection.close();

		} catch (SQLException e) {
			if (e.getErrorCode() == 1045) {
				System.out.println("Impossible de se connecter à la base de données:" + e.getMessage());
			} else {
				System.out.println("Pb de requête: " + e.getMessage());
			}
		}
		return bon;
	}

}
