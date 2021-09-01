
package herencias;


public class Animal {
    String nombre;
    String raza;
    Integer edad;
    String alimento;

    public Animal() {
    }

    public Animal(String nombre, String raza, Integer edad, String alimento) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.alimento = alimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
   
public void Alimentarse(){
    System.out.println( nombre + " " + raza + " " + edad + " " + alimento);
}
   
    
    
    
}
