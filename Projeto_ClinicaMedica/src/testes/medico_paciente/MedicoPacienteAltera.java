package testes.medico_paciente;

import persistencia.MedicoPacienteDAO;

public class MedicoPacienteAltera {

    public static void main(String[] args) throws Exception {
        System.out.println(MedicoPacienteDAO.altera("55555555555", "88888888888", "44444444444"));
    }
}