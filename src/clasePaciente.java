public class clasePaciente {
    private int edad;
    private String fechaNacimiento;
    private String direccion;
    private String telefono;
    private String rh;

    public clasePaciente(int edad, String fechaNacimiento, String direccion, String telefono, String rh) {
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rh = rh;
    }

    public int getEdad() {
    return edad;
    }

    public void setEdad(int edad) {
    this.edad = edad;
    }
    
    public void crearPaciente() {
        System.out.println("Paciente creado");
    }
}
