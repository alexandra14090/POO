public class claseLider extends claseUsuario {
    public claseLider(String nombre, String direccion, String telefono, String correo, String login, String contrasena) {
        super(nombre, direccion, telefono, correo, login, contrasena);
    }

    public void crearUsuario() {
        System.out.println("Líder creó un usuario");
    }

    public void actualizarUsuario() {
        System.out.println("Líder actualizó un usuario");
    }

    public void eliminarUsuario() {
        System.out.println("Líder eliminó un usuario");
    }
}
