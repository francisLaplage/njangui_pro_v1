package njanguipro.com.entitie;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Membre")
public class Membre implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num_membre;
	private String nom_membre;
	private String prenom_membre;
	private String adresse_membre;
	private String tel_membre;
	private String image_membre;
	private String nom_pere_membre;
	private String nom_mere_membre;
	private Date date_inscription_membre;
	private int status_membre;
	private String email;
	private String password;
	private String fonction_membre;
	
	
	public Membre() {

	}


	public Membre(int num_membre, String nom_membre, String prenom_membre, String adresse_membre, String tel_membre,
			String image_membre, String nom_pere_membre, String nom_mere_membre, Date date_inscription_membre,
			int status_membre, String email, String password, String fonction_membre) {
		super();
		this.num_membre = num_membre;
		this.nom_membre = nom_membre;
		this.prenom_membre = prenom_membre;
		this.adresse_membre = adresse_membre;
		this.tel_membre = tel_membre;
		this.image_membre = image_membre;
		this.nom_pere_membre = nom_pere_membre;
		this.nom_mere_membre = nom_mere_membre;
		this.date_inscription_membre = date_inscription_membre;
		this.status_membre = status_membre;
		this.email = email;
		this.password = password;
		this.fonction_membre = fonction_membre;
	}


	public int getNum_membre() {
		return num_membre;
	}


	public void setNum_membre(int num_membre) {
		this.num_membre = num_membre;
	}


	public String getNom_membre() {
		return nom_membre;
	}


	public void setNom_membre(String nom_membre) {
		this.nom_membre = nom_membre;
	}


	public String getPrenom_membre() {
		return prenom_membre;
	}


	public void setPrenom_membre(String prenom_membre) {
		this.prenom_membre = prenom_membre;
	}


	public String getAdresse_membre() {
		return adresse_membre;
	}


	public void setAdresse_membre(String adresse_membre) {
		this.adresse_membre = adresse_membre;
	}


	public String getTel_membre() {
		return tel_membre;
	}


	public void setTel_membre(String tel_membre) {
		this.tel_membre = tel_membre;
	}


	public String getImage_membre() {
		return image_membre;
	}


	public void setImage_membre(String image_membre) {
		this.image_membre = image_membre;
	}


	public String getNom_pere_membre() {
		return nom_pere_membre;
	}


	public void setNom_pere_membre(String nom_pere_membre) {
		this.nom_pere_membre = nom_pere_membre;
	}


	public String getNom_mere_membre() {
		return nom_mere_membre;
	}


	public void setNom_mere_membre(String nom_mere_membre) {
		this.nom_mere_membre = nom_mere_membre;
	}


	public Date getDate_inscription_membre() {
		return date_inscription_membre;
	}


	public void setDate_inscription_membre(Date date_inscription_membre) {
		this.date_inscription_membre = date_inscription_membre;
	}


	public int getStatus_membre() {
		return status_membre;
	}


	public void setStatus_membre(int status_membre) {
		this.status_membre = status_membre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFonction_membre() {
		return fonction_membre;
	}


	public void setFonction_membre(String fonction_membre) {
		this.fonction_membre = fonction_membre;
	}


	@Override
	public String toString() {
		return "Membre [num_membre=" + num_membre + ", nom_membre=" + nom_membre + ", prenom_membre=" + prenom_membre
				+ ", adresse_membre=" + adresse_membre + ", tel_membre=" + tel_membre + ", image_membre=" + image_membre
				+ ", nom_pere_membre=" + nom_pere_membre + ", nom_mere_membre=" + nom_mere_membre
				+ ", date_inscription_membre=" + date_inscription_membre + ", status_membre=" + status_membre
				+ ", email=" + email + ", password=" + password + ", fonction_membre=" + fonction_membre + "]";
	}


	

}
