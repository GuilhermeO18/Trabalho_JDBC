package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.VendaModel;

/**
 *
 * @author unip
 */
public class VendaDao {

    private Connection conexao = null;

    public VendaDao() throws SQLException {
        //this.conexao = Conexao.getConexao();
    }

    public void adicionar(VendaModel venda) throws SQLException {
        String sql = "INSERT INTO VENDA (VDA_CODIGO, VDA_DATA, VDA_VALOR, VDA_DESCONTO, VDA_TOTAL, VDA_OBS)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, venda.getVDA_CODIGO());
        stm.setDate(2, venda.getVDA_DATA());
        stm.setDouble(3, venda.getVDA_VALOR());
        stm.setDouble(4, venda.getVDA_DESCONTO());
        stm.setDouble(5, venda.getVDA_TOTAL());
        stm.setString(6, venda.getVDA_OBS());
        stm.execute();
        stm.close();
    }

    public void alterar(VendaModel venda) throws SQLException {
        String sql = "UPDATE VENDA SET VDA_DATA = ?, VDA_VALOR = ?, "
                + "VDA_DESCONTO = ?, VDA_TOTAL = ? , VDA_OBS, WHERE VDA_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, venda.getVDA_CODIGO());
        stm.setDate(2, venda.getVDA_DATA());
        stm.setDouble(3, venda.getVDA_VALOR());
        stm.setDouble(4, venda.getVDA_DESCONTO());
        stm.setDouble(5, venda.getVDA_TOTAL());
        stm.setString(6, venda.getVDA_OBS());
        stm.execute();
        stm.close();
    }

    public void excluir(VendaModel venda) throws SQLException {
        String sql = "DELETE FROM VENDA WHERE VDA_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, venda.getVDA_CODIGO());
        stm.execute();
        stm.close();
    }

    public ArrayList<VendaModel> consultar(String condicao) throws SQLException {
        ArrayList<VendaModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM VENDA";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            VendaModel objvda = new VendaModel();
            objvda.setVDA_CODIGO(rs.getInt("VDA_CODIGO"));
            objvda.setVDA_DATA(rs.getDate("VDA_DATA"));
            objvda.setVDA_VALOR(rs.getDouble("VDA_VALOR"));
            objvda.setVDA_DESCONTO(rs.getDouble("VDA_DESCONTO"));
            objvda.setVDA_TOTAL(rs.getDouble("VDA_TOTAL"));
            objvda.setVDA_OBS(rs.getString("VDA_OBS"));
            lista.add(objvda);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
