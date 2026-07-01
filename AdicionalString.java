public class AdicionalString {
    public static void main(String[] args) {
        System.out.println("=== Tema 20: String.isBlank() ===");

        String textoConEspacios = "      \n   \t  ";

        if (textoConEspacios.isBlank()) {
            System.out.println("La cadena está vacía o contiene solo espacios en blanco.");
        } else {
            System.out.println("La cadena contiene texto real.");
        }
    }
}