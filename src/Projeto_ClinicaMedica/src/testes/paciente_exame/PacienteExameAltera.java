package testes.paciente_exame;

import persistencia.PacienteExameDAO;

public class PacienteExameAltera {

    public static void main(String[] args) throws Exception {

        System.out.println(PacienteExameDAO.altera(2, "11111111111", 1));

    }

}