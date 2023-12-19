package ConexaoComBanco;

import java.sql.*;

public class Conecta {
    public Connection conn;
    private final String DRIVER = "org.postgresql.Driver";
    private final String URL = "jdbc:postgresql://localhost:5432/db_farm_system_v2"; 
    private final String USUARIO = "postgres";
    private final String SENHA = "#89Gu$t4V0";

    public boolean getConexao() {
       
        try {          
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            Class.forName(DRIVER); 
            System.out.println("Conexão Realizada Com Sucesso");
            return true;
        } catch (ClassNotFoundException ex) {
            System.out.println("Problema com o Driver de Conexão! \n" + ex.toString());
            return false;
        } catch (SQLException ex) {
            System.out.println("Problema na conexão com o banco!\n" + ex.toString());
            return false;
        }
    }
    
    public void close() {
        try {
            conn.close();
            System.out.println("Conexão encerrada com sucesso");
        } catch (SQLException ex) {
            System.out.println("Problema ao encerrar a conexão");
        }
    }
}
