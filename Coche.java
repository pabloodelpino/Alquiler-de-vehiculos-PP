public class Coche extends Vehiculos {

    //Atributos
    private int plazas;
    private int puertas;
    private int volumenMaletero;
    private String tipo;

    public Coche(String matricula, String marca, String modelo, float kms, float precioDia, String tipoMotor, int plazas, int puertas, int volumenMaletero, String tipo) {
        super(matricula, marca, modelo, kms, precioDia, tipoMotor);
        this.plazas = plazas;
        this.puertas = puertas;
        this.volumenMaletero = volumenMaletero;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
