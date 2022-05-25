package practica2_m5;

import java.time.LocalDate;

public class Autor {
    
    private String nom, nacionalitat;
    private LocalDate dataNaixement;

    public Autor(String nom, String nacionalitat, LocalDate dataNaixement) {
        this.nom = nom;
        this.nacionalitat = nacionalitat;
        this.dataNaixement = dataNaixement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    @Override
    public String toString() {
        return "Autor{" + "nom=" + nom + ", nacionalitat=" + nacionalitat + ", dataNaixement=" + dataNaixement + '}';
    }
    
    
    
}
