package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Entreprise {
	private String nomE ; 
 HashMap<Integer, Salarie> liste;
	public Entreprise() {
		liste = new HashMap();
	}
public Entreprise(String nomE) {
	super();
	this.nomE = nomE;
}
public String getNomE() {
	return nomE;
}
public void setNomE(String nomE) {
	this.nomE = nomE;
}

@Override
public String toString() {
	return "Entreprise [nomE=" + nomE + ", liste=" + liste + "]";
}
int getNBemployes() {

	return liste.size();
}
void affiche() {
	
	liste.forEach((key,value)->{
		System.out.println(key+" = "+value);
	});
	System.out.println("la taille de HashMap : "+ this.getNBemployes());

	

}
public void addEmploye(Integer s) {
	Scanner cont = new Scanner(System.in);
	System.out.println("matricule :");
	int mat = cont.nextInt();
	 cont.nextLine();
	System.out.println("nom :");
	String Nom = cont.nextLine();
	System.out.println("Email :");
	String Email = cont.next();
	System.out.println("annee :");
	double annee = cont.nextDouble();
	System.out.println("salaire :");
	double salaire = cont.nextDouble();
	System.out.println("categorie :");
	String categorie = cont.next();

	Salarie S = new Salarie(mat,Nom,Email,annee, salaire,categorie);
	liste.put(s,S);

}
}
