import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Empresa {
    private ArrayList<Vehiculo> miListaVehiculos;
    private Map<String, Cliente> mapaClientes;



    public Empresa() {
        miListaVehiculos = new ArrayList<>();
        mapaClientes = new HashMap<>();
    }


    //CRUD CLIENTE
    //Solo nos pide dar de alta
    public boolean addCliente(Cliente miCliente) {
        String dni = miCliente.getDni();
        if (!mapaClientes.containsKey(miCliente.getDni())){
            mapaClientes.put(dni, miCliente);
            return true;
        }

        return false;
    }



    //CRUD VEHICULO
    //Solo nos pide dar de alta
    public boolean addVehiculo(Vehiculo v) {
        if(v != null) {
            if(miListaVehiculos == null && buscarVehiculo(v.getMatricula()) == null) {
                return miListaVehiculos.add(v);
            }
        }
        return false;
    }

    public Vehiculo buscarVehiculo(String localizador) {
        for(Vehiculo unPaquete: miListaVehiculos) {
            if(unPaquete.getMatricula().compareTo(localizador)==0) {
                return unPaquete;
            }
        }
        return null;
    }

}
