package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.CompraProdutoModel;

/**
 *
 * @author paulinho
 */
public class CompraProdutoDao {
    
    private Connection conexao = null;

    public CompraProdutoDao() throws SQLException {
        //this.conexao = Conexao.getConexao();
    }

    public void adicionar(CompraProdutoModel compraProduto) throws SQLException {
        String sql = "INSERT INTO COMPRA_PRODUTO (CPP_CODIGO, CPR_QTDE, CPR_PRECO, CPR_DESCONTO,"
                + " CPR_TOTAL)"
                + " VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, compraProduto.getCPP_CODIGO());
        stm.setInt(2, compraProduto.getCPR_QTDE());
        stm.setDouble(3, compraProduto.getCPR_PRECO());
        stm.setDouble(4, compraProduto.getCPR_DESCONTO());
        stm.setDouble(5, compraProduto.getCPR_TOTAL());
        stm.execute();
        stm.close();
    }

    public void alterar(CompraProdutoModel compraProduto) throws SQLException {
        String sql = "UPDATE COMPRA_PRODUTO SET CPR_QTDE = ?, CPR_PRECO = ?, "
                + "CPR_DESCONTO = ?, CPR_TOTAL = ? WHERE CPP_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, compraProduto.getCPP_CODIGO());
        stm.setInt(2, compraProduto.getCPR_QTDE());
        stm.setDouble(3, compraProduto.getCPR_PRECO());
        stm.setDouble(4, compraProduto.getCPR_DESCONTO());
        stm.setDouble(5, compraProduto.getCPR_TOTAL());
        stm.execute();
        stm.close();
    }

    public void excluir(CompraProdutoModel compraProduto) throws SQLException {
        String sql = "DELETE FROM COMPRA_PRODUTO WHERE CPP_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, compraProduto.getCPP_CODIGO());
        stm.execute();
        stm.close();
    }

    public ArrayList<CompraProdutoModel> consultar(String condicao) throws SQLException {
        ArrayList<CompraProdutoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM COMPRA_PRODUTO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            CompraProdutoModel objcpp = new CompraProdutoModel();
            objcpp.setCPP_CODIGO(rs.getInt("CPP_CODIGO"));
            objcpp.setCPR_QTDE(rs.getInt("CPR_QTDE"));
            objcpp.setCPR_PRECO(rs.getDouble("CPR_PRECO"));
            objcpp.setCPR_TOTAL(rs.getDouble("PR_TOTAL"));
            lista.add(objcpp);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
