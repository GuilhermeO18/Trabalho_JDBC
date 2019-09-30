package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FornecedorModel;

/**
 *
 * @author paulinho
 */
public class FornecedorDao {
    
    private Connection conexao = null;

    public FornecedorDao() throws SQLException {
        //this.conexao = Conexao.getConexao();
    }

    public void adicionar(FornecedorModel fornecedor) throws SQLException {
        String sql = "INSERT INTO FORNECEDOR (FOR_CODIGO, FOR_CONTATO)"
                + " VALUES (?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, fornecedor.getFOR_CODIGO());
        stm.setString(2, fornecedor.getFOR_CONTATO());
        stm.execute();
        stm.close();
    }

    public void alterar(FornecedorModel fornecedor) throws SQLException {
        String sql = "UPDATE FORNECEDOR SET FOR_CONTATO = ? WHERE FOR_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, fornecedor.getFOR_CODIGO());
        stm.setString(2, fornecedor.getFOR_CONTATO());
        stm.execute();
        stm.close();
    }

    public void excluir(FornecedorModel fornecedor) throws SQLException {
        String sql = "DELETE FROM FORNECEDOR WHERE FOR_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, fornecedor.getFOR_CODIGO());
        stm.execute();
        stm.close();
    }

    public ArrayList<FornecedorModel> consultar(String condicao) throws SQLException {
        ArrayList<FornecedorModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM FORNECEDOR";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            FornecedorModel objfor = new FornecedorModel();
            objfor.setFOR_CODIGO(rs.getInt("FOR_CODIGO"));
            objfor.setFOR_CONTATO(rs.getString("FOR_CONTATO"));
            lista.add(objfor);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
