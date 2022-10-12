package accesodatos;

public interface IAccesoDatos {

    //las variables en una interface se comportan como constantes
    int MAX_REGISTRO = 10;
     
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
