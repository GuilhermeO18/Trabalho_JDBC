/*
 * https://github.com/GuilhermeO18/Trabalho01.git
 * https://github.com/GuilhermeO18
 * guilherme.oliveirag18@gmail.com
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PessoaModel;
import model.UsuarioModel;

/**
 *
 * @author Gustavo_Diogo
 */
public class PessoaDao {
    
    private Connection conexao = null;
    
    public PessoaDao() throws SQLException {
        // this.conexao = Conexao.getConexao();
    }
    
    public void adicionar(PessoaModel pessoa) throws SQLException {
        String sql = "INSERT INTO PESSOA (PES_NOME, PES_FANTASIA, PES_FISICA, PES_CPFCNPJ, PES_RGIE, PES_CADASTRO, PES_ENDERECO, PES_NUMERO, PES_COMPLEMENTO, PES_BAIRRO, PES_CIDADE, PES_UF, PES_CEP, PES_FONE1, PES_FONE2, PES_CELULAR, PES_SITE, PES_EMAIL, PES_ATIVO)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, pessoa.getPES_NOME());
        stm.setString(2, pessoa.getPES_FANTASIA());
        stm.setString(3, pessoa.getPES_FISICA());
        stm.setString(4, pessoa.getPES_CPFCNPJ());
        stm.setString(5, pessoa.getPES_RGIE());
        stm.setString(6, pessoa.getPES_CADASTRO());
        stm.setString(7, pessoa.getPES_ENDERECO());
        stm.setString(8, pessoa.getPES_NUMERO());
        stm.setString(9, pessoa.getPES_COMPLEMENTO());
        stm.setString(10, pessoa.getPES_BAIRRO());
        stm.setString(11, pessoa.getPES_CIDADE());
        stm.setString(12, pessoa.getPES_UF());
        stm.setString(13, pessoa.getPES_CEP());
        stm.setString(14, pessoa.getPES_FONE1());
        stm.setString(15, pessoa.getPES_FONE2());
        stm.setString(16, pessoa.getPES_CELULAR());
        stm.setString(17, pessoa.getPES_SITE());
        stm.setString(18, pessoa.getPES_EMAIL());
        stm.setString(19, pessoa.getPES_ATIVO());
        stm.execute();
        stm.close();
    }
    
    public void alterar(PessoaModel pessoa) throws SQLException {
        String sql = "UPDATE PESSOA SET PES_NOME = ?, PES_FANTASIA = ?, PES_FISICA = ?, PES_CPFCNPJ = ?, PES_RGIE = ?, PES_CADASTRO = ?, PES_ENDERECO = ?, PES_NUMERO = ?, PES_COMPLEMENTO = ?, PES_BAIRRO = ?, PES_CIDADE = ?, PES_UF = ?, PES_CEP = ?, PES_FONE1 = ?, PES_FONE2 = ?, PES_CELULAR = ?, PES_SITE = ?, PES_EMAIL = ?, PES_ATIVO = ? WHERE USU_CODIGO = ?";
    PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, pessoa.getPES_NOME());
        stm.setString(2, pessoa.getPES_FANTASIA());
        stm.setString(3, pessoa.getPES_FISICA());
        stm.setString(4, pessoa.getPES_CPFCNPJ());
        stm.setString(5, pessoa.getPES_RGIE());
        stm.setString(6, pessoa.getPES_CADASTRO());
        stm.setString(7, pessoa.getPES_ENDERECO());
        stm.setString(8, pessoa.getPES_NUMERO());
        stm.setString(9, pessoa.getPES_COMPLEMENTO());
        stm.setString(10, pessoa.getPES_BAIRRO());
        stm.setString(11, pessoa.getPES_CIDADE());
        stm.setString(12, pessoa.getPES_UF());
        stm.setString(13, pessoa.getPES_CEP());
        stm.setString(14, pessoa.getPES_FONE1());
        stm.setString(15, pessoa.getPES_FONE2());
        stm.setString(16, pessoa.getPES_CELULAR());
        stm.setString(17, pessoa.getPES_SITE());
        stm.setString(18, pessoa.getPES_EMAIL());
        stm.setString(19, pessoa.getPES_ATIVO());
        stm.execute();
        stm.close();
    }
    
     public void excluir(PessoaModel pessoa) throws SQLException {
         String sql = "DELETE FROM PESSOA WHERE PES_CODIGO = ?";
         PreparedStatement stm = conexao.prepareStatement(sql);
         stm.setInt(1, pessoa.getPES_CODIGO());
         stm.execute();
         stm.close();
     }
     
     public ArrayList<PessoaModel> consultar(String condicao) throws SQLException {
        ArrayList<PessoaModel> lista = null;
        PreparedStatement stm;
        ResultSet pessoa;
        String sql = "SELECT * FROM USUARIO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        pessoa = stm.executeQuery();
        lista = new ArrayList<>();

        while (pessoa.next()) {
            PessoaModel objpes = new PessoaModel();
            objpes.setPES_NOME(pessoa.getString("PES_NOME"));
            objpes.setPES_FANTASIA(pessoa.getString("PES_FANTASIA"));
            objpes.setPES_FISICA(pessoa.getString("PES_FISICA"));
            objpes.setPES_CPFCNPJ(pessoa.getString("PES_CPFCNPJ"));
            objpes.setPES_RGIE(pessoa.getString("PES_RGIE"));
            objpes.setPES_CADASTRO(pessoa.getString("PES_CADASTRO"));
            objpes.setPES_ENDERECO(pessoa.getString("PES_ENDERECO"));
            objpes.setPES_NUMERO(pessoa.getString("PES_NUMERO"));
            objpes.setPES_COMPLEMENTO(pessoa.getString("PES_COMPLEMENTO"));
            objpes.setPES_BAIRRO(pessoa.getString("PES_BAIRRO"));
            objpes.setPES_CIDADE(pessoa.getString("PES_CIDADE"));
            objpes.setPES_UF(pessoa.getString("PES_UF"));
            objpes.setPES_CEP(pessoa.getString("PES_CEP"));
            objpes.setPES_FONE1(pessoa.getString("PES_FONE1"));
            objpes.setPES_FONE2(pessoa.getString("PES_FONE2"));
            objpes.setPES_CELULAR(pessoa.getString("PES_CELULAR"));
            objpes.setPES_SITE(pessoa.getString("PES_SITE"));
            objpes.setPES_EMAIL(pessoa.getString("PES_EMAIL"));
            objpes.setPES_ATIVO(pessoa.getString("PES_ATIVO"));
            lista.add(objpes);
        }
        pessoa.close();
        stm.close();
        return lista;
    }
}
