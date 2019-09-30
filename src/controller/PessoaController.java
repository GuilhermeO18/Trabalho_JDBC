package controller;

import dao.PessoaDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.PessoaModel;
/**
 *
 * @author paulinho
 */
public class PessoaController { 
    
    private List<PessoaModel> listaPessoa;

    public ArrayList<PessoaModel> consultar(String filtro) throws SQLException, SQLException{
       listaPessoa = new PessoaDao().consultar(filtro);
       return (ArrayList<PessoaModel>) listaPessoa;
    }
    
    public void excluir(PessoaModel usuario) throws SQLException, SQLException {
        PessoaDao dao = new PessoaDao();
        dao.excluir(usuario);
    }

    public void adicionar(PessoaModel usuario) throws SQLException, SQLException {
        PessoaDao dao = new PessoaDao();
        dao.adicionar(usuario);
    }

    public void alterar(PessoaModel usuario) throws SQLException, SQLException {
       PessoaDao dao = new PessoaDao();
        dao.alterar(usuario);
    }

    public void gravar(String operacao, PessoaModel pessoa) throws SQLException, SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(pessoa);
        } else if (operacao.equals("alterar")) {
            alterar(pessoa);
        }
    }
}
