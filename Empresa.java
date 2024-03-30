import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Empresa {
    private ArrayList<Vehiculo> miListaVehiculos;
    private Map<String, Cliente> mapaClientes;
    private ArrayList<Reserva> miReserva;


    public Empresa() {
        miListaVehiculos = new ArrayList<>();
        mapaClientes = new HashMap<>();
        miListaVehiculos = new ArrayList<>();
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

   /* public Vehiculo buscarVehiculo(String matricula) {
        for(Vehiculo unPaquete: miListaVehiculos) {
            if(unPaquete.getMatricula().compareTo(localizador)==0) {
                return unPaquete;
            }
        }
        return null;
    }*/


    /*FALTA PONER EN EL MENÚ LISTAR LOS COCHES FURGONES Y CAMIONES, TAMBIEN HAY QUE AÑADIR LAS CONDICIONES DEL COCHE, Y TERMINAR FURGON Y CAMION*/
    public String listarCoche (){
        String lista = "";
        for (int i = 0; i < miListaVehiculos.size();i++){
            if(miListaVehiculos.get(i) instanceof Coche){
                Coche coche = (Coche) miListaVehiculos.get(i);
                lista = lista + coche.getMatricula() + "\n";
            }
        }
        return lista;
    }
    /*
    public String listarFurgon (){

    }

    public String listarCamion(){

    }
    */

}
