record Punto(int x, int y) {}

public class AdicionalRecord {
    public static void main(String[] args) {
        System.out.println("=== Tema 19: Record Patterns (Compatibilidad) ===");

        Object obj = new Punto(25, 80);

        if (obj instanceof Punto p) {
            System.out.println("Coordenada X extraída: " + p.x());
            System.out.println("Coordenada Y extraída: " + p.y());
        }
    }
}