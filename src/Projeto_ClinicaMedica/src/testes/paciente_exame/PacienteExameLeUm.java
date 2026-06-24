package testes.paciente_exame;

import persistencia.PacienteExameDAO;

public class PacienteExameLeUm {

    public static void main(String[] args) throws Exception {

        System.out.println(PacienteExameDAO.leUm("11111111111", 1));

    }

}