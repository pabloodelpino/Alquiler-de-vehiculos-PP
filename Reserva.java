import java.util.Date;

public class Reserva {
    private Vehiculo vehiculoAlquilado;
    private Date inicioAlquiler;
    private String diasAlquilado;
    private Cliente cliente;
    private int kmsRecorridos;

    public Reserva(Vehiculo vehiculoAlquilado, Date inicioAlquiler, String diasAlquilado, Cliente cliente, int kmsRecorridos) {
        this.vehiculoAlquilado = vehiculoAlquilado;
        this.inicioAlquiler = inicioAlquiler;
        this.diasAlquilado = diasAlquilado;
        this.cliente = cliente;
        this.kmsRecorridos = kmsRecorridos;
    }

    public Vehiculo getVehiculoAlquilado() {
        return vehiculoAlquilado;
    }

    public void setVehiculoAlquilado(Vehiculo vehiculoAlquilado) {
        this.vehiculoAlquilado = vehiculoAlquilado;
    }

    public Date getInicioAlquiler() {
        return inicioAlquiler;
    }

    public void setInicioAlquiler(Date inicioAlquiler) {
        this.inicioAlquiler = inicioAlquiler;
    }

    public String getDiasAlquilado() {
        return diasAlquilado;
    }

    public void setDiasAlquilado(String diasAlquilado) {
        this.diasAlquilado = diasAlquilado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getKmsRecorridos() {
        return kmsRecorridos;
    }

    public void setKmsRecorridos(int kmsRecorridos) {
        this.kmsRecorridos = kmsRecorridos;
    }
}
