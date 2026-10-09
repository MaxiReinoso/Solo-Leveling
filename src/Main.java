public class Main{
    public static void main(String[] args) {
        Cazador yuta = new Cazador("Yuta Okkotsu", "Especial", 900, 790);
        Item item1 = new Item("Anillo", "Ataque distancia", 500);
        Item item2 = new Item("Katana", "Ataque cuerpo a cuerpo", 777);
        Item item3 = new Item("Botiquin", "Curacion", 100);
        Mazmorra shibuya = new Mazmorra("Shibuya", 500);
        yuta.mostrarInformacion();
        yuta.mostrarInventario();
        yuta.entrarMazmorra(shibuya);
    }
}