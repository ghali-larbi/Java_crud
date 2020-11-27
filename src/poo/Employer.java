package poo;

import java.util.ArrayList;

public class Employer extends Personne {
	public int salaire;
	public Employer(String nom,String prenom,int age,int salaire) {
		super(nom,prenom,age);
		this.salaire=salaire;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	@Override
	public String toString(){
		return super.toString() +" \nsalaire : "+this.salaire;
	}
		
}
