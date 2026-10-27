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
    public void displayZoo(){
        System.out.println ("le zoo "+ name + " est situé a "+ city +" et de nombre de cage est "+ nbrCages);
    }
    @Override
    public String toString(){
        return "zoo name: "+name+" city: "+city+" nbrCages: "+nbrCages;
    }
}
