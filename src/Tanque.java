public class Tanque extends Cazador{
    private int defensa;
    private int resistencia;

    public Tanque(String nombre, String rango, int poder, int vida, int defensa, int resistencia) {
        super(nombre, rango, poder, vida);
        this.defensa = defensa;
        this.resistencia = resistencia;
    }
    public void proteger(Cazador objetivo, int dañoEntrante){
        if (resistencia < 10){
            System.out.println(nombre + " esta muy cansado para proteger");
        }else{
            int dañoRecibido;
            dañoRecibido = dañoEntrante - defensa;
            if(dañoRecibido < 0){
                dañoRecibido = 0;
            }
            this.vida -= dañoRecibido;
            this.resistencia -= 10;
            System.out.println(this.nombre + " a protegido a  " + objetivo.getNombre() + " y recibio " + dañoRecibido + " puntos de daño");
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("[Resistencia ] " + resistencia + " [Defensa] " + defensa);
        System.out.println("------------------------------------");
    }

    @Override
    public void mostrarEstadisticas() {
        super.mostrarEstadisticas();
        System.out.println("[Resistencia ] " + resistencia + " [Defensa] " + defensa);
        System.out.println("------------------------------------");
    }
}