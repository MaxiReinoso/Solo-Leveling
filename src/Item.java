public class Item {
    private String nombre;
    private String tipo;
    private int valor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Item(String nombre, String tipo, int valor){
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
    }
    public void mostrarItem(){
        System.out.println("[Nombre] " + nombre + ", [Tipo] " + tipo + " [Tipo] " + valor);
    }
}