public class AdicionalSwitch {
    public static void main(String[] args) {
        System.out.println("=== Tema 18: Pattern Matching con Switch (Compatibilidad) ===");

        Object evaluarDato = "Hola Mundo, soy un String";

        if (evaluarDato instanceof Integer i) {
            System.out.println("El dato es un Entero con valor: " + i);
        } else if (evaluarDato instanceof String s) {
            System.out.println("El dato es un String en minúsculas: " + s.toLowerCase());
        } else {
            System.out.println("Es otro tipo de objeto desconocido.");
        }
    }
}