public class Coche extends Vehiculo{
    private int plazas;
    private int puertas;
    private int volumenMaletero;
    private String tipoCoche;


    public Coche(String matricula, String modelo, String marca, int kmsRecorridos, double precioPorDia, String tipoMotor, int plazas, int puertas, int volumenMaletero, String tipoCoche) {
        super(matricula, modelo, marca, kmsRecorridos, precioPorDia, tipoMotor);
        this.plazas = plazas;
        this.puertas = puertas;
        this.volumenMaletero = volumenMaletero;
        this.tipoCoche = tipoCoche;
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
}
