import java.util.HashMap;
import java.util.Map;

public class Empresa {
    private Map<Integer, Persona> empleados;

    public Empresa() {
        empleados = new HashMap<>();
    }

    public void contratarEmpleado(int id, Persona empleado) {
        empleados.put(id, empleado);
    }

    public void mostrarEmpleados() {
        for (Map.Entry<Integer, Persona> entry : empleados.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Empleado: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa();

        Persona empleado1 = new Persona("Juan", 30, "juan@example.com");
        Persona empleado2 = new Persona("María", 25, "maria@example.com");

        miEmpresa.contratarEmpleado(1, empleado1);
        miEmpresa.contratarEmpleado(2, empleado2);

        miEmpresa.mostrarEmpleados();


        if (empleado1.esMayorDeEdad()) {
            System.out.println(empleado1.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(empleado1.getNombre() + " no es mayor de edad.");
        }

        empleado2.enviarCorreo("¡Hola desde la empresa!");

        System.out.println("Edad de " + empleado1.getNombre() + " en meses: " + empleado1.calcularEdadEnMeses());
    }
}
