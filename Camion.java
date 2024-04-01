public class Camion extends Vehiculo{
    private int cargaMaxima;
    private int longitud;


    public Camion(String matricula, String modelo, String marca, int kmsRecorridos, double precioPorDia, TipoMotor tipoMotor, TipoVehiculo tipoVehiculo, int cargaMaxima, int longitud) {
        super(matricula, modelo, marca, kmsRecorridos, precioPorDia, tipoMotor, tipoVehiculo);
        this.cargaMaxima = cargaMaxima;
        this.longitud = longitud;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return this.getTipoVehiculo()+ "\nMatricula: " +
                this.getMatricula() + "\nMarca: " +
                this.getMarca()+ "\nMotor: " +
                this.getTipoMotor()+ "\nPrecio por día: " +
                this.getPrecioPorDia() + "\nCarga: " +
                this.getCargaMaxima()+ "\nLongitud: " +
                this.getLongitud()+
                "\n\n";
    }
}
