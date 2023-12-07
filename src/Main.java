public class Main {
    public static void main(String[] args) {
        // Crear instancias de Instrumento, VientoMetal y VientoMadera
        Instrumento instrumentoGenerico = new Instrumento("BRASS", 2000);
        VientoMetal trompeta = new VientoMetal("trompeta", 1995, "Latón", 3);
        VientoMadera flauta = new VientoMadera("Flauta", 2005, "Cedro", 6);

        instrumentoGenerico.afinar();
        trompeta.limpiar();
        flauta.limpiar();
        trompeta.cambiarMaterial("Plata");
        flauta.lubricar();


    }
}




