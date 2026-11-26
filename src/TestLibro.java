public class TestLibro {
    public static void main(String[] args) {
        System.out.println("--- CREACIÓN Y COMPARACIÓN DE LIBROS ---");

        Libro libro1 = new Libro("Super Mario Maker Artbook", "Nintendo", 2015);
        Libro libro2 = new Libro("Miraculous: Las aventuras de Ladybug");
        Libro libro3 = new Libro("Hilda y el rey de la montaña", "Luke Pearson");

        libro2.setAutor("Nicole D'Andria");
        libro2.setAnio(2016);
        libro3.setAnio(2019);

        System.out.println("Libro 1: " + libro1);
        System.out.println("Libro 2: " + libro2);
        System.out.println("Libro 3: " + libro3);

        Libro libro4 = new Libro("Pokemon Escarlata y Purpura", "Satoshi Yamamoto", 2023);
        Libro libro5 = new Libro("Pokemon Escarlata y Purpura", "Satoshi Yamamoto", 2023);

        System.out.println("Libro 4 == Libro 5: " + (libro4 == libro5));
        System.out.println("Libro 4 equals (): " + libro4.equals(libro5));

        System.out.println("Libro 4 equals null: " + libro4.equals(null));
        System.out.println("Libro 4 equals texto: " + libro4.equals("Libro 4"));
        System.out.println("Libro 4 equals libro4: " + libro4.equals(libro4));

        System.out.println("HashCode Libro 4: " + libro4.hashCode());
        System.out.println("Hashcode Libro 5: " + libro5.hashCode());
        System.out.println("hashcode Libro 2: " + libro2.hashCode());
    }
}
