public class Mago extends Cazador{
    private int mana;
    private int poderMagico;

    public Mago(String nombre, String rango, int poder, int vida, int mana, int poderMagico) {
        super(nombre, rango, poder, vida);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public void lanzarHechizo(Cazador objetivo){
        if(this.mana < 10){
            System.out.println( this.nombre + " no tiene mana suficiente");
        }else{
            objetivo.setVida(objetivo.getVida() - this.poderMagico);
            this.mana -= 10;
            System.out.println(this.nombre + " ha atacado a " + objetivo.getNombre() + " por " + this.poderMagico + " puntos de vida");
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("[Tipo] Mago [Mana] " + mana + " [Poder Magico] " + poderMagico);
        System.out.println("------------------------------------");
    }

    @Override
    public void mostrarEstadisticas() {
        super.mostrarEstadisticas();
        System.out.println("[Mana] " + mana + " [Poder Magico] " + poderMagico);
        System.out.println("------------------------------------");
    }
}