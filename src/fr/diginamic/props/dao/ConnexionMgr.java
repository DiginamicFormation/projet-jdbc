package fr.diginamic.props.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import org.mariadb.jdbc.Driver;

public class ConnexionMgr {

	static {
		// Etape 1 : chargement du driver de la base (MariaDB ou de MySQL)
		try {
			DriverManager.registerDriver(new Driver());
		} catch (SQLException e) {
			System.out.println("Driver non trouvé");
		}
	}

	public static Connection getConnection() {
		try {
			ResourceBundle dataconf = ResourceBundle.getBundle("database");
			String url = dataconf.getString("url");
			String user = dataconf.getString("user");
			String password = dataconf.getString("password");

			Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (SQLException e) {
			System.err.println("impossible de se connecter à l'application");
			return null;
		}
	}

}
