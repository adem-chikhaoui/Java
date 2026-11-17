import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class DepartementHashSet implements IDepartement<Departement> {
    private final Set<Departement> departements = new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }
    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        return departements.stream()
                .anyMatch(departement -> java.util.Objects.equals(
                        departement.getNomDepartement(), nomDepartement));
    }
    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }
    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }
    @Override
    public void afficherDepartements() {
        departements.forEach(System.out::println);
    }
    @Override
    public void trierDepartementsParId() {
        departements.stream()
                .sorted(Comparator.comparingInt(Departement::getId))
                .forEach(System.out::println);
    }
    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        departements.stream()
                .sorted(Comparator.comparing(Departement::getNomDepartement,
                                Comparator.nullsFirst(String::compareTo))
                        .thenComparingInt(Departement::getNombreEmployes))
                .forEach(System.out::println);
    }
}
