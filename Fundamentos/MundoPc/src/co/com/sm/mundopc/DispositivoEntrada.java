package co.com.sm.mundopc;

/**
 *
 * @author david
 */
public class DispositivoEntrada {

    private int idDispositivoEntrada;
    private String tipoEntrada;
    private String marca;
    private static int contadorDispositivoEntrada;

    public DispositivoEntrada(){
      this.idDispositivoEntrada=++DispositivoEntrada.contadorDispositivoEntrada;
    }
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this();
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public void setIdDispositivoEntrada(int idDispositivoEntrada) {
        this.idDispositivoEntrada = idDispositivoEntrada;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    @Override
    public String toString() {
        return "DispositivoEntrada{" + "idDispositivoEntrada=" + idDispositivoEntrada + ", tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
    
    
    
}
