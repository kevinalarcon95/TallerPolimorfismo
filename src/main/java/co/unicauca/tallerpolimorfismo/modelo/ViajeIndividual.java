package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

public class ViajeIndividual extends Viaje {

    /**
     * Constructor por defecto
     */
    public ViajeIndividual() {
    }

    /**
     * Constructor por parametrizado
     *
     * @param origen
     * @param destino
     * @param costo
     * @param fechaSalida
     * @param fechaLlegada
     */
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
}
