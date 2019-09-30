package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.VendaPagtoModel;

/**
 *
 * @author paulinho
 */
public class VendaPagtoDao {

    private Connection conexao = null;

    public VendaPagtoDao() throws SQLException {
        //this.conexao = Conexao.getConexao();
    }

    public void adicionar(VendaPagtoModel vendaPagto) throws SQLException {
        String sql = "INSERT INTO VENDA_PAGTO (VDP_CODIGO, VDP_VALOR)"
                + " VALUES (?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, vendaPagto.getVDP_CODIGO());
        stm.setDouble(2, vendaPagto.getVDP_VALOR());
        stm.execute();
        stm.close();
    }

    public void alterar(VendaPagtoModel vendaPagto) throws SQLException {
        String sql = "UPDATE VENDA_PAGTO SET VDP_VALOR = ? WHERE VDP_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, vendaPagto.getVDP_CODIGO());
        stm.setDouble(2, vendaPagto.getVDP_VALOR());
        stm.execute();
        stm.close();
    }

    public void excluir(VendaPagtoModel vendaPagto) throws SQLException {
        String sql = "DELETE FROM VENDA_PAGTO WHERE VDP_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, vendaPagto.getVDP_CODIGO());
        stm.execute();
        stm.close();
    }

    public ArrayList<VendaPagtoModel> consultar(String condicao) throws SQLException {
        ArrayList<VendaPagtoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM VENDA_PAGTO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            VendaPagtoModel objvdp = new VendaPagtoModel();
            objvdp.setVDP_CODIGO(rs.getInt("VDP_CODIGO"));
            objvdp.setVDP_VALOR(rs.getDouble("VDP_VALOR"));
            lista.add(objvdp);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
