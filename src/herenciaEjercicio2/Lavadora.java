package herenciaEjercicio2;

public class Lavadora extends Electrodomestico {

    private final static int CARGA_DEF = 500;

    private int carga;

    public int getCarga() {
        return carga;
    }

    public Integer precioFinal() {
        Integer plus = super.PrecioFinal();
        if (carga > 30) {
            plus += 50;
        }

        return plus;
    }

    public Lavadora() {
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }

    public Lavadora(Integer PrecioBase, Integer Peso) {
        this(PrecioBase, Peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }

    public Lavadora(Integer PrecioBase, Integer Peso, char ConsumoEnergetico, String color, int carga) {
        super(PrecioBase, Peso, ConsumoEnergetico, color);
        this.carga = carga;
    }
}
