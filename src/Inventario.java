import java.util.ArrayList;

public class Inventario{
    private ArrayList<Item> items = new ArrayList<>();

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }
    public void mostrarItems(){
        for (Item I: items){
            System.out.println("Item: " + I.getNombre() + " | Tipo: " + I.getTipo() + " | Valor: " + I.getValor());
        }
    }
    public void agregarItems(Item i){
        items.add(i);
    }

    public void agregarItems(Item i, Item j){
        items.add(i);
        items.add(j);
    }
}
