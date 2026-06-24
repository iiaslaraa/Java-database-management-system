package testes.paciente_exame;

import java.util.List;
import modelo.PacienteExame;
import persistencia.PacienteExameDAO;

public class PacienteExameLeTodosBetween {

    public static void main(String[] args) throws Exception {

        List<PacienteExame> lista =
                PacienteExameDAO.leTodosBetween(1,10);

        for(PacienteExame pe : lista){

            System.out.println(pe);

        }

    }

}