package codeSmellParametros;

public class Paciente {
    private String nombrePaciente;
    private String documentoPaciente;
    private String fechaNacimientoPaciente;

    public Paciente(String nombrePaciente, String documentoPaciente, String fechaNacimientoPaciente) {
        this.nombrePaciente = nombrePaciente;
        this.documentoPaciente = documentoPaciente;
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getDocumentoPaciente() {
        return documentoPaciente;
    }

    public String getFechaNacimientoPaciente() {
        return fechaNacimientoPaciente;
    }
}
