package domain;

/**
 *
 * @author david
 */
public enum TipoEscritura {
    CLASICO("Escritura a Mano"),
    MODERNO("EScritura Digital");

    private final String descripcion;

    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
