/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author I3 10100F
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro = new Perro("tortita", "caniche", 4, "Croquetas");
        perro.Alimentarse();
        
        Animal gato = new Gato ("Luna", "Vanturko", 1, "Croquetas");
        gato.Alimentarse();
        
        Animal caballo = new Caballo ("Spirit","Shire", 3, "Pasto");
        caballo.Alimentarse();
    }
    
}
