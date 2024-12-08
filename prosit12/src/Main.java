import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EtudiantManagement management = new EtudiantManagement();

        List<Etudiant> etudiants = Arrays.asList(
                new Etudiant(1, "ghada", 20),
                new Etudiant(2, "Bob", 22),
                new Etudiant(3, "Charlie", 19)
        );

        System.out.println("Tous les étudiants :");
        management.displayStudents(etudiants, System.out::println);


        System.out.println("\nÉtudiants âgés de plus de 20 ans :");
        management.displayStudentsByFilter(etudiants, e -> e.getAge() > 20, System.out::println);

        String noms = management.returnStudentsNames(etudiants, Etudiant::getNom);
        System.out.println("\nNoms des étudiants : " + noms);


        Etudiant newStudent = management.createStudent(() -> new Etudiant(4, "Diane", 21));
        System.out.println("\nNouvel étudiant créé : " + newStudent);

        System.out.println("\n Étudiants triés par ID :");
        List<Etudiant> etudiantsTries = management.sortStudentsById(etudiants, Comparator.comparingInt(Etudiant::getId));
        etudiantsTries.forEach(System.out::println);
    }
    }
