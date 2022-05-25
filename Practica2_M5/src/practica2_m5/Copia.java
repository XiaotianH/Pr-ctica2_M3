package practica2_m5;

import java.time.LocalDate;

public class Copia extends Llibre{
    
    private String identificador, estatLlibre;

    public Copia(String nom, String tipus, String editorial, LocalDate any, String autor, String identificador, String estatLlibre) {
        super(nom, tipus, editorial, any, autor);
        this.identificador = identificador;
        this.estatLlibre = estatLlibre;     
    }


    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    
    
}
