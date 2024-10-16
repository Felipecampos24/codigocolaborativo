public class Main {
    public static void main(String[] args) {

        Persona empleado1 = new Persona("Juan", 30, "juan@example.com");
        Persona empleado2 = new Persona("María", 25, "maria@example.com");


        Empresa miEmpresa = new Empresa();
        miEmpresa.contratarEmpleado(1, empleado1);
        miEmpresa.contratarEmpleado(2, empleado2);


        System.out.println("Empleados en la empresa:");
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

