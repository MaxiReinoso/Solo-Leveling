import java.util.ArrayList;

public class MazmorraEvo {
    public String nombre;
    public int dificultad;
    private ArrayList<Enemigo> enemigos = new ArrayList<>();

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

    public MazmorraEvo(String nombre, int dificultad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
    }
    public void agregarEnemigo(Enemigo c){
        enemigos.add(c);
    }
    public void agregarEnemigo(Enemigo c, Enemigo d){
        enemigos.add(c);
        enemigos.add(d);
    }
    public void agregarEnemigo(Enemigo c, Enemigo d, Enemigo e){
        enemigos.add(c);
        enemigos.add(d);
        enemigos.add(e);
    }
    public void mostrarEnemigos(){
        System.out.println("------------------------------------");
        System.out.println("Enemigos de " + nombre);
        for(Enemigo c : this.enemigos){
            System.out.println(c.getNombre());
        }
        System.out.println("------------------------------------");
    }
    public int calcularAmenazaTotal(){
        int poderTotal;
        poderTotal = 0;
        for(Enemigo c : this.enemigos){
            poderTotal = poderTotal + c.getPoder();
        }
        return poderTotal;
    }
    public void mostrarAmenazatotal(){
        System.out.println("[Mazmorra] " + nombre + " [Dificultad] " + dificultad +" [Poder] " + this.calcularAmenazaTotal());
    }
}