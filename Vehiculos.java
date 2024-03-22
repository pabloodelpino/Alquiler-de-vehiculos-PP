public class Vehiculos {

    //Atributos
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected float kms;
    protected float precioDia;
    protected String tipoMotor;

    public Vehiculos(String matricula, String marca, String modelo, float kms, float precioDia,String tipoMotor) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kms = kms;
        this.precioDia = precioDia;
        this.tipoMotor = tipoMotor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getKms() {
        return kms;
    }

    public void setKms(float kms) {
        this.kms = kms;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
