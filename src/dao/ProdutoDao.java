package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ProdutoModel;

/**
 *
 * @author unip
 */
public class ProdutoDao {

    private Connection conexao = null;

    public ProdutoDao() throws SQLException {
        //this.conexao = Conexao.getConexao();
    }

    public void adicionar(ProdutoModel produto) throws SQLException {
        String sql = "INSERT INTO PRODUTO (PRO_NOME, PRO_ESTOQUE, PRO_UNIDADE, PRO_PRECO, "
                + "PRO_CUSTO, PRO_ATACADO, PRO_MIN, PRO_MAX, PRO_EMBALAGEM, PRO_PESO,  PRO_CADASTRO,"
                + "PRO_OBS, PRO_ATIVO)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, produto.getPRO_NOME());
        stm.setString(2, produto.getPRO_ESTOQUE());
        stm.setString(3, produto.getPRO_UNIDADE());
        stm.setDouble(4, produto.getPRO_PRECO());
        stm.setDouble(5, produto.getPRO_CUSTO());
        stm.setDouble(6, produto.getPRO_ATACADO());
        stm.setInt(7, produto.getPRO_MIN());
        stm.setInt(8, produto.getPRO_MAX());
        stm.setString(9, produto.getPRO_EMBALAGEM());
        stm.setString(10, produto.getPRO_PESO());
        stm.setDate(11, produto.getPRO_CADASTRO());
        stm.setString(12, produto.getPRO_OBS());
        stm.setInt(13, produto.getPRO_ATIVO());
        stm.execute();
        stm.close();
    }

    public void alterar(ProdutoModel produto) throws SQLException {
        String sql = "UPDATE PRODUTO SET PRO_NOME = ?, PRO_ESTOQUE = ?, "
                + "PRO_UNIDADE = ?, PRO_PRECO = ?, PRO_CUSTO = ?, PRO_ATACADO = ?, PRO_MIN = ?, "
                + "PRO_MAX = ?,  PRO_EMBALAGEM = ?, PRO_PESO = ?,  PRO_CADASTRO = ?, PRO_OBS = ?, "
                + "PRO_ATIVO = ? WHERE PRO_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, produto.getPRO_CODIGO());
        stm.setString(2, produto.getPRO_NOME());
        stm.setString(3, produto.getPRO_ESTOQUE());
        stm.setString(4, produto.getPRO_UNIDADE());
        stm.setDouble(5, produto.getPRO_PRECO());
        stm.setDouble(6, produto.getPRO_CUSTO());
        stm.setDouble(7, produto.getPRO_ATACADO());
        stm.setInt(8, produto.getPRO_MIN());
        stm.setInt(9, produto.getPRO_MAX());
        stm.setString(10, produto.getPRO_EMBALAGEM());
        stm.setString(11, produto.getPRO_PESO());
        stm.setDate(12, produto.getPRO_CADASTRO());
        stm.setString(13, produto.getPRO_OBS());
        stm.setInt(14, produto.getPRO_ATIVO());
        stm.execute();
        stm.close();
    }

    public void excluir(ProdutoModel produto) throws SQLException {
        String sql = "DELETE FROM PRODUTO WHERE USU_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, produto.getPRO_CODIGO());
        stm.execute();
        stm.close();
    }

    public ArrayList<ProdutoModel> consultar(String condicao) throws SQLException {
        ArrayList<ProdutoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM PRODUTO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            ProdutoModel objpro = new ProdutoModel();
            objpro.setPRO_CODIGO(rs.getInt("PRO_CODIGO"));
            objpro.setPRO_NOME(rs.getString("PRO_NOME"));
            objpro.setPRO_ESTOQUE(rs.getString("PRO_ESTOQUE"));
            objpro.setPRO_UNIDADE(rs.getString("PRO_UNIDADE"));
            objpro.setPRO_PRECO(rs.getDouble("PRO_PRECO"));
            objpro.setPRO_CUSTO(rs.getDouble("PRO_CUSTO"));
            objpro.setPRO_ATACADO(rs.getDouble("PRO_ATACADO"));
            objpro.setPRO_MIN(rs.getInt("PRO_MIN"));
            objpro.setPRO_MAX(rs.getInt("PRO_MAX"));
            objpro.setPRO_EMBALAGEM(rs.getString("PRO_EMBALAGEM"));
            objpro.setPRO_PESO(rs.getString("PRO_PESO"));
            objpro.setPRO_CADASTRO(rs.getDate("PRO_CADASTRO"));
            objpro.setPRO_OBS(rs.getString("PRO_OBS"));
            objpro.setPRO_ATIVO(rs.getInt("PRO_ATIVO"));
            lista.add(objpro);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
