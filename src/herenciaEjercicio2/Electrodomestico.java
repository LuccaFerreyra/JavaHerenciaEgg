package herenciaEjercicio2;

public class Electrodomestico {
/// Constantes

    protected final static String COLOR_DEF = "blanco";
    protected final static char CONSUMO_ENERGETICO_DEF = 'F';
    protected final static Integer PRECIO_BASE_DEF = 1000;
    protected final static Integer PESO_DEF = 30;

    protected Integer PrecioBase;
    protected String Color;
    protected char ConsumoEnergetico;
    protected Integer Peso;

    private void comprobarConsumoEnergetico(char ConsumoEnergetico) {
        if (ConsumoEnergetico >= 600 && ConsumoEnergetico <= 700) {
            this.ConsumoEnergetico = ConsumoEnergetico;

        } else {
            this.ConsumoEnergetico = CONSUMO_ENERGETICO_DEF;
        }

    }

    public void ComprobarColor(String color) {
        String colores[] = {" blanco ", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;
        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            this.Color = color;

        } else {
            this.Color = COLOR_DEF;
        }
    }

    public Integer getPrecioBase() {
        return PrecioBase;
    }

    public void setPrecioBase(Integer PrecioBase) {
        this.PrecioBase = PrecioBase;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public char getConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    public void setConsumoEnergetico(char ConsumoEnergetico) {
        this.ConsumoEnergetico = ConsumoEnergetico;
    }

    public Integer getPeso() {
        return Peso;
    }

    public void setPeso(Integer Peso) {
        this.Peso = Peso;
    }

    public Integer PrecioFinal() {
        Integer plus = 0;
        switch (ConsumoEnergetico) {
            case 'A':
                plus += 1000;
                break;
            case 'B':
                plus += 800;
                break;
            case 'C':
                plus += 600;
                break;
            case 'D':
                plus += 500;
                break;
            case 'F':
                plus += 100;
                break;

        }
        
        if (Peso >=0 && Peso < 19) {
            plus += 100;
        } else if (Peso >= 20 && Peso < 49) {
            plus += 500;
        } else if (Peso <= 50 && Peso >= 79) {
            plus += 800;

        }else if(Peso>=80){
        plus+=1000;
        }
        return PrecioBase+plus;
    }

   public Electrodomestico(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }
   
    
    public Electrodomestico(Integer PrecioBase, Integer Peso){
        this(PrecioBase, Peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }
   
    public Electrodomestico(Integer PrecioBase, Integer Peso, char ConsumoEnergetico, String color){
        this.PrecioBase=PrecioBase;
        this.Peso=Peso;
        comprobarConsumoEnergetico(ConsumoEnergetico);
        ComprobarColor(color);
    }
   
}
  
