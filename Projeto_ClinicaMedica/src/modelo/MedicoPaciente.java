package modelo;
public class MedicoPaciente {
    private String medicoCpfMedico;
    private String pacienteCpfPaciente;

    public String getMedicoCpfMedico() {
        return medicoCpfMedico;
    }

    public void setMedicoCpfMedico(String medicoCpfMedico) {
        this.medicoCpfMedico = medicoCpfMedico;
    }

    public String getPacienteCpfPaciente() {
        return pacienteCpfPaciente;
    }

    public void setPacienteCpfPaciente(String pacienteCpfPaciente) {
        this.pacienteCpfPaciente = pacienteCpfPaciente;
    }
    //CONSTRUTOR VAZIO
    public MedicoPaciente(){}
    //CONSTRUTOR
    public MedicoPaciente(String medicoCpfMedico, String pacienteCpfPaciente) {
        this.medicoCpfMedico = medicoCpfMedico;
        this.pacienteCpfPaciente = pacienteCpfPaciente;
    }
    public String toString() {
        return "\n ____________________________" +
                "\n ....  MÉDICO PACIENTE ....." +
                "\n ----------------------------" +
                "\n CPF Médico: " + getMedicoCpfMedico() +
                "\n CPF Paciente: " + getPacienteCpfPaciente();
    }
}
