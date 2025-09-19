public class Main {
    public static void main(String[] args) {
        // RF1
        claseMedico medico = new claseMedico("Luis", "Calle 1", "300123456", "luis@mail.com", "luis", "1234");
        medico.crearUsuario();
        medico.actualizarUsuario();
        medico.eliminarUsuario();

        // RF2
        clasePaciente paciente = new clasePaciente(30, "1995-04-20", "Av Principal", "300987654", "O+");
        paciente.crearPaciente();

        // RF3
        claseEncuesta encuesta = new claseEncuesta(true, false, true);
        encuesta.registrarEncuesta();
    }
}
