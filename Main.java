//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main(String[] args) {

/*
Animal lion=new Animal(); //// sans constructeur////
lion.family="lions";
lion.name="jjj"
lion.age=6;
lion.isMammal=true;
  Zoo myZoo=new Zoo();

*/
    // avec constructeur parametré
    Animal lion=new Animal("lions","aaa",6,true);

    Zoo zzz =new Zoo("mmm","california",20);
    Zoo z2 =new Zoo("z2","tunis",25);
    Zoo z3 =new Zoo("z3","eee",25);
    zzz.displayZoo();
    lion.displayAnimal();


    ///////////////Ajout animal dans zoo
    Animal giraffe = new Animal("Giraffe","g1",2,true);
    Animal elephant=new Animal("elephant","elf1",1,true);
    Animal tigre = new Animal("tigre","t1",5,true);
    Animal monkey=new Animal("monkey","s1",1,true);
    System.out.println("Ajout de la Girafe : " + zzz.addAnimal(giraffe));
    System.out.println("Ajout de la lion : " + zzz.addAnimal(lion));
    System.out.println("Ajout de l'elephant : " + zzz.addAnimal(elephant));
    System.out.println("Ajout de singe : " + zzz.addAnimal(monkey));
    System.out.println("Ajout de tigre : " + zzz.addAnimal(tigre));

    //verifier si on peut ajouter animal existant****
    System.out.println("Ajout de la Girafe : " + zzz.addAnimal(giraffe));

    System.out.println("display animals dans un zoo");
    zzz.displayAnimals();

    System.out.println("recherche animal dans un zoo");
    System.out.println(zzz.searchAnimal(lion));

    System.out.println("supprimer animal dans un zoo");
    System.out.println(zzz.removeAnimal(monkey));

    System.out.println("verifier si le zoo est complet");
    System.out.println(zzz.isZooFull());

    System.out.println("comparer 2 zoo");

    System.out.println(z3.comparerZoo(zzz,z2));

    ////////////////
    Aquatic a=new Aquatic("aaa","dophin",6,true,"mer");
    Terrestrial t=new Terrestrial("aaa","dophin",6,true,5);
    Dophin dophin=new Dophin(14,"aaa","dophin",6,true,"mer");
    Peinguin peinguin=new Peinguin(16,"aaa","dophin",6,true,"mer");





}
}