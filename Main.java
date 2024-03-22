import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean salir = false;
        String teclado;
        Scanner sc = new Scanner(System.in);

        Empresa miEmpresa = new Empresa();

        //Menu
        do {
            System.out.println("MENU");
            System.out.println("Elija una opción:");
            System.out.println("1) Dar de alta un vehiculo");
            System.out.println("2) Dar de alta un cliente");
            System.out.println("3) Alquilar un vehículo para un cliente determinado");
            System.out.println("4) Mostrar una lista de vehículos que cumplan con los siguientes parámetros:");
            System.out.println("5) Devolver un vehículo y mostrar precio a cobrar");
            System.out.println("Cualquier otra salir");
            teclado = sc.nextLine();

            if(teclado.compareTo("1")==0) {
                if(darAltaVehiculo(sc, miEmpresa)) {
                    System.out.println("Vehiculo añadido");
                }else {
                    System.out.println("No se ha podido añadir el vehiculo");
                }
            }else if(teclado.compareTo("2")==0) {
                if(darAltaCliente(sc, miEmpresa)) {
                    System.out.println("Cliente añadido");
                }else {
                    System.out.println("No se ha podido añadir el Cliente");
                }

            }else {
                salir = true;
            }
        }while(!salir);
    }

    private static boolean darAltaVehiculo(Scanner sc, Empresa miEmpresa) {

        System.out.println("DAR DE ALTA UN VEHICULO");
        System.out.println("Matricula:");
        String matricula = sc.nextLine();
        System.out.println("Modelo:");
        String modelo = sc.nextLine();
        System.out.println("Marca:");
        String marca = sc.nextLine();
        System.out.println("Kilometros recorridos:");
        int kmsRecorridos = Integer.valueOf(sc.nextLine());
        System.out.println("Precio por dia:");
        int precioPorDia = Integer.valueOf(sc.nextLine());
        System.out.println("Tipo de motor:");
        String tipoMotor = sc.nextLine();

        return miEmpresa.addVehiculo(new Vehiculo(matricula, modelo, marca, kmsRecorridos, precioPorDia, tipoMotor));
    }

    private static boolean darAltaCliente(Scanner sc, Empresa miEmpresa) {

        System.out.println("DAR DE ALTA UN CLIENTE");
        System.out.println("Dni:");
        String dni = sc.nextLine();
        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Apellidos:");
        String apellidos = sc.nextLine();
        System.out.println("Email:");
        String email = sc.nextLine();
        System.out.println("Telefono:");
        String telefono = sc.nextLine();
        System.out.println("Tarjeta:");
        String tarjeta = sc.nextLine();

        return miEmpresa.addCliente(new Cliente(dni, nombre, apellidos, email, telefono, tarjeta));
    }




}