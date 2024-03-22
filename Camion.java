public class Camion extends Vehiculos{

    //Atributos
    private int carga;
    private int longitud;

    public Camion(String matricula, String marca, String modelo, float kms, float precioDia, String tipoMotor, int carga, int longitud) {
        super(matricula, marca, modelo, kms, precioDia, tipoMotor);
        this.carga = carga;
        this.longitud = longitud;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
