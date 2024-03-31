
import java.util.Calendar;
import java.util.Date;

public class Reserva {
    private Vehiculo vehiculoAlquilado;
    private Date inicioAlquiler;
    private int diasAlquilado;
    private Cliente cliente;
    private int kmsRecorrido;
    private Date finAlquiler;

    public Reserva(Vehiculo vehiculoAlquilado, Date inicioAlquiler, int diasAlquilado, Cliente cliente, Date finAlquiler) {
        this.vehiculoAlquilado = vehiculoAlquilado;
        this.inicioAlquiler = inicioAlquiler;
        this.diasAlquilado = diasAlquilado;
        this.cliente = cliente;
        this.kmsRecorrido = 0;
        this.finAlquiler = finAlquiler;
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

    public int getDiasAlquilado() {
        return diasAlquilado;
    }

    public void setDiasAlquilado(int diasAlquilado) {
        this.diasAlquilado = diasAlquilado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getKmsRecorrido() {
        return kmsRecorrido;
    }

    public void setKmsRecorrido(int kmsRecorrido) {
        this.kmsRecorrido = kmsRecorrido;
    }

    public Date getFinAlquiler() {
        return finAlquiler;
    }

    public void setFinAlquiler(Date entregaAlquiler) {
        this.finAlquiler = entregaAlquiler;
    }
}
