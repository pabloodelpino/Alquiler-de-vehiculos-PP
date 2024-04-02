import java.util.*;

public class Empresa {
    private ArrayList<Vehiculo> miListaVehiculos;
    private Map<String, Cliente> mapaClientes;
    private ArrayList<Reserva> miReserva;


    public Empresa() {
        mapaClientes = new HashMap<>();
        miListaVehiculos = new ArrayList<>();
        miReserva = new ArrayList<>();
    }


    //CRUD CLIENTE
    //Solo nos pide dar de alta
    public boolean addCliente(Cliente miCliente) {
        String dni = miCliente.getDni();
        String nombre = miCliente.getNombre();
        if (!mapaClientes.containsKey(dni)){
            mapaClientes.put(dni, miCliente);
            return true;  
        }

        return false;
    }

    public boolean existeCliente(String dni) {
        if (mapaClientes.containsKey(dni)){
            return true;
        }

        return false;
    }

    //CRUD VEHICULO
    //Solo nos pide dar de alta
    public boolean addVehiculo(Vehiculo v) {
        boolean exito = false;
        if(v != null) {

            if (existeVehiculo(v.getMatricula()) == false){
                miListaVehiculos.add(v);
                exito = true;
            }
        }
        return exito;
    }



    public boolean existeVehiculo (String matricula) {
        boolean existe = false;
        int i = 0;
        while  (i< miListaVehiculos.size() && !existe){
            if (miListaVehiculos.get(i).getMatricula().equals(matricula)) {
                existe = true;
            }
            i++;
        }
        return existe;
    }

    public int obtenVehiculo (String matricula) {
        boolean existe = false;
        int i = 0;
        while  (i< miListaVehiculos.size() && !existe){
            if (miListaVehiculos.get(i).getMatricula().equals(matricula)) {
                existe = true;
            }
            else{
                i++;
            }
        }
        return i;
    }


    public Coche[] listarCoche (int plaza, TipoMotor tipoMotor){
        ArrayList<Coche> lista = new ArrayList<>();
        for (int i = 0; i < miListaVehiculos.size(); i++){
            if(miListaVehiculos.get(i) instanceof Coche){
                Coche c = (Coche)miListaVehiculos.get(i);
                if (plaza >= c.getPlazas() && c.getTipoMotor() == tipoMotor){

                    lista.add(c);// = lista + "Coche" +(i+1)+ ", Matricula: " +coche.getMatricula() + "\n";

                }

            }
        }
        return lista.toArray(new Coche[0]);
    }

    public Furgon[] listarFurgon (int cargaMaxima, int plaza){
        ArrayList<Furgon> lista = new ArrayList<>();
        for (int i = 0; i < miListaVehiculos.size(); i++){
            if(miListaVehiculos.get(i) instanceof Furgon){
                Furgon f = (Furgon)miListaVehiculos.get(i);
                if (plaza >= f.getPlaza() && cargaMaxima >= f.getCargaMaxima()){
                    lista.add(f);//= lista + miListaVehiculos.get(i).getTipoVehiculo() + " " +(i+1)+ ", Matricula: " + furgon.getMatricula() + "\n";

                }

            }
        }
        return lista.toArray(new Furgon[0]);
    }

    /*public String listarFurgon (int cargaMaxima, int plaza){
        String lista = "";
        for (int i = 0; i < miListaVehiculos.size(); i++){
            if(miListaVehiculos.get(i) instanceof Furgon){
                if (plaza >= ((Furgon) miListaVehiculos.get(i)).getPlaza() && cargaMaxima >= ((Furgon) miListaVehiculos.get(i)).getCargaMaxima()){
                    Furgon furgon = (Furgon) miListaVehiculos.get(i);
                    lista = lista + miListaVehiculos.get(i).getTipoVehiculo() + " " +(i+1)+ ", Matricula: " + furgon.getMatricula() + "\n";

                }

            }
        }
        return lista;
    }*/

    public Camion[] listarCamion (int cargaMaxima, int longitud){
        ArrayList<Camion> lista = new ArrayList<>();
        for (int i = 0; i < miListaVehiculos.size(); i++){
            if(miListaVehiculos.get(i) instanceof Camion){
                Camion c = (Camion)miListaVehiculos.get(i);
                if (cargaMaxima >= c.getCargaMaxima() && longitud <= c.getLongitud()){
                    lista.add(c);
                }

            }
        }
        return lista.toArray(new Camion[0]);
    }


    /*public String listarCamion (int cargaMaxima, int longitud){
        String lista = "";
        for (int i = 0; i < miListaVehiculos.size(); i++){
            if(miListaVehiculos.get(i) instanceof Camion){
                if (cargaMaxima >= ((Camion) miListaVehiculos.get(i)).getCargaMaxima() && longitud <= ((Camion) miListaVehiculos.get(i)).getLongitud()){
                    Camion camion = (Camion) miListaVehiculos.get(i);
                    lista = lista + "Camión" +(i+1)+ ", Matricula: " +camion.getMatricula() + "\n";

                }

            }
        }
        return lista;
    }*/

    public boolean alquilarVehiculo(String dni, String matricula, Date fechaAlquiler, int diasAlquilado, Date finAlquiler){
        Cliente cliente = mapaClientes.get(dni);

        int i = obtenVehiculo(matricula);
        Vehiculo vehiculo = miListaVehiculos.get(i);

        Reserva reserva = new Reserva(vehiculo,fechaAlquiler, diasAlquilado, cliente, finAlquiler);

        miReserva.add(reserva);
        return true;
    }

    public int obtenPrecioReserva (String dni, String matricula, Date fechaAlquiler, int kmsRecorridos, int diasUsado) {
        boolean existe = false;
        int i = 0;
        int precio = 0;
        while  (i< miReserva.size() && !existe){
            if (miReserva.get(i).getCliente().getDni().equals(dni) && miReserva.get(i).getVehiculoAlquilado().getMatricula().equals(matricula)) {
                if (miReserva.get(i).getInicioAlquiler().equals(fechaAlquiler)){

                    existe = true;
                    precio = (int) (miReserva.get(i).getDiasAlquilado()* miReserva.get(i).getVehiculoAlquilado().getPrecioPorDia());
                    double a = (kmsRecorridos / miReserva.get(i).getDiasAlquilado());
                    if ((kmsRecorridos / miReserva.get(i).getDiasAlquilado()) > 500){
                        precio = (int) (precio*1.2);


                    }

                    if ( diasUsado > miReserva.get(i).getDiasAlquilado()){
                        int diasSobrepasados;
                        diasSobrepasados = diasUsado - (miReserva.get(i).getDiasAlquilado());
                        precio += diasSobrepasados * 1.50;
                    }

                }
                else {
                    i++;
                }
            }
            else{
                i++;
            }
        }
        return precio;
    }








    /*public int cobrar(int kmsRecorridos, Vehiculo vehiculo, Reserva reserva){
        int precio = (int) (reserva.getDiasAlquilado()* vehiculo.getPrecioPorDia());

        if ((kmsRecorridos / reserva.getDiasAlquilado()) > 500){
            precio = (int) (precio*1.2);
        }
        return precio;
    }*/

}
