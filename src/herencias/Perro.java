
package herencias;


public class Perro extends Animal {

    public Perro(String nombre, String raza, Integer edad, String alimento) {
        super(nombre, raza, edad, alimento);
        
    }

    @Override
    public void Alimentarse() {
        super.Alimentarse(); 
        
       
    }
    
}
