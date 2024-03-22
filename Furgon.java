public class Furgon extends Vehiculo{
    private int cargaMaxima;
    private int plaza;


    public Furgon(String matricula, String modelo, String marca, int kmsRecorridos, double precioPorDia, String tipoMotor, int cargaMaxima, int plaza) {
        super(matricula, modelo, marca, kmsRecorridos, precioPorDia, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.plaza = plaza;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }
}
