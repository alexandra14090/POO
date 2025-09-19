public class claseSistema {
    private String usuarios;
    private String pacientes;
    private String encuestas;

    public void crearUsuario() {
        usuarios = "Usuario creado";
        System.out.println("Sistema: " + usuarios);
    }

    public void eliminarUsuario() {
        usuarios = "Usuario eliminado";
        System.out.println("Sistema: " + usuarios);
    }

    public void actualizarUsuario() {
        usuarios = "Usuario actualizado";
        System.out.println("Sistema: " + usuarios);
    }

    public void crearPaciente() {
        pacientes = "Paciente creado";
        System.out.println("Sistema: " + pacientes);
    }

    public void registrarEncuesta() {
        encuestas = "Encuesta registrada";
        System.out.println("Sistema: " + encuestas);
    }
}
