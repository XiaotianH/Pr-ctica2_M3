package practica2_m5;

import java.time.LocalDate;
import java.util.List;

public class Llibre {
    
    private String nom, tipus, editorial, autor;
    private LocalDate any;


    public Llibre(String nom, String tipus, String editorial, LocalDate any, String autor) {
        this.nom = nom;
        this.tipus = tipus;
        this.editorial = editorial;
        this.any = any;
        this.autor = autor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getAny() {
        return any;
    }

    public void setAny(LocalDate any) {
        this.any = any;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Llibre{" + "nom=" + nom + ", tipus=" + tipus + ", editorial=" + editorial + ", autor=" + autor + ", any=" + any + '}';
    }

    
   
    
    
    
    
    
}
