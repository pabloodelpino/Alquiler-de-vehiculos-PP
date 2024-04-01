public class Coche extends Vehiculo{
    private int plazas;
    private int puertas;
    private int volumenMaletero;
    private String tipoCoche;


    public Coche(String matricula, String modelo, String marca, int kmsRecorridos, double precioPorDia, TipoMotor tipoMotor, TipoVehiculo tipoVehiculo, int plazas, int puertas, int volumenMaletero, TipoCoche tipoCoche) {
        super(matricula, modelo, marca, kmsRecorridos, precioPorDia, tipoMotor, tipoVehiculo);
        this.plazas = plazas;
        this.puertas = puertas;
        this.volumenMaletero = volumenMaletero;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVolumenMaletero() {
        return volumenMaletero;
    }

    public void setVolumenMaletero(int volumenMaletero) {
        this.volumenMaletero = volumenMaletero;
    }

    public String getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(String tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    @Override
    public String toString() {
        return this.getTipoVehiculo()+ "\nMatricula: " +
                this.getMatricula() + "\nMarca: " +
                this.getMarca()+ "\nMotor: " +
                this.getTipoMotor()+ "\nPrecio por día: " +
                this.getPrecioPorDia() + "\nPuertas: " +
                this.getPuertas() + "\nPlazas: " +
                this.getPlazas()+
                "\n\n";
    }


}
