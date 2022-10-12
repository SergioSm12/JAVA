package domain;

public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }
    
    //implementacion del metodo de la clase abstracta
    @Override
    public void dibujar(){
        System.out.println("Se imprime un" + this.getClass().getSimpleName());
    }
}
