package testes.medico_paciente;

import java.util.List;
import modelo.MedicoPaciente;
import persistencia.MedicoPacienteDAO;

public class MedicoPacienteLeTodosBetween {

    public static void main(String[] args) throws Exception {

        List<MedicoPaciente> lista =
                MedicoPacienteDAO.leTodosBetween("11111111111","55555555555");

        for (MedicoPaciente mp : lista) {
            System.out.println(mp);
        }
    }
}