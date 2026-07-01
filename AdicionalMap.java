import java.util.Map;

public class AdicionalMap {
    public static void main(String[] args) {
        System.out.println("=== Tema 16: Map.ofEntries() ===");

        Map<Integer, String> meses = Map.ofEntries(
            Map.entry(1, "Enero"),
            Map.entry(2, "Febrero"),
            Map.entry(3, "Marzo"),
            Map.entry(4, "Abril"),
            Map.entry(12, "Diciembre")
        );

        meses.forEach((llave, valor) -> System.out.println("Mes " + llave + ": " + valor));
    }
}