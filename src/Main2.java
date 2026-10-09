public class Main2 {
    public static void main(String[] args){
        //creo los personajes
        Sanador byron = new Sanador("Byron", "Mitico", 200, 1500, 100, 75);
        Asesino okarun = new Asesino("Okarun", "Legendario", 400, 1650, 100, 15);
        Mago magoElectrico = new Mago("Mago Electrico", "Legendario", 350, 1500, 130, 100);
        Tanque hakari = new Tanque("Hakari", "Especial",500, 2000, 500, 100);
        //muestro su informacion
        byron.mostrarInformacion();
        okarun.mostrarInformacion();
        magoElectrico.mostrarInformacion();
        hakari.mostrarInformacion();
        //los hago entrar a mazmorra
        Mazmorra shibuya = new Mazmorra("Shibuya", 500);
        byron.entrarMazmorra(shibuya);
        okarun.entrarMazmorra(shibuya);
        magoElectrico.entrarMazmorra(shibuya);
        hakari.entrarMazmorra(shibuya);
        //hago sus respectivas acciones y voy mostrando "progreso"
        magoElectrico.lanzarHechizo(okarun);
        okarun.mostrarEstadisticas();
        hakari.proteger(okarun,900);
        hakari.mostrarEstadisticas();
        byron.curar(hakari);
        hakari.mostrarEstadisticas();
        okarun.atacarSigilosamente(magoElectrico);
        magoElectrico.mostrarEstadisticas();
    }
}
