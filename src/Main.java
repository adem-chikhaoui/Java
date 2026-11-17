import entities.Employe;
import services.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
        Employe employe1 = new Employe(3, "trabelsi", "amine", "informatique", 2);
        Employe employe2 = new Employe(1, "ben ali", "sonia", "ressources humaines", 1);
        Employe employe3 = new Employe(2, "gharbi", "yassine", "informatique", 1);
        societe.ajouterEmploye(employe1);
        societe.ajouterEmploye(employe2);
        societe.ajouterEmploye(employe3);
        System.out.println("employes :");
        societe.displayEmploye();
        System.out.println("recherche par nom : " + societe.rechercherEmploye("gharbi"));
        System.out.println("recherche par objet : " + societe.rechercherEmploye(employe1));
        System.out.println("tri par id :");
        societe.trierEmployeParId();
        societe.displayEmploye();
        System.out.println("tri par departement, grade puis nom :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();
        System.out.println("employes du departement informatique :");
        for (Employe employe : societe.rechercherParDepartement("informatique")) {
            System.out.println(employe);
        }
        societe.supprimerEmploye(employe2);
        System.out.println("apres suppression :");
        societe.displayEmploye();
    }
}
