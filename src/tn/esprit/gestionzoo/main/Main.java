package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Friguia Park", "Bouficha");
        Zoo secondZoo = new Zoo("Belvedere", "Tunis");

        Animal lion = new Animal("felins", "Simba", 5, true);
        Animal elephant = new Animal("elephantides", "Dumbo", 10, true);
        Animal tiger = new Animal("felins", "Shere Khan", 7, true);
        Animal duplicateLion = new Animal("felins", "Simba", 5, true);

        System.out.println("ajout de quelques animaux a Friguia Park.");
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(duplicateLion);

        System.out.println("\nanimaux presents a Friguia Park :");
        myZoo.displayAnimals();

        int index = myZoo.searchAnimal(elephant);
        System.out.println("Dumbo est a la position " + index + ".");

        Animal unknownAnimal = new Animal("oiseaux", "Chouette", 2, false);
        System.out.println("Chouette est introuvable (position " + myZoo.searchAnimal(unknownAnimal) + ").");

        System.out.println("\nretrait de Dumbo : " + myZoo.removeAnimal(elephant));
        myZoo.displayAnimals();

        System.out.println("\nverifions la place et le zoo le plus rempli.");
        secondZoo.addAnimal(new Animal("oiseaux", "Picoti", 1, false));

        System.out.println(myZoo.getName() + " a encore de la place ? " + !myZoo.isZooFull());

        Zoo maxZoo = Zoo.comparerZoo(myZoo, secondZoo);
        System.out.println(maxZoo.getName() + " accueille le plus d'animaux.");
    }
}
