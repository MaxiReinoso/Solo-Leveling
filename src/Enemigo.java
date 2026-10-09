public class Enemigo {
    public String nombre;
    public int nivel;
    public int poder;
    public int vida;

    public Enemigo(String nombre, int nivel,int poder, int vida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.poder = poder;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }
    public int getPoder(){return poder;}

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void mostrarEnemigo(){
        System.out.println("------------------------------------");
        System.out.println("[Enemigo] " + nombre + " [Nivel] " + nivel + " [Poder] "+ poder + " [Vida] " + vida);
        System.out.println("------------------------------------");
    }
}
