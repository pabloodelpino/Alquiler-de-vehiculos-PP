public class Reserva {

    private String fechaInicio;
    private int dias;

    private Vehiculos miVehiculo;
    private Cliente miCliente;

    public Reserva(String fechaInicio, int dias, Vehiculos miVehiculo, Cliente miCliente) {
        this.fechaInicio = fechaInicio;
        this.dias = dias;
        this.miVehiculo = miVehiculo;
        this.miCliente = miCliente;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Vehiculos getMiVehiculo() {
        return miVehiculo;
    }

    public void setMiVehiculo(Vehiculos miVehiculo) {
        this.miVehiculo = miVehiculo;
    }

    public Cliente getMiCliente() {
        return miCliente;
    }

    public void setMiCliente(Cliente miCliente) {
        this.miCliente = miCliente;
    }


}
