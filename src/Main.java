public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();
        gestionDepartements.ajouterDepartement(new Departement(1, "informatique", 25));
        gestionDepartements.ajouterDepartement(new Departement(2, "ressources humaines", 10));
        gestionDepartements.ajouterDepartement(new Departement(3, "comptabilite", 15));
        gestionDepartements.afficherDepartements();
        gestionDepartements.trierDepartementsParId();
        gestionDepartements.trierDepartementsParNomEtNombreEmployes();
    }
}
