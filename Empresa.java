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



    //CRUD VEHICULO
    //Solo nos pide dar de alta
    public boolean addVehiculo(Vehiculo v) {
        boolean exito = false;
        if(v != null) {
           /* if(miListaVehiculos == null && buscarVehiculo(v.getMatricula()) == null) {
                return miListaVehiculos.add(v);
            }*/
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

    /*FALTA PONER EN EL MENÚ LISTAR LOS COCHES FURGONES Y CAMIONES, TAMBIEN HAY QUE AÑADIR LAS CONDICIONES DEL COCHE, Y TERMINAR FURGON Y CAMION*/
    public String listarCoche (int plaza, TipoMotor tipoMotor){
        String lista = "";
        for (int i = 0; i < miListaVehiculos.size(); i++){
            if(miListaVehiculos.get(i) instanceof Coche){
                if (plaza >= ((Coche) miListaVehiculos.get(i)).getPlazas() && miListaVehiculos.get(i).getTipoMotor() == tipoMotor){
                    Coche coche = (Coche) miListaVehiculos.get(i);
                    lista = lista + "Coche" +(i+1)+ ", Matricula: " +coche.getMatricula() + "\n";

                }

            }
        }
        return lista;
    }


    public String listarFurgon (int cargaMaxima, int plaza){
        String lista = "";
        for (int i = 0; i < miListaVehiculos.size(); i++){
            if(miListaVehiculos.get(i) instanceof Furgon){
                if (plaza >= ((Furgon) miListaVehiculos.get(i)).getPlaza() && cargaMaxima >= ((Furgon) miListaVehiculos.get(i)).getCargaMaxima()){
                    Furgon furgon = (Furgon) miListaVehiculos.get(i);
                    lista = lista + "Furgon" +(i+1)+ ", Matricula: " + furgon.getMatricula() + "\n";

                }

            }
        }
        return lista;
    }

    public String listarCamion (int cargaMaxima, int longitud){
        String lista = "";
        for (int i = 0; i < miListaVehiculos.size(); i++){
            if(miListaVehiculos.get(i) instanceof Camion){
                if ( cargaMaxima >= ((Camion) miListaVehiculos.get(i)).getCargaMaxima() && longitud <= ((Camion) miListaVehiculos.get(i)).getLongitud()){
                    Camion camion = (Camion) miListaVehiculos.get(i);
                    lista = lista + "Camión" +(i+1)+ ", Matricula: " +camion.getMatricula() + "\n";

                }

            }
        }
        return lista;
    }


}
