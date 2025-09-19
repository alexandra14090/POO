public class claseEncuesta {
    private boolean siAsistioMedGen;
    private boolean siAsistioOdont;
    private boolean siAsistioPsico;

    public claseEncuesta(boolean siAsistioMedGen, boolean siAsistioOdont, boolean siAsistioPsico) {
        this.siAsistioMedGen = siAsistioMedGen;
        this.siAsistioOdont = siAsistioOdont;
        this.siAsistioPsico = siAsistioPsico;
    }

    public void registrarEncuesta() {
        System.out.println("Encuesta registrada");
    }
}
