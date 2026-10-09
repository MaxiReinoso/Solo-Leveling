public class Cazador {
    protected String nombre;
    protected String rango;
    protected int poder;
    protected int vida;
    protected Inventario inventario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getPoder() {

        return poder;
    }

    public void setPoder(int poder) {

        this.poder = poder;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Cazador(String nombre, String rango, int poder, int vida){
        this.nombre = nombre;
        this.rango = rango;
        this.poder = poder;
        this.vida = vida;
        this.inventario = new Inventario();
    }

    public void mostrarInformacion(){
        System.out.println("------------------------------------");
        System.out.println("[Cazador] " + nombre + " [Poder] " + poder + " [Vida] " + vida + " [Rango] " + rango);
    }
    public void mostrarInventario(){
        System.out.println("------------------------------------");
        System.out.println("Los elementos del inventario de " + nombre + " son: ");
        for (Item item: inventario.getItems() ){
            System.out.println("[Nombre] " + item.getNombre() + " [Tipo] " + item.getTipo() + " [Valor] " + item.getValor());
        }
    }
    public void mostrarEstadisticas(){
        System.out.println("------------------------------------");
        System.out.println("[Cazador] " + nombre + " [Poder] " + poder + " [Vida] " + vida);
    }
    public void entrarMazmorra(Mazmorra mazmorra){
        System.out.println(nombre + " ha cruzado el portal a: " + mazmorra.getNombre());
    }
}
