public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;
    //constructeur
    public Zoo() {
        this.animals = new Animal[25];
    }
    public Zoo(String name,String city,int nbrCages){
        this.animals = new Animal[25];
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
    }
    public void displayAnimals(){
        boolean estVide = true;
        for (int i=0;i<animals.length;i++){
            if (animals[i] != null){
                System.out.println(animals[i]);
                estVide=false;
            }
        }
        if (estVide){
            System.out.println("le zoo est vide");
        }
    }
    int searchAnimal(Animal animal){
        for (int i=0;i<animals.length;i++){
            if (animal.name == animals[i].name){
                return i;
            }
        }
        return -1;
    }


    /*public void displayZoo(){
        System.out.println ("le zoo "+ name + " est situé a "+ city +" et de nombre de cage est "+ nbrCages);
    }*/
    public boolean addAnimal(Animal animal){
        for (int i=0; i< animals.length ;i++){
            if (animals[i] == null){
                animals[i]=animal;
                return true ;
            }
        }
        System.out.println("le zoo est plein");
        return false;
    }
    @Override
    public String toString(){
        return "zoo name: "+name+" city: "+city+" nbrCages: "+nbrCages;
    }
}
