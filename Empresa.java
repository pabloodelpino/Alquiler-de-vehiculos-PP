import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Empresa {


    private ArrayList <Vehiculos> misVehiculos;
    private Map <String, Cliente> mapaClientes;
    private ArrayList <Reserva> listaReservas;


    public Empresa() {

        misVehiculos = new ArrayList<>();
        mapaClientes = new HashMap<>();
        listaReservas = new ArrayList<>();
    }

    //Vehiculos
    //Creacion
    public boolean altaVehiculos(Vehiculos nuevoVehiculo) {
        if (nuevoVehiculo != null) {
            if (buscarVehiculo(nuevoVehiculo.getMatricula()) == null) {
                return misVehiculos.add(nuevoVehiculo);
            }
        }
    return false;
    }



    //Buscar
    public Vehiculos buscarVehiculo (String matricula) {
        for (Vehiculos miVehiculo : misVehiculos) {
            if ((miVehiculo.getMatricula().equals(matricula))) {
                return miVehiculo;
            }
        }
        return null;
    }

    //Clientes


    //Reserva
}
