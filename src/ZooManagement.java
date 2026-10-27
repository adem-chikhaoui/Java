import java.util.Scanner;
public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";
    public static void main(String[] args) {
        /*Animal lion =new Animal();
        lion.family="Felidae";
        lion.name="lion";
        lion.age=5;
        lion.isMammal=true;*/

        /*Zoo myZoo =new Zoo();
        myZoo.name = "Friguia";
        myZoo.city = "Bouficha";
        myZoo.nbrCages = 25;
        System.out.println ("le zoo "+ myZoo.name + " est situé a "+ myZoo.city +" et de nombre de cage est "+ myZoo.nbrCages);*/

        Animal lion=new Animal("Felidae","lion",5,true);
        Zoo myZoo=new Zoo("Friguia","Bouficha",25);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
        System.out.println(lion.toString());

        /*Scanner sc = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();
        System.out.println("saisir un nom :");
        zoo.zooName=sc.nextLine();
        while (zoo.zooName.trim().isEmpty()){
            System.out.println("le nom de zoo ne peut pa etre vide");
            zoo.zooName=sc.nextLine();
        }
        System.out.println("saisir le nombre de cage:");
        zoo.nbrCages=sc.nextInt();
        while (zoo.nbrCages <= 0){
            System.out.println("me nombre de cage doit etre positive");
            zoo.nbrCages=sc.nextInt();
        }
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");*/
    }
}