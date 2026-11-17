package services;
import entities.Employe;
import interfaces.IGestion;
import interfaces.IRechercheAvancee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    private final ArrayList<Employe> employes;
    public SocieteArrayList() {
        employes = new ArrayList<>();
    }
    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (nom != null && nom.equals(employe.getNom())) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }
    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }
    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }
    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Comparator<Employe> comparator = Comparator
                .comparing(Employe::getNomDepartement, Comparator.nullsFirst(String::compareTo))
                .thenComparingInt(Employe::getGrade)
                .thenComparing(Employe::getNom, Comparator.nullsFirst(String::compareTo));
        Collections.sort(employes, comparator);
    }
    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();
        for (Employe employe : employes) {
            if (nomDepartement != null && nomDepartement.equals(employe.getNomDepartement())) {
                resultat.add(employe);
            }
        }
        return resultat;
    }
}
