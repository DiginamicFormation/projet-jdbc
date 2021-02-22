package fr.diginamic.props.entites;

import java.sql.Date;

/**
 * Représente un bon de commande
 * 
 * @author RichardBONNAMY
 *
 */
public class Bon {

	private Integer id;
	private Integer numero;
	private Date dateCommande;

	public Bon(Integer id, Integer numero, Date dateCommande) {
		super();
		this.id = id;
		this.numero = numero;
		this.dateCommande = dateCommande;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @return the dateCommande
	 */
	public Date getDateCommande() {
		return dateCommande;
	}

	/**
	 * @param dateCommande the dateCommande to set
	 */
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
}
