/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjercicio4;

/**
 *
 * @author I3 10100F
 */
public class Triangulo implements FiguraGeometrica {
    private double base;
    private double altura;
    private double areaTriangulo;
    
    public Triangulo(double base, double altura){
    this.base=base;
    this.altura=altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAreaTriangulo() {
        return areaTriangulo;
    }
   @Override
   public void area(){
   areaTriangulo=base*altura/2;
   
   
   }
    
}
