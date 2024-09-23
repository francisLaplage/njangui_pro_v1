package njanguipro.com.entitie;

import java.io.Serializable;

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
	
	
	public Membre() {

	}
	public Membre(int num_membre, String nom_membre, String prenom_membre) {
		this.num_membre = num_membre;
		this.nom_membre = nom_membre;
		this.prenom_membre = prenom_membre;
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
	@Override
	public String toString() {
		return "Membre [num_membre=" + num_membre + ", nom_membre=" + nom_membre + ", prenom_membre=" + prenom_membre
				+ "]";
	}
	
	
	
	

}
