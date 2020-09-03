package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

public abstract class Viaje {

    /**
     * Atributos de la clase viaje
     */
    protected String origen;
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechaLlegada;

    /**
     * Constructor por defecto
     */
    public Viaje() {
    }

    /**
     * Constructor Parametrizado
     *
     * @param origen
     * @param destino
     * @param costo
     * @param fechaSalida
     * @param fechaLlegada
     */
    public Viaje(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    //Getters and Setters
    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public int getCosto() {
        return costo;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public abstract String descripcion();

    public String cualquierMetodo() {
        return "Cualquier método implementado en la clase base";
    }

    public String cualquierMetodo2() {
        return "Cualquier método2 implementado en la clase base";
    }
}
