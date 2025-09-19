public class claseJefeEnfermeria extends claseUsuario {
    public claseJefeEnfermeria(String nombre, String direccion, String telefono, String correo, String login, String contrasena) {
        super(nombre, direccion, telefono, correo, login, contrasena);
    }

    public void crearUsuario() {
        System.out.println("Jefe de Enfermería creó un usuario");
    }

    public void actualizarUsuario() {
        System.out.println("Jefe de Enfermería actualizó un usuario");
    }

    public void eliminarUsuario() {
        System.out.println("Jefe de Enfermería eliminó un usuario");
    }
}
