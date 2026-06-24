package testes.medico_paciente;

import persistencia.MedicoPacienteDAO;

public class MedicoPacienteExclui {

    public static void main(String[] args) throws Exception {
        System.out.println(MedicoPacienteDAO.exclui("88888888888", "55555555555"));
    }
}
