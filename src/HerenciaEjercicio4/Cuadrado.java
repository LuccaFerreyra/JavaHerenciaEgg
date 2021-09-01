
package HerenciaEjercicio4;


public class Cuadrado implements FiguraGeometrica {
    
    private double lado;
    private double areaCuadrado;

    public Cuadrado(double lado) {
        this.lado=lado;
    
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAreaCuadrado() {
        return areaCuadrado;
    }

    public void setAreaCuadrado(double areaCuadrado) {
        this.areaCuadrado = areaCuadrado;
    }
 
    @Override
    public void area(){
    areaCuadrado=lado * lado;
    
    }

}
