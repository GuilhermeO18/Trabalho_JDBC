/*
 * https://github.com/GuilhermeO18/Trabalho01.git
 * https://github.com/GuilhermeO18
 * guilherme.oliveirag18@gmail.com
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Guilherme
 */
public class Conexao {
    private final static String DRIVER= "oracle.jdbc.OracleDriver";
    private final static String BANCO= "jdbc:oracle:thin:@localhost:1521:XE";
    private final static String USUARIO= "JDBC";
    private final static String SENHA= "JDBC";
    
    
    Connection conexao = null;
    public static void main(String args[]) throws SQLException{
        
        Conexao cnt = new Conexao();
        
    }
    
    public void Abrir() throws SQLException{
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(BANCO, USUARIO, SENHA);
        }
        
        catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Erro na Classe de Conexão do Banco.\n" + ex.getMessage());
        }
    }
    
    public void Fechar() throws SQLException{
        
        conexao.close();
        
    }
}