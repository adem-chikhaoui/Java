import java.util.Scanner;
public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
    }
}
