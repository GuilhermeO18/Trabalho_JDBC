package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.VendaProdutoModel;
/**
 *
 * @author unip
 */
public class VendaProdutoDao {
    
    private Connection conexao = null;

    public VendaProdutoDao() throws SQLException {
        //this.conexao = Conexao.getConexao();
    }

    public void adicionar(VendaProdutoModel vendaProduto) throws SQLException {
        String sql = "INSERT INTO VENDA_PRODUTO (VEP_CODIGO, VEP_QTDE, VEP_PRECO, VEP_DESCONTO, VEP_TOTAL)"
                + " VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, vendaProduto.getVEP_CODIGO());
        stm.setInt(2, vendaProduto.getVEP_QTDE());
        stm.setDouble(3, vendaProduto.getVEP_PRECO());
        stm.setDouble(4, vendaProduto.getVEP_DESCONTO());
        stm.setDouble(5, vendaProduto.getVEP_TOTAL());
        stm.execute();
        stm.close();
    }

    public void alterar(VendaProdutoModel vendaProduto) throws SQLException {
        String sql = "UPDATE VENDA_PRODUTO SET VEP_QTDE = ?, VEP_PRECO = ?, "
                + "VEP_DESCONTO = ?, VEP_TOTAL = ? WHERE VEP_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, vendaProduto.getVEP_CODIGO());
        stm.setInt(2, vendaProduto.getVEP_QTDE());
        stm.setDouble(3, vendaProduto.getVEP_PRECO());
        stm.setDouble(4, vendaProduto.getVEP_DESCONTO());
        stm.setDouble(5, vendaProduto.getVEP_TOTAL());
        stm.execute();
        stm.close();
    }

    public void excluir(VendaProdutoModel vendaProduto) throws SQLException {
        String sql = "DELETE FROM VENDA_PRODUTO WHERE VEP_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, vendaProduto.getVEP_CODIGO());
        stm.execute();
        stm.close();
    }

    public ArrayList<VendaProdutoModel> consultar(String condicao) throws SQLException {
        ArrayList<VendaProdutoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM VENDA_PRODUTO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            VendaProdutoModel objvep = new VendaProdutoModel();
            objvep.setVEP_CODIGO(rs.getInt("VEP_CODIGO"));
            objvep.setVEP_QTDE(rs.getInt("VEP_QTDE"));
            objvep.setVEP_PRECO(rs.getDouble("VEP_PRECO"));
            objvep.setVEP_DESCONTO(rs.getDouble("VEP_DESCONTO"));
            objvep.setVEP_TOTAL(rs.getDouble("VEP_TOTAL"));
            lista.add(objvep);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
