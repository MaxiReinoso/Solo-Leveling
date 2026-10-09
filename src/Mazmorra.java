public class Mazmorra {
    private String nombre;
    private int dificultad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
    public Mazmorra(String nombre, int dificultad){
        this.nombre = nombre;
        this.dificultad = dificultad;
    }

    public void mostrarMazmorra(){
        System.out.println("El nombre de la mazmorra es " + nombre + " y su dificultad es " + dificultad);
    }
}