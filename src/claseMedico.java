public class claseMedico extends claseUsuario {
    public claseMedico(String nombre, String direccion, String telefono, String correo, String login, String contrasena) {
        super(nombre, direccion, telefono, correo, login, contrasena);
    }

    public void crearUsuario() {
        System.out.println("Médico creó un usuario");
    }

    public void actualizarUsuario() {
        System.out.println("Médico actualizó un usuario");
    }

    public void eliminarUsuario() {
        System.out.println("Médico eliminó un usuario");
    }
}
