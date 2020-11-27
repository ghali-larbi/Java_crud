package poo;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args ) {
		
		 
		
		 
		  
       ArrayList<Etudiant> e=new ArrayList<Etudiant>();
       ArrayList<Employer> em=new ArrayList<Employer>();
       ArrayList<Livre> l=new ArrayList<Livre>();
		Scanner scanner=new Scanner(System.in);
	System.out.print("choisie la classe etudiant/employer/livre");
	String choix=scanner.next();
	 switch(choix) {
	 case "etudiant" :
			
			 System.out.println("information d'etudiant");
			 System.out.println("nom etudiant");
			   String nom=scanner.next();
			   System.out.println("prenom etudiant");
			   String prenom=scanner.next();
			   System.out.println("age etudiant");
			   int age=scanner.nextInt();
			   System.out.println("branche etudiant");
			   String branche=scanner.next();
			 Etudiant etudiant1=new Etudiant(nom,prenom,age,branche);
	       e.add(etudiant1);
		   System.out.println(etudiant1.toString());
		   System.out.println("choisie attribut pour la modifier");
		   String attr=scanner.next();
		   System.out.println("modifier avec :");
		   String nomModifier=scanner.next();
		   if(attr.equals("nom")) {
			   etudiant1.setNom(nomModifier);
		   }
		   if(attr.equals("prenom")) {
			   etudiant1.setPrenom(nomModifier);
		   }
		   if(attr.equals("age")) {
			  etudiant1.setAge(Integer.parseInt(nomModifier));
		   }
		   if(attr.equals("branche")) {
			   etudiant1.setBranche(nomModifier);
		   }
		   for (int i = 0; i < e.size(); i++) {
				System.out.println(e.get(i));
			}
		   System.out.println("vous voulez supprimer etudiant");
		   e.remove(etudiant1);
		   for (int i = 0; i < e.size(); i++) {
			System.out.println(e.get(i));
		}
		  break;
	 case "employer" :
		 System.out.println("information d'employer");
		 System.out.println("nom employer");
		   String nom2=scanner.next();
		   System.out.println("prenom  prenom");
		   String prenom2=scanner.next();
		   System.out.println("age employer");
		   int age2=scanner.nextInt();
		   System.out.println("salaire ");
		   int salaire=scanner.nextInt();
		   Employer employer1=new Employer(nom2,prenom2,age2,salaire);
		  em.add(employer1);
		   for (int i = 0; i < em.size(); i++) {
				System.out.println(em.get(i));
			}
		   System.out.println("choisie attribut pour la modifier");
		   String attr2=scanner.next();
		   System.out.println("modifier avec :");
		   String nomModifier2=scanner.next();
		   if(attr2.equals("nom")) {
			   employer1.setNom(nomModifier2);
		   }
		   if(attr2.equals("prenom")) {
			   employer1.setPrenom(nomModifier2);
		   }
		   if(attr2.equals("age")) {
			  employer1.setAge(Integer.parseInt(nomModifier2));
		   }
		 
		   if(attr2 != "salaire") {
			  employer1.setSalaire(Integer.parseInt(nomModifier2));
		   }
		   for (int i = 0; i < em.size(); i++) {
				System.out.println(em.get(i));
			}
		   System.out.println("vous voulez supprimer employer");
		   em.remove(employer1);
		   for (int i = 0; i < em.size(); i++) {
			System.out.println(em.get(i));
		}   
		 break;
	 case "livre" :
		 System.out.println("information de livre");
		 System.out.println("nom livre");
		   String nomLivre=scanner.next();
		   Livre livre1=new Livre(nomLivre);
		   l.add(livre1);
		   for (int i = 0; i < l.size(); i++) {
				System.out.println(l.get(i));
			}
		   System.out.println(" modifier avec");
		   String attr3=scanner.next();
		   livre1.setNom(attr3);
		   for (int i = 0; i < l.size(); i++) {
				System.out.println(l.get(i));
			}
		   System.out.println("vous voulez supprimer livre");
		   l.remove(livre1);
		   for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		 break;
	 }
}
}