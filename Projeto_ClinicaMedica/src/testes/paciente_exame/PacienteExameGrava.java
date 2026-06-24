package testes.paciente_exame;

import persistencia.PacienteExameDAO;

public class PacienteExameGrava {

    public static void main(String[] args) throws Exception {

        System.out.println(PacienteExameDAO.grava("11111111111", 1));

    }

}