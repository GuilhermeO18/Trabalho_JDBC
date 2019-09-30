package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ClienteModel;

/**
 *
 * @author paulinho
 */
public class ClienteDao {

    private Connection conexao = null;

    public ClienteDao() throws SQLException {
        //this.conexao = Conexao.getConexao();
    }

    public void adicionar(ClienteModel cliente) throws SQLException {
        String sql = "INSERT INTO CLIENTE (CLI_CODIGO, CLI_LIMITECRED)"
                + " VALUES (?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, cliente.getCLI_CODIGO());
        stm.setDouble(2, cliente.getCLI_LIMITECRED());
        stm.execute();
        stm.close();
    }

    public void alterar(ClienteModel cliente) throws SQLException {
        String sql = "UPDATE CLIENTE SET CLI_LIMITECRED = ? WHERE CLI_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, cliente.getCLI_CODIGO());
        stm.setDouble(2, cliente.getCLI_LIMITECRED());
        stm.execute();
        stm.close();
    }

    public void excluir(ClienteModel cliente) throws SQLException {
        String sql = "DELETE FROM CLIENTE WHERE CLI_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, cliente.getCLI_CODIGO());
        stm.execute();
        stm.close();
    }

    public ArrayList<ClienteModel> consultar(String condicao) throws SQLException {
        ArrayList<ClienteModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM CLIENTE";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            ClienteModel objcli = new ClienteModel();
            objcli.setCLI_CODIGO(rs.getInt("CLI_CODIGO"));
            objcli.setCLI_LIMITECRED(rs.getDouble("CLI_LIMITECRED"));
            lista.add(objcli);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
