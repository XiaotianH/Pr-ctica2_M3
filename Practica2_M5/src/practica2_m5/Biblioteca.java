package practica2_m5;

import java.util.List;

public class Biblioteca {
    
    
    private List<Llibre>llibres;

    public Biblioteca(List<Llibre> llibres) {
        this.llibres = llibres;
    }

    public List<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(List<Llibre> llibres) {
        this.llibres = llibres;
    }
    
    
    
    
}
