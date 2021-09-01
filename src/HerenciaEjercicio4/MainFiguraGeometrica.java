
package HerenciaEjercicio4;


public class MainFiguraGeometrica {

 
    public static void main(String[] args) {
      Cuadrado cuadrado = new Cuadrado(10);
      cuadrado.area();
        System.out.println("Area del cuadrado de lado 10: " + cuadrado.getAreaCuadrado());
        
        Circulo circulo = new Circulo(200);
        circulo.area();
        System.out.println("Area del circulo de radio 200: " + circulo.getAreaRadio());
       
        Rectangulo rectangulo = new Rectangulo(100, 20);
        rectangulo.area();
        System.out.println("Area del rectangulo de base 100 y altura de 20: " + rectangulo.getAreaRectangulo());
        
        Triangulo triangulo = new Triangulo(5 , 10);
        triangulo.area();
        System.out.println("Area del triangulo de base 5 y altura de 10: " + triangulo.getAreaTriangulo());
        
    }
    
}
