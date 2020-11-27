package poo;

import java.util.ArrayList;

public class Livre {
 public String nom;
public Livre(String nom ) {
	this.nom=nom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}

public String toString() {
	return "nom : "+this.nom;
}
}
