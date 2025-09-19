public class claseUsuario {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String correo;
    protected String login;
    protected String contrasena;

    public claseUsuario(String nombre, String direccion, String telefono, String correo, String login, String contrasena) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.login = login;
        this.contrasena = contrasena;
    }

    public void crearUsuario() {
        System.out.println("Usuario creado: " + nombre);
    }

    public void eliminarUsuario() {
        System.out.println("Usuario eliminado: " + nombre);
    }

    public void actualizarUsuario() {
        System.out.println("Usuario actualizado: " + nombre);
    }

    public void mostrarUsuario() {
        System.out.println("=== Datos del Usuario ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Login: " + login);
        System.out.println("Contraseña: " + contrasena);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
