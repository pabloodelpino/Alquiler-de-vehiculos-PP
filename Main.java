import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws ParseException {

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
                    System.out.println("Vehículo añadido");
                }else {
                    System.out.println("No se ha podido añadir el Vehículo");
                }

            }
            else if(teclado.compareTo("2")==0) {

                if (darAltaCliente(sc, miEmpresa)) {
                    System.out.println("Cliente añadido");
                } else {
                    System.out.println("No se ha podido añadir el Cliente");
                }

            } else if(teclado.compareTo("3")==0) {

                System.out.println("Inserte el DNI del cliente");
                String dni = sc.nextLine();
                if(miEmpresa.existeCliente(dni)){
                    System.out.println("Inserte la matricula del Vehiculo");
                    String matricula = sc.nextLine();
                    if(miEmpresa.existeVehiculo(matricula)){

                        System.out.println("Inicio del alquiler");
                        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
                        String inicioAlquiler = sc.nextLine();

                        Date fechaAlquiler = formato.parse(inicioAlquiler);

                        System.out.println("Cuanto va a durar el alquiler");
                        int diasAlquilado = Integer.parseInt(sc.nextLine());

                        System.out.println("Fecha de la entrega del vehículo:");
                        String endAlquiler = sc.nextLine();
                        Date finAlquiler = formato.parse(endAlquiler);

                        miEmpresa.alquilarVehiculo(dni, matricula, fechaAlquiler,diasAlquilado, finAlquiler);
                        System.out.println("Vehiculo alquilado");

                    } else {
                        System.out.println("Vehiculo no existe");
                    }

                } else {
                    System.out.println("Cliente no existe");
                }

            } else if(teclado.compareTo("4")==0) {

                System.out.println("a. Coches");
                System.out.println("b. Furgones");
                System.out.println("c. Camiones");
                String menu = sc.nextLine();
                if (menu.equals("a")) {

                    System.out.println("Cuantas plazas minimo quieres en tu coche: ");
                    int plazas = Integer.valueOf(sc.nextLine());

                    System.out.println("Elija el tipo de motor: ");
                    System.out.println("0. ELECTRICO");
                    System.out.println("1. HIBRIDO ENCHUFABLE");
                    System.out.println("2. HIBRIDO");
                    System.out.println("3. GASOLINA");
                    System.out.println("4. DIESEL");
                    int motor = Integer.valueOf(sc.nextLine());
                    TipoMotor tipoMotor = null;

                    if (motor == TipoMotor.ELECTRICO.ordinal()) {
                        tipoMotor = TipoMotor.ELECTRICO;
                    } else if (motor == TipoMotor.GASOLINA.ordinal()) {
                        tipoMotor = TipoMotor.GASOLINA;
                    } else if (motor == TipoMotor.DIESEL.ordinal()) {
                        tipoMotor = TipoMotor.DIESEL;
                    } else if (motor == TipoMotor.HIBRIDO.ordinal()) {
                        tipoMotor = TipoMotor.HIBRIDO;
                    } else if (motor == TipoMotor.HIBRIDOENCHUFABLE.ordinal()) {
                        tipoMotor = TipoMotor.HIBRIDOENCHUFABLE;
                    }

                    miEmpresa.listarCoche(plazas, tipoMotor);
                    System.out.println("Listado de coches:");
                    System.out.println(miEmpresa.listarCoche(plazas, tipoMotor));

                } else if (menu.equals("b")) {

                    System.out.println("Carga minima para el furgón:");
                    int cargaMaxima = Integer.valueOf(sc.nextLine());
                    System.out.println("Cuantas plazas minimo quieres en tu coche: ");
                    int plaza = Integer.valueOf(sc.nextLine());

                    miEmpresa.listarFurgon(cargaMaxima, plaza);
                    System.out.println("Listado de furgones:");
                    System.out.println(miEmpresa.listarFurgon(cargaMaxima, plaza));

                } else if (menu.equals("c")) {

                    System.out.println("Carga minima para el camión:");
                    int cargaMaxima = Integer.valueOf(sc.nextLine());
                    System.out.println("Logitud máxima para el camión: ");
                    int longitud = Integer.valueOf(sc.nextLine());

                    miEmpresa.listarCamion(cargaMaxima, longitud);
                    System.out.println("Listado de camiones:");
                    System.out.println(miEmpresa.listarCamion(cargaMaxima, longitud));

                }
            } else if (teclado.compareTo("5")==0) {

                System.out.println("Inserte el DNI del cliente que ha hecho la reserva");
                String dni = sc.nextLine();
                if(miEmpresa.existeCliente(dni)) {
                    System.out.println("Inserte la matricula del Vehiculo de la reserva");
                    String matricula = sc.nextLine();
                    if (miEmpresa.existeVehiculo(matricula)) {

                        System.out.println("Inicio del alquiler de la reserva");
                        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
                        String inicioAlquiler = sc.nextLine();

                        Date fechaAlquiler = formato.parse(inicioAlquiler);

                        System.out.println("Cuanto kilometros ha recorrido con el vehiculo:");
                        int kmsRecorridos = Integer.parseInt(sc.nextLine());
                        int precioReserva = miEmpresa.obtenPrecioReserva(dni, matricula, fechaAlquiler, kmsRecorridos);

                        System.out.println("El importe del alquiler es " + Integer.toString(precioReserva));




                    } else {
                        System.out.println("La matricula no existe");
                    }
                } else {
                    System.out.println("El cliente no existe");
                }





        }else {
                salir = true;
            }
        }while(!salir);
    }

    private static boolean darAltaVehiculo(Scanner sc, Empresa miEmpresa) {
        //TipoVehiculo tipoV;
        boolean resultado = false;

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


        System.out.println("Elija el tipo de motor: ");
        System.out.println("Introduce el tipo de motor del vehículo");
        TipoMotor tipoMotor = null;
        int motor;
        boolean cont = true;
        while (cont == true){
            System.out.println("0. ELECTRICO");
            System.out.println("1. HIBRIDO ENCHUFABLE");
            System.out.println("2. HIBRIDO");
            System.out.println("3. GASOLINA");
            System.out.println("4. DIESEL");
            motor = Integer.valueOf(sc.nextLine());

            if(motor == TipoMotor.ELECTRICO.ordinal()){
                tipoMotor = TipoMotor.ELECTRICO;
                cont = false;
            } else if(motor == TipoMotor.GASOLINA.ordinal()){
                tipoMotor = TipoMotor.GASOLINA;
                cont = false;
            } else if(motor == TipoMotor.DIESEL.ordinal()){
                tipoMotor = TipoMotor.DIESEL;
                cont = false;
            } else if(motor == TipoMotor.HIBRIDO.ordinal()){
                tipoMotor = TipoMotor.HIBRIDO;
                cont = false;
            } else if(motor == TipoMotor.HIBRIDOENCHUFABLE.ordinal()){
                tipoMotor = TipoMotor.HIBRIDOENCHUFABLE;
                cont = false;
            } else {
                System.out.println("Error, elige un numero tipo válido.");
            }

        }

        System.out.println("Elija una tipo de vehículo de los siguientes: COCHE, FURGON, CAMION");

        String veh = sc.nextLine();

        if(veh.toUpperCase().equals(TipoVehiculo.COCHE.toString())) {
            System.out.println("Plazas:");
            int plazas = Integer.valueOf(sc.nextLine());
            System.out.println("Puertas:");
            int puertas = Integer.valueOf(sc.nextLine());
            System.out.println("Maletero:");
            int volumenMaletero = Integer.valueOf(sc.nextLine());

            System.out.println("Elija el tipo de coche: ");
            System.out.println("0. UTILITARIO");
            System.out.println("1. BERLINA");
            System.out.println("2. MONOVOLUMEN");
            System.out.println("3. SUV");
            int coche = Integer.valueOf(sc.nextLine());
            TipoCoche tipoCoche = null;
            if(coche == TipoCoche.UTILITARIO.ordinal()){
                tipoCoche = TipoCoche.UTILITARIO;
            } else if(coche == TipoCoche.BERLINA.ordinal()){
                tipoCoche = TipoCoche.BERLINA;
            } else if(coche == TipoCoche.MONOVOLUMEN.ordinal()){
                tipoCoche = TipoCoche.MONOVOLUMEN;
            } else if(coche == TipoCoche.SUV.ordinal()) {
                tipoCoche = TipoCoche.SUV;
            }

            resultado = miEmpresa.addVehiculo(new Coche(matricula, modelo, marca, kmsRecorridos, precioPorDia, tipoMotor, TipoVehiculo.COCHE, plazas, puertas, volumenMaletero, tipoCoche));

        }else if(veh.toUpperCase().equals(TipoVehiculo.FURGON.toString())){
            System.out.println("Carga Máxima:");
            int cargaMaxima = Integer.valueOf(sc.nextLine());
            System.out.println("Plazas:");
            int plazas = Integer.valueOf(sc.nextLine());

            resultado =  miEmpresa.addVehiculo(new Furgon(matricula, modelo, marca, kmsRecorridos, precioPorDia, tipoMotor, TipoVehiculo.FURGON, cargaMaxima, plazas));

        }else if(veh.toUpperCase().equals(TipoVehiculo.CAMION.toString())){
            System.out.println("Carga Máxima:");
            int cargaMaxima = Integer.valueOf(sc.nextLine());
            System.out.println("Logitud:");
            int longitud = Integer.valueOf(sc.nextLine());

            resultado = miEmpresa.addVehiculo(new Camion(matricula, modelo, marca, kmsRecorridos, precioPorDia, tipoMotor, TipoVehiculo.CAMION, cargaMaxima, longitud));

        }else { System.out.println("El tipo de vehículo seleccionado no es correcto.");}

        return resultado;
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

        return miEmpresa.addCliente(new Cliente(nombre, apellidos, email, telefono, dni, tarjeta));
    }
}