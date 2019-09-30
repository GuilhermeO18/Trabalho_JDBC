package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FormaPagtoModel;

/**
 *
 * @author paulinho
 */
public class FormaPagtoDao {

    private Connection conexao = null;

    public FormaPagtoDao() throws SQLException {
        //this.conexao = Conexao.getConexao();
    }

    public void adicionar(FormaPagtoModel formaPagto) throws SQLException {
        String sql = "INSERT INTO FORMAPAGTO (FPG_CODIGO, FPG_NOME, FPG_ATIVO)"
                + " VALUES (?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, formaPagto.getFPG_CODIGO());
        stm.setString(2, formaPagto.getFPG_NOME());
        stm.setString(3, formaPagto.getFPG_ATIVO());
        stm.execute();
        stm.close();
    }

    public void alterar(FormaPagtoModel formaPagto) throws SQLException {
        String sql = "UPDATE FORMAPAGTO SET FPG_NOME = ?, FPG_ATIVO = ? WHERE FPG_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, formaPagto.getFPG_CODIGO());
        stm.setString(2, formaPagto.getFPG_NOME());
        stm.setString(3, formaPagto.getFPG_ATIVO());
        stm.execute();
        stm.close();
    }

    public void excluir(FormaPagtoModel formaPagto) throws SQLException {
        String sql = "DELETE FROM FORMAPAGTO WHERE FPG_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, formaPagto.getFPG_CODIGO());
        stm.execute();
        stm.close();
    }

    public ArrayList<FormaPagtoModel> consultar(String condicao) throws SQLException {
        ArrayList<FormaPagtoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM FORMAPAGTO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            FormaPagtoModel objfpg = new FormaPagtoModel();
            objfpg.setFPG_CODIGO(rs.getInt("FPG_CODIGO"));
            objfpg.setFPG_NOME(rs.getString("FPG_NOME"));
            objfpg.setFPG_ATIVO(rs.getString("FPG_ATIVO"));
            lista.add(objfpg);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
