// Clase maestra Instrumento
public class Instrumento {
    private String tipo;
    private int anioFabricacion;

    public Instrumento(String tipo, int anioFabricacion) {
        this.tipo = tipo;
        this.anioFabricacion = anioFabricacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }


    public void tocar() {
        System.out.println("Tocando el instrumento " + tipo);
    }

    public void afinar() {
        System.out.println("Afinando el instrumento " + tipo);
    }

    public void limpiar() {
        System.out.println("Limpiando el instrumento " + tipo);
    }
}