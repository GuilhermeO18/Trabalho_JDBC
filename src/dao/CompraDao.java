package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.CompraModel;

/**
 *
 * @author paulinho
 */
public class CompraDao {
    
    private Connection conexao = null;

    public CompraDao() throws SQLException {
        //this.conexao = Conexao.getConexao();
    }

    public void adicionar(CompraModel compra) throws SQLException {
        String sql = "INSERT INTO COMPRA (CPR_CODIGO, CPR_EMISSAO, CPR_VALOR, CPR_DESCONTO, CPR_TOTAL,"
                + "CPR_DTENTRADA, CPR_OBS)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, compra.getCPR_CODIGO());
        stm.setDate(2, compra.getCPR_EMISSAO());
        stm.setDouble(3, compra.getCPR_VALOR());
        stm.setDouble(4, compra.getCPR_DESCONTO());
        stm.setDouble(5, compra.getCPR_TOTAL());
        stm.setDate(5, compra.getCPR_DTENTRADA());
        stm.setString(5, compra.getCPR_OBS());
        stm.execute();
        stm.close();
    }

    public void alterar(CompraModel compra) throws SQLException {
        String sql = "UPDATE COMPRA SET USU_NOME = ?, USU_LOGIN = ?, "
                + "USU_SENHA = ?, USU_ATIVO = ? WHERE USU_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
         stm.setInt(1, compra.getCPR_CODIGO());
        stm.setDate(2, compra.getCPR_EMISSAO());
        stm.setDouble(3, compra.getCPR_VALOR());
        stm.setDouble(4, compra.getCPR_DESCONTO());
        stm.setDouble(5, compra.getCPR_TOTAL());
        stm.setDate(5, compra.getCPR_DTENTRADA());
        stm.setString(5, compra.getCPR_OBS());
        stm.execute();
        stm.close();
    }

    public void excluir(CompraModel compra) throws SQLException {
        String sql = "DELETE FROM COMPRA WHERE USU_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, compra.getCPR_CODIGO());
        stm.execute();
        stm.close();
    }

    public ArrayList<CompraModel> consultar(String condicao) throws SQLException {
        ArrayList<CompraModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM COMPRA";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            CompraModel objcpr = new CompraModel();
            objcpr.setCPR_CODIGO(rs.getInt("CPR_CODIGO"));
            objcpr.setCPR_EMISSAO(rs.getDate("CPR_EMISSAO"));
            objcpr.setCPR_VALOR(rs.getDouble("CPR_VALOR"));
            objcpr.setCPR_DESCONTO(rs.getDouble("CPR_DESCONTO"));
            objcpr.setCPR_TOTAL(rs.getDouble("CPR_TOTAL"));
            objcpr.setCPR_DTENTRADA(rs.getDate("CPR_DTENTRADA"));
            objcpr.setCPR_OBS(rs.getString("CPR_OBS"));
            lista.add(objcpr);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
