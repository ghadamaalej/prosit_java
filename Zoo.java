public class Zoo {
    Animal[] animals;
    String name ;
    String city;
    int nbrCages;
    public Zoo(){}
    public Zoo(String name,String city,int nbrCages){
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
    }
    public void displayZoo() {
      System.out.println(this.name);
      System.out.println(this.city);
      System.out.println(this.nbrCages);
    }
}
