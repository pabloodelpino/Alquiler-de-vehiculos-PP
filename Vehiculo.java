public class Vehiculo {

   private String matricula;
   private String modelo;
   private String marca;
   private int kmsRecorridos;
   private double precioPorDia;
   private String tipoMotor;



   public Vehiculo(String matricula, String modelo, String marca, int kmsRecorridos, double precioPorDia, String tipoMotor) {
       this.matricula = matricula;
       this.modelo = modelo;
       this.marca = marca;
       this.kmsRecorridos = kmsRecorridos;
       this.precioPorDia = precioPorDia;
       this.tipoMotor = tipoMotor;
   }
   public String getMatricula() {
       return matricula;
   }

   public void setMatricula(String matricula) {
       this.matricula = matricula;
   }

   public String getModelo() {
       return modelo;
   }

   public void setModelo(String modelo) {
       this.modelo = modelo;
   }

   public String getMarca() {
       return marca;
   }

   public void setMarca(String marca) {
       this.marca = marca;
   }

   public int getKmsRecorridos() {
       return kmsRecorridos;
   }

   public void setKmsRecorridos(int kmsRecorridos) {
       this.kmsRecorridos = kmsRecorridos;
   }

   public double getPrecioPorDia() {
       return precioPorDia;
   }


}