public class Furgon extends Vehiculo{
    private int cargaMaxima;
    private int plaza;


    public Furgon(String matricula, String modelo, String marca, int kmsRecorridos, double precioPorDia, TipoMotor tipoMotor, TipoVehiculo tipoVehiculo, int cargaMaxima, int plaza) {
        super(matricula, modelo, marca, kmsRecorridos, precioPorDia, tipoMotor, tipoVehiculo);
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

    @Override
    public String toString() {
        return this.getTipoVehiculo()+ "\nMatricula: " +
                this.getMatricula() + "\nMarca: " +
                this.getMarca()+ "\nMotor: " +
                this.getTipoMotor()+ "\nPrecio por día: " +
                this.getPrecioPorDia() + "\nPlazas: " +
                this.getPlaza()+ "\nCarga: " +
                this.getCargaMaxima()+
                "\n\n";
    }
}
