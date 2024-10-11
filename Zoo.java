import javax.lang.model.type.NullType;

public class Zoo {
   private String name;
     private String city;
    static final int nbrCages=15;
    private Animal[] animals;
    public Zoo (String name,String city,int nbrCages)
    {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
       // this.nbrCages = nbrCages;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public int getNbrCages() {
        return nbrCages;
    }
    public Animal[] getAnimals() {
        return animals;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public void displayZoo()
    {
        System.out.println("affichage des données de zoo : ");
        System.out.println("zoo name :" +this.name);
        System.out.println("zoo city :" +this.city);
        System.out.println("nombre de cages :" + this.nbrCages);
    }
   public int searchAnimal(Animal animal)
    {
        for (int i=0;i<animals.length;i++){
            if (animals[i]!=null && animals[i].get_Name()==animal.get_Name()){
                return i;
            }

        }
        return -1;
    }

   public boolean addAnimal(Animal a)
    {


            int recherche = searchAnimal(a);
            if (recherche == -1) {
                for (int i = 0; i < animals.length; i++) {
                    if (animals[i] == null) {      //if (!isZoofull())
                        animals[i] = a;
                        return true;
                    }

                }
            } else
                System.out.println("animal existant");
            return false;


    }
    public void displayAnimals()
    {
        int nb=0;
        for (int i=0;i<animals.length;i++){
            if (animals[i]!=null) {
                nb++;
                System.out.println("aniaml"+ i);
                System.out.println(animals[i].get_Name());
                System.out.println(animals[i].get_Age());
                System.out.println(animals[i].get_family());
                System.out.println(animals[i].get_isMammal());
            }
        }
        System.out.println(nb);
    }

    public boolean removeAnimal(Animal animal)
    {
            int recherche = searchAnimal(animal);
        if (recherche==-1)
        {
            System.out.println("animal n'existe pas");
            return false;
        }
        else {

           animals[recherche]=null;
            System.out.println("l'animal suprrimé est :" + animal.get_Name());
           return true;
        }
    }
    public boolean isZooFull() {

            if (animals.length==nbrCages) {
                System.out.println("zoo full");
                return true;
            }
                return false;
        }
        public Zoo comparerZoo(Zoo z1, Zoo z2)
        {
            if (z1.getAnimals().length>z2.getAnimals().length) {
                return z1;
            }
            return z2;
        }







}
