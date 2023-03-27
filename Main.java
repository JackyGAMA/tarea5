public class Main {
    public static void main(String[] args) {
        Cafetera machine = new Cafetera();
        System.out.println(machine);
        machine.servirCafe("Americano");
        machine.servirCafe("Expreso");
        machine.servirCafe("Capuchino");
        machine.mostrarRecursos();
        for (int i = 0; i < 25; i++) {
            machine.servirCafe("Americano");
        }
        for (int i = 0; i < 12; i++) {
            machine.servirCafe("Expreso");
        }
        for (int i = 0; i < 14; i++) {
            machine.servirCafe("Capuchino");
        }
        machine.mostrarRecursos();
        System.out.println(machine);
    }
}
}
}
