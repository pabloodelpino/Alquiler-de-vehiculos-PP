public class Furgon extends Vehiculos{

    //Atributos
    private int carga;
    private int plazas;


    public Furgon(String matricula, String marca, String modelo, float kms, float precioDia, String tipoMotor, int carga, int plazas) {
        super(matricula, marca, modelo, kms, precioDia, tipoMotor);
        this.carga = carga;
        this.plazas = plazas;
    }


    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}
