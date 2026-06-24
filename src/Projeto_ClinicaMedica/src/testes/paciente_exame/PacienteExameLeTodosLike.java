package testes.paciente_exame;

import java.util.List;
import modelo.PacienteExame;
import persistencia.PacienteExameDAO;

public class PacienteExameLeTodosLike {

    public static void main(String[] args) throws Exception {

        List<PacienteExame> lista =
                PacienteExameDAO.leTodosLike("111");

        for(PacienteExame pe : lista){

            System.out.println(pe);

        }

    }

}