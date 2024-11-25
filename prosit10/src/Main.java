//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Departement d1 = new Departement(1, "Informatique", 50);
        Departement d2 = new Departement(2, "Ressources Humaines", 20);
        Departement d3 = new Departement(3, "Marketing", 30);

        DepartementHashSet gestionDepartements = new DepartementHashSet();

        // Ajouter des départements
        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);

        // Afficher les départements
        gestionDepartements.displayDepartement();

        // Rechercher un département par nom
        System.out.println("Recherche par nom : " + gestionDepartements.rechercherDepartement("Informatique"));
        System.out.println("Recherche par nom : " + gestionDepartements.rechercherDepartement("RH"));

        // Rechercher un département par objet
        System.out.println("Recherche par objet : " + gestionDepartements.rechercherDepartement(d1));

        // Supprimer un département
        gestionDepartements.supprimerDepartement(d2);
        gestionDepartements.displayDepartement();

        // Trier les départements par ID
        System.out.println("Départements triés par ID : " + gestionDepartements.trierDepartementById());
    }
}
