package herenciaEjercicio2;

public class Television extends Electrodomestico {

    private final static Integer RESOLUCION_DEF = 40;

    private Integer resolucion;

    private boolean sintonizadorTDT;

    public double precioFinal() {
        double plus = super.PrecioFinal();
        if (resolucion > 40) {
            plus += PrecioBase * 0.3;

        }
        if (sintonizadorTDT) {
            plus += 500;

        }
return plus;
    }

     public Television(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
   
    public Television(Integer PrecioBase, Integer Peso){
        this(PrecioBase, Peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
    
    public Television(Integer PrecioBase, Integer Peso, char ConsumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(PrecioBase, Peso, ConsumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
    
    
    
    
    
}
