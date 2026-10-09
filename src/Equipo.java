import java.util.ArrayList;

public class Equipo {
    public String nombre;
    private ArrayList<Cazador> cazadores = new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCazador(Cazador c){
        cazadores.add(c);
    }
    public void agregarCazador(Cazador c, Cazador d){cazadores.add(c);cazadores.add(d);}
    public void agregarCazador(Cazador c, Cazador d, Cazador e){
        cazadores.add(c);
        cazadores.add(d);
        cazadores.add(e);
    }

    public void mostrarMiembros(    ){
        System.out.println("------------------------------------");
        System.out.println("Miembros de " + nombre);
        for(Cazador c : this.cazadores){
            System.out.println(c.getNombre());
        }
        System.out.println("------------------------------------");
    }

    public int calcularPoder(){
        int poderTotal;
        poderTotal = 0;
        for(Cazador c : this.cazadores){
            poderTotal = poderTotal + c.getPoder();
        }
        return poderTotal;
    }
    public void mostrarEstadisticas(){
        System.out.println("[Equipo] " + nombre + " [Poder] " + this.calcularPoder());
    }
    public boolean puedeEntrar(MazmorraEvo mazmorra) {
        boolean tTanque = false;
        boolean tSanador = false;
        for (Cazador c : this.cazadores){
            if (c instanceof Tanque){
                tTanque = true;
            }
            if (c instanceof Sanador){
                tSanador = true;
            }
        }
        int miembros = this.cazadores.size();
        int poderTotal = this.calcularPoder();
        if (miembros >= 3 && poderTotal >= mazmorra.dificultad) {
            System.out.println("El equipo " + nombre + " ha ingresado a " + mazmorra.getNombre());
            return true;
        } else {
            System.out.println("El equipo " + nombre + " no puede ingresar a " + mazmorra.getNombre());
            return false;
        }
    }
}
