public class Animal {

       private String family;
         private String name;
        private int age;
         private boolean isMammal;
    public Animal() {

    }

    public Animal (String family,String name,int age,boolean isMammal)
    {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    public void displayAnimal()
    {
        System.out.println("affichage des données de l'animal");
        System.out.println(this.name);
        System.out.println(this.family);
        System.out.println(this.age);
        System.out.println(this.isMammal);
    }
    //getters
    public String get_family()
    {
     return this.family;
    }
    public String get_Name()
    {
        return this.name;
    }
    public int get_Age()
    {
        return this.age;
    }
    public boolean get_isMammal()
    {
        return this.isMammal;
    }
    ////setters
    public void set_family(String family)
    {
        this.family=family;
    }
    public void set_Name(String name)
    {
        if(name.isBlank()) //
            System.out.println("Le nom est vide !");
        else
        this.name=name;
    }
    public void set_age(int age)
    {
        if(age<0)
            System.out.println("Erreur : age invalide");
        else
            this.age=age;
    }
    public void set_isMammal(boolean isMammal)
    {
        this.isMammal=isMammal;
    }


}



