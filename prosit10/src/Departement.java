import java.util.Objects;

public class Departement {
    int id;
    String nom_departement;
    int nb_departement;
    public Departement() {}
    public Departement(int id, String nom_departement,int nb_departement) {
        this.id = id;
        this.nom_departement = nom_departement;
        this.nb_departement = nb_departement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public int getNb_departement() {
        return nb_departement;
    }

    public void setNb_departement(int nb_departement) {
        this.nb_departement = nb_departement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement that)) return false;
        return id == that.id && Objects.equals(nom_departement, that.nom_departement);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom_departement='" + nom_departement + '\'' +
                ", nb_departement=" + nb_departement +
                '}';
    }
}
