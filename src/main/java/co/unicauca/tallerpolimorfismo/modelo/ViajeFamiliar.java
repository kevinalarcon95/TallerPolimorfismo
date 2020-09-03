package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

public class ViajeFamiliar extends Viaje {

    /**
     * Cantidad de integrantes de la familia
     */
    private int familia;

    /**
     * Constructor por defecto
     */
    public ViajeFamiliar() {
    }

    /**
     * Constructor Parametrizado
     *
     * @param familia
     * @param origen
     * @param destino
     * @param costo
     * @param fechaSalida
     * @param fechaLlegada
     */
    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }

    //Getters and Setters
    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }

    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }
}
