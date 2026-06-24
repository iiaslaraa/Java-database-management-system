package testes.paciente_exame;

import java.util.List;
import modelo.PacienteExame;
import persistencia.PacienteExameDAO;

public class PacienteExameLeTodosNotIn {

    public static void main(String[] args) throws Exception {

        List<PacienteExame> lista =
                PacienteExameDAO.leTodosNotIn(1);

        for(PacienteExame pe : lista){

            System.out.println(pe);

        }

    }

}