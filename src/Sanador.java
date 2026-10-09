public class Sanador extends Cazador{
    private int mana;
    private int capacidadCuracion;

    public Sanador(String nombre, String rango, int poder, int vida, int mana, int capacidadCuracion){
        super(nombre, rango, poder, vida);
        this.mana = mana;
        this.capacidadCuracion = capacidadCuracion;
    }

    public void curar(Cazador objetivo){
        if (this.mana < 10){
            System.out.println( this.nombre + " no tiene mana suficiente");
        }else {
            objetivo.setVida(objetivo.getVida() + this.capacidadCuracion);
            this.mana -= 10;
            System.out.println(this.nombre + " ha curado a " + objetivo.getNombre() + " por " + this.capacidadCuracion + " puntos de vida");
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("[Tipo] Sanador [Mana] " + mana + " [Capacidad Curacion] " + capacidadCuracion);
        System.out.println("------------------------------------");
    }

    @Override
    public void mostrarEstadisticas() {
        super.mostrarEstadisticas();
        System.out.println("[Mana] " + mana + " [Capacidad Curacion] " + capacidadCuracion);
        System.out.println("------------------------------------");
    }
}