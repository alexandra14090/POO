public class claseCoordinador extends claseUsuario {
    public claseCoordinador(String nombre, String direccion, String telefono, String correo, String login, String contrasena) {
        super(nombre, direccion, telefono, correo, login, contrasena);
    }

    public void crearUsuario() {
        System.out.println("Coordinador creó un usuario");
    }

    public void actualizarUsuario() {
        System.out.println("Coordinador actualizó un usuario");
    }

    public void eliminarUsuario() {
        System.out.println("Coordinador eliminó un usuario");
    }
}
