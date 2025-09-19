public class claseEncuesta {
    public boolean siAsistioMedGen;
    public boolean siAsistioOdont;
    public boolean siAsistioPsico;

    public claseEncuesta(boolean siAsistioMedGen, boolean siAsistioOdont, boolean siAsistioPsico) {
        this.siAsistioMedGen = siAsistioMedGen;
        this.siAsistioOdont = siAsistioOdont;
        this.siAsistioPsico = siAsistioPsico;
    }

    public void registrarEncuesta() {
        System.out.println("Encuesta registrada");
    }
}
