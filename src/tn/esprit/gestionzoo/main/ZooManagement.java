package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        /* Instruction 1
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
         */
        //Instruction 2
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = sc.nextLine();

        int nbrCages;
        do {
            System.out.print("Entrez le nombre de cages (entier positif) : ");
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);

        System.out.println(zooName + " comporte " + nbrCages + " cages.");
        //Prosit 2
        Animal lion = new Animal("Félidé", "Lion", 5, true);

        Zoo myZoo = new Zoo("Parc Animalier", "Tunis");
       // myZoo.nbrCages = 20;

       // System.out.println("tn.esprit.gestionzoo.entities.Zoo : " + myZoo.name + " à " + myZoo.city);
        System.out.println("tn.esprit.gestionzoo.entities.Animal : " + lion);

        Animal lion1 = new Animal("Félidé", "Lion", 5, true);
       // tn.esprit.gestionzoo.entities.Zoo myZoo1 = new tn.esprit.gestionzoo.entities.Zoo("Parc Animalier", "Tunis", 20);

        System.out.println("tn.esprit.gestionzoo.entities.Animal créé : " + lion1);
        //System.out.println("tn.esprit.gestionzoo.entities.Zoo créé : " + myZoo1.name + " (" + myZoo.city + ")");

        myZoo.displayZoo();
        System.out.println(myZoo);
        //Prosit 3
        Zoo zoo1 = new Zoo("tn.esprit.gestionzoo.entities.Zoo Esprit", "Tunis");
        Zoo zoo2 = new Zoo("tn.esprit.gestionzoo.entities.Zoo Safari", "Sousse");

        Animal tigre = new Animal("Félidé", "Shere Khan", 7, true);
        Animal lion2 = new Animal("Félidé", "Lion", 5, true); // identique à lion
        // Test Ajout
        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo1.addAnimal(lion2); // doit être refusé (doublon)

        // Test Affichage
        zoo1.displayAnimals();

        // Test Recherche
        System.out.println("Indice : " + zoo1.searchAnimal(lion));
        System.out.println("Indice : " + zoo1.searchAnimal(tigre));

        // Test Suppression
        zoo1.removeAnimal(tigre);
        zoo1.displayAnimals();

        // Test tn.esprit.gestionzoo.entities.Zoo plein
        for (int i = 0; i < 30; i++) {
            zoo1.addAnimal(new Animal("TestFamily", "tn.esprit.gestionzoo.entities.Animal" + i, 2, false));
        }
        System.out.println("tn.esprit.gestionzoo.entities.Zoo plein " + zoo1.isZooFull());

        // Test Comparaison
        zoo2.addAnimal(new Animal("Canidés", "Wolf", 4, true));
        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("tn.esprit.gestionzoo.entities.Zoo avec le plus d'animaux : " + plusGrand);
        //--------------------- Prosit 5
        // ✅ Instruction 21 : Constructeurs par défaut
        System.out.println("=== Constructeurs par défaut ===");
        Terrestrial t1 = new Terrestrial();
        Dolphin d1 = new Dolphin();
        Penguin p1 = new Penguin();

        System.out.println(t1);
        System.out.println(d1);
        System.out.println(p1);

        // ✅ Instruction 22 : Constructeurs paramétrés
        System.out.println("\n=== Constructeurs paramétrés ===");
        Terrestrial t2 = new Terrestrial("Felidae", "Lion", 5, true, 4);
        Dolphin d2 = new Dolphin("Delphinidae", "Flipper", 6, true, "Sea", 25.5f);
        Penguin p2 = new Penguin("Spheniscidae", "Pingo", 3, false, "Iceberg", 15.0f);

        System.out.println(t2);
        System.out.println(d2);
        System.out.println(p2);

        // ✅ Prosit 6 : tableau polymorphique d'animaux aquatiques
        System.out.println("=== Prosit 6 ===");
        myZoo.addAquatic(d2);
        myZoo.addAquatic(p2);
        myZoo.addAquatic(new Dolphin("Delphinidae", "Dolly", 8, true, "Sea", 30.0f));
        myZoo.swimAllAquatics();
        System.out.println("Profondeur maximale des pingouins : "
                + myZoo.maxPenguinSwimmingDepth() + " mètres");
        myZoo.displayNumberOfAquaticsByType();

        Aquatic sameAsP2 = new Penguin("Other family", "Pingo", 3, true, "Iceberg", 20.0f);
        System.out.println("Pingouins identiques : " + p2.equals(sameAsP2));
    }
}
