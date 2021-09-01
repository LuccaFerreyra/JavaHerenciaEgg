/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEjercicio2;

/**
 *
 * @author I3 10100F
 */
public class ElectrodomesticoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico ListaElectrodomesticos[] = new Electrodomestico[10];
        ///Asignamos a cada una de las posiciones como querasmos
        ListaElectrodomesticos[0] = new Electrodomestico(200, 60, 'C', "Verde");
        ListaElectrodomesticos[1] = new Lavadora(150, 30);
        ListaElectrodomesticos[2] = new Television(500, 80, 'E', "negro", 42, false);
        ListaElectrodomesticos[3] = new Electrodomestico();
        ListaElectrodomesticos[4] = new Electrodomestico(600, 20, 'D', "gris");
        ListaElectrodomesticos[5] = new Lavadora(300, 40, 'Z', "blanco", 40);
        ListaElectrodomesticos[6] = new Television(250, 70);
        ListaElectrodomesticos[7] = new Lavadora(400, 100, 'A', "verde", 15);
        ListaElectrodomesticos[8] = new Television(200, 60, 'C', "naranja", 30, true);
        ListaElectrodomesticos[9] = new Electrodomestico(50, 10);

        /// Creamos la variable que usaremos para almacenar la suma de los precios
        Integer sumaElectrodomesticos = 0;
        Integer sumaTelevisiones = 0;
        Integer sumaLavadoras = 0;

        ///Recorremos el array invocado el medoto precioFinal
        for (int i = 0; i < ListaElectrodomesticos.length; i++) {
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */

            if (ListaElectrodomesticos[i] instanceof Electrodomestico) {
                sumaElectrodomesticos += ListaElectrodomesticos[i].PrecioFinal();
            }
            if (ListaElectrodomesticos[i] instanceof Lavadora) {
                sumaLavadoras += ListaElectrodomesticos[i].PrecioFinal();
            }
            if (ListaElectrodomesticos[i] instanceof Television) {
                sumaTelevisiones += ListaElectrodomesticos[i].PrecioFinal();
            }
            System.out.println("La suma del precio de las electrodomesticos es de" + sumaElectrodomesticos);
            System.out.println("La suma del precio de las lavadoras es de " + sumaLavadoras);
            System.out.println("La suma del precio de las televisiones es de " + sumaTelevisiones);

        }

    }
}
