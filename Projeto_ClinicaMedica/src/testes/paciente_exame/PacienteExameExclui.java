package testes.paciente_exame;

import persistencia.PacienteExameDAO;

public class PacienteExameExclui {

    public static void main(String[] args) throws Exception {

        System.out.println(PacienteExameDAO.exclui("11111111111", 2));

    }

}
