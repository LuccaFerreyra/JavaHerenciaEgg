
package HerenciaEjercicio4;


public class Circulo implements FiguraGeometrica {
private double radio;
private double areaRadio;
static final double pi=3.14;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAreaRadio() {
        return areaRadio;
    }

    public void setAreaRadio(double areaRadio) {
        this.areaRadio = areaRadio;
    }

    @Override
    public void area() {
    areaRadio = pi*radio*radio;

    }



    
}
