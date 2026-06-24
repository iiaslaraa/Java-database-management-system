package testes.paciente_exame;

import java.util.List;
import modelo.PacienteExame;
import persistencia.PacienteExameDAO;

public class PacienteExameLeTodos {

    public static void main(String[] args) throws Exception {

        List<PacienteExame> lista = PacienteExameDAO.leTodos();

        for(PacienteExame pe : lista){

            System.out.println(pe);

        }

    }

}