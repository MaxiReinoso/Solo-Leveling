public class Asesino extends Cazador{
    private int velocidad;
    private int critico;

    public Asesino(String nombre, String rango, int poder, int vida, int velocidad, int critico) {
        super(nombre, rango, poder, vida);
        this.velocidad = velocidad;
        this.critico = critico;
    }
    public void atacarSigilosamente(Cazador objetivo){
        int dañoFinal;

        if (new java.util.Random().nextInt(100) < this.critico){
            dañoFinal = (int)(this.poder * 1.5);
            objetivo.setVida(objetivo.getVida() - dañoFinal);
            System.out.println(nombre + " ataco a " + objetivo.getNombre() + ", activo ataque critico y este perdio " + dañoFinal + " puntos de vida");
        }else {
            dañoFinal = this.poder;
            objetivo.setVida(objetivo.getVida() - dañoFinal);
            System.out.println(nombre + " ataco a " + objetivo.getNombre() + " y este perdio " + dañoFinal + " puntos de vida");
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("[Tipo] Asesisno [Velocidad (Km/H)] " + velocidad + " [Critico] " + critico);
        System.out.println("------------------------------------");
    }

    @Override
    public void mostrarEstadisticas() {
        super.mostrarEstadisticas();
        System.out.println("[Velocidad] " + velocidad);
        System.out.println("------------------------------------");

    }
}