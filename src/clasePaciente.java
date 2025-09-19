public class clasePaciente {
    public int edad;
    public String fechaNacimiento;
    public String direccion;
    public String telefono;
    public String rh;

    public clasePaciente(int edad, String fechaNacimiento, String direccion, String telefono, String rh) {
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rh = rh;
    }

    public void crearPaciente() {
        System.out.println("Paciente creado");
    }
}
