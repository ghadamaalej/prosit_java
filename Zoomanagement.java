import java.util.Scanner;

public class Zoomanagement {

    int nbrCages=20;
    String zooName="my zoo";
    public static void main(String[] args) {
        Zoomanagement zoo =  new Zoomanagement();
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages ");
        Scanner scanner=new Scanner(System.in);
        System.out.print("entrer le nombres de cages :");
        zoo.nbrCages=scanner.nextInt();
        System.out.println(zoo.nbrCages);
        System.out.print("entrer le nom de zoo :");
        zoo.zooName =scanner.next();
        System.out.println(zoo.zooName);
    }
}

