//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Animal lion = new Animal();
        Zoo zoo = new Zoo();
        zoo.nbrCages=25;
        Animal lion2 = new Animal("lion","aa",20,true);
        Zoo myzoo= new Zoo("cccc","a",20);
        myzoo.displayZoo();
        System.out.println(myzoo);
        System.out.println(myzoo.toString());
        lion2.displayAnimal();
        System.out.println(lion2);
        System.out.println(lion2.toString());

    }
}