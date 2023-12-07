// Subclase VientoMetal
public class VientoMetal extends Instrumento {
    private String material;
    private int numLlaves;

    public VientoMetal(String tipo, int anioFabricacion, String material, int numLlaves) {
        super(tipo, anioFabricacion);
        this.material = material;
        this.numLlaves = numLlaves;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumLlaves() {
        return numLlaves;
    }

    public void setNumLlaves(int numLlaves) {
        this.numLlaves = numLlaves;
    }
    public void  LlavesMetal(){
        System.out.println("El instrumento " +getTipo() +" tiene "+ numLlaves);
    }


    public void tocarMetal() {
        System.out.println("Tocando un instrumento de viento metal hecho de " + material);
    }


    public void cambiarMaterial(String nuevoMaterial) {
        System.out.println("Cambiar material de " + material + " a " + nuevoMaterial);
        material = nuevoMaterial;
    }
}
