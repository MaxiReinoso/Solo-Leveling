public class Main3 {
    public static void main(String[] args) {
        //cazadores
        System.out.println("Creamos a los cazadores");
        Sanador byron = new Sanador("Byron", "Mitico", 200, 1500, 100, 75);
        Asesino okarun = new Asesino("Okarun", "Legendario", 400, 1650, 100, 15);
        Mago gojo = new Mago("Gojo Satoru", "Especial", 1600, 2000, 1300, 150);
        Tanque hakari = new Tanque("Hakari", "Especial", 500, 2000, 500, 100);
        Tanque oolong = new Tanque("Oolong", "C", 60, 500, 50, 10);
        //equipo
        System.out.println("Creamos los equipos");
        Equipo shirairyu = new Equipo("Shirai Ryu");
        Equipo linkuei = new Equipo("Lin Kuei");
        System.out.println("Agregamos a los miembros");
        shirairyu.agregarCazador(gojo, okarun, byron);
        shirairyu.mostrarMiembros();
        linkuei.agregarCazador(hakari, oolong);
        linkuei.mostrarMiembros();
        //enemigos
        System.out.println("Creamos a los enemigos");
        Enemigo sukuna = new Enemigo("Sukuna", 20, 1500, 2000);
        Enemigo varonRojo = new Enemigo("Varon Rojo", 10, 200, 1700);
        Enemigo bull = new Enemigo("Bull", 11, 450, 2000);
        Enemigo mojojojo = new Enemigo("Mojojojo", 3, 150, 500);
        Enemigo broly = new Enemigo("Broly", 30, 1300, 1500);
        //mazmorras
        System.out.println("Creamos las mazmorras evo");
        MazmorraEvo shibuya = new MazmorraEvo("Shibuya", 2000);
        MazmorraEvo namek = new MazmorraEvo("Namek", 500);
        System.out.println("Agregamos a los enemigos");
        shibuya.agregarEnemigo(sukuna, bull, broly);
        shibuya.mostrarEnemigos();
        namek.agregarEnemigo(varonRojo, mojojojo);
        namek.mostrarEnemigos();
        //funciones
        System.out.println("Usamos las funciones");
        System.out.println("Mostramos las estadisticas");
        shirairyu.mostrarEstadisticas();
        linkuei.mostrarEstadisticas();
        shibuya.mostrarAmenazatotal();
        namek.mostrarAmenazatotal();
        System.out.println("Verificamos si pueden entrar a las mazmorras");
        shirairyu.puedeEntrar(shibuya);
        linkuei.puedeEntrar(namek);

    }
}