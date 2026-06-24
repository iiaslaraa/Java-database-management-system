package modelo;
public class MedicoExame {
    private String medicoCpfMedico;
    private int exameIdExame;

    public String getMedicoCpfMedico() {
        return medicoCpfMedico;
    }

    public void setMedicoCpfMedico(String medicoCpfMedico) {
        this.medicoCpfMedico = medicoCpfMedico;
    }

    public int getExameIdExame() {
        return exameIdExame;
    }

    public void setExameIdExame(int exameIdExame) {
        this.exameIdExame = exameIdExame;
    }
    //CONSTRUTOR VAZIO
    public MedicoExame(){}
    //CONSTRUTOR
    public String toString() {
        return "\n ____________________________" +
                "\n ......  MÉDICO EXAME ......" +
                "\n ----------------------------" +
                "\n CPF Médico: " + getMedicoCpfMedico() +
                "\n ID Exame: " + getExameIdExame();
    }
}
