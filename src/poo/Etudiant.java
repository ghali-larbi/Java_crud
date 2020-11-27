package poo;

import java.util.ArrayList;
import java.util.Scanner;
public class Etudiant extends Personne {
	
	public String branche;
	public Etudiant(String nom,String prenom,int age,String branche) {
		super(nom,prenom,age);
		this.branche=branche;
	}
	public String getBranche() {
		return branche;
	}
	public void setBranche(String branche) {
		this.branche = branche;
	}
	@Override
	public String toString(){
		return super.toString() +" \nbranche : "+this.branche;
	}
	
}
