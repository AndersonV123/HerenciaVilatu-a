
// Subclase VientoMadera
public class VientoMadera extends Instrumento {
    private String tipoMadera;
    private int numOrificios;

    public VientoMadera(String tipo, int anioFabricacion, String tipoMadera, int numOrificios) {
        super(tipo, anioFabricacion);
        this.tipoMadera = tipoMadera;
        this.numOrificios = numOrificios;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public int getNumOrificios() {
        return numOrificios;
    }

    public void setNumOrificios(int numOrificios) {
        this.numOrificios = numOrificios;
    }


    public void tocarMadera() {
        System.out.println("Tocando un instrumento de viento madera de tipo " + tipoMadera);
    }

    public void lubricar() {
        System.out.println("Lubricar el instrumento de viento madera de tipo " + tipoMadera);
    }
}
