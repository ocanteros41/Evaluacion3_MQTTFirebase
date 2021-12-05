package com.oscarcanteros.evaluacion3_mqttfirebase;

public class Sensor {

    private String idSensor;
    private String nombreSensor;
    private String tipoSensor;
    private String valorSensor;
    private String ubicacionSensor;
    private String fechaSensor;
    private String observacion;

    public Sensor() {
    }

    public Sensor(String idSensor, String nombreSensor, String tipoSensor, String valorSensor, String ubicacionSensor, String fechaSensor, String observacion) {
        this.idSensor = idSensor;
        this.nombreSensor = nombreSensor;
        this.tipoSensor = tipoSensor;
        this.valorSensor = valorSensor;
        this.ubicacionSensor = ubicacionSensor;
        this.fechaSensor = fechaSensor;
        this.observacion = observacion;
    }

    public String getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(String idSensor) {
        this.idSensor = idSensor;
    }

    public String getNombreSensor() {
        return nombreSensor;
    }

    public void setNombreSensor(String nombreSensor) {
        this.nombreSensor = nombreSensor;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }

    public String getValorSensor() {
        return valorSensor;
    }

    public void setValorSensor(String valorSensor) {
        this.valorSensor = valorSensor;
    }

    public String getUbicacionSensor() {
        return ubicacionSensor;
    }

    public void setUbicacionSensor(String ubicacionSensor) {
        this.ubicacionSensor = ubicacionSensor;
    }

    public String getFechaSensor() {
        return fechaSensor;
    }

    public void setFechaSensor(String fechaSensor) {
        this.fechaSensor = fechaSensor;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}