package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.MedicoPaciente;

public class MedicoPacienteDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<MedicoPaciente> leTodos() throws Exception {

        List<MedicoPaciente> lista = new ArrayList<MedicoPaciente>();

        try {
            String sql = "SELECT * FROM medico_paciente";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                MedicoPaciente mp = new MedicoPaciente();

                mp.setMedicoCpfMedico(rs.getString("cpfMedico"));
                mp.setPacienteCpfPaciente(rs.getString("cpfPaciente"));

                lista.add(mp);
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static List<MedicoPaciente> leTodosLike(String cpfMedico) throws Exception {

        List<MedicoPaciente> lista = new ArrayList<MedicoPaciente>();

        try {
            String sql = "SELECT * FROM medico_paciente WHERE cpfMedico LIKE ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, "%" + cpfMedico + "%");
            rs = st.executeQuery();

            while (rs.next()) {
                MedicoPaciente mp = new MedicoPaciente();

                mp.setMedicoCpfMedico(rs.getString("cpfMedico"));
                mp.setPacienteCpfPaciente(rs.getString("cpfPaciente"));

                lista.add(mp);
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static List<MedicoPaciente> leTodosNotIn(String cpfPaciente) throws Exception {

        List<MedicoPaciente> lista = new ArrayList<MedicoPaciente>();

        try {
            String sql = "SELECT * FROM medico_paciente WHERE cpfPaciente NOT IN (?)";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpfPaciente);
            rs = st.executeQuery();

            while (rs.next()) {
                MedicoPaciente mp = new MedicoPaciente();

                mp.setMedicoCpfMedico(rs.getString("cpfMedico"));
                mp.setPacienteCpfPaciente(rs.getString("cpfPaciente"));

                lista.add(mp);
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static List<MedicoPaciente> leTodosBetween(String cpfInicial, String cpfFinal) throws Exception {

        List<MedicoPaciente> lista = new ArrayList<MedicoPaciente>();

        try {
            String sql = "SELECT * FROM medico_paciente WHERE cpfPaciente BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpfInicial);
            st.setString(2, cpfFinal);
            rs = st.executeQuery();

            while (rs.next()) {
                MedicoPaciente mp = new MedicoPaciente();

                mp.setMedicoCpfMedico(rs.getString("cpfMedico"));
                mp.setPacienteCpfPaciente(rs.getString("cpfPaciente"));

                lista.add(mp);
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static MedicoPaciente leUm(String cpfMedico, String cpfPaciente) throws Exception {

        MedicoPaciente mp = new MedicoPaciente();

        try {
            String sql = "SELECT * FROM medico_paciente WHERE cpfMedico = ? AND cpfPaciente = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpfMedico);
            st.setString(2, cpfPaciente);
            rs = st.executeQuery();

            if (rs.next()) {
                mp.setMedicoCpfMedico(rs.getString("cpfMedico"));
                mp.setPacienteCpfPaciente(rs.getString("cpfPaciente"));
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return mp;
    }

    public static int grava(String cpfMedico, String cpfPaciente) throws Exception {

        int ret = 0;

        try {
            String sql = "INSERT INTO medico_paciente (cpfMedico, cpfPaciente) VALUES (?, ?)";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpfMedico);
            st.setString(2, cpfPaciente);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    public static int altera(String novoCpfPaciente, String cpfMedico, String cpfPacienteAtual) throws Exception {

        int ret = 0;

        try {
            String sql = "UPDATE medico_paciente SET cpfPaciente = ? WHERE cpfMedico = ? AND cpfPaciente = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, novoCpfPaciente);
            st.setString(2, cpfMedico);
            st.setString(3, cpfPacienteAtual);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    public static int exclui(String cpfMedico, String cpfPaciente) throws Exception {

        int ret = 0;

        try {
            String sql = "DELETE FROM medico_paciente WHERE cpfMedico = ? AND cpfPaciente = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpfMedico);
            st.setString(2, cpfPaciente);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }
}