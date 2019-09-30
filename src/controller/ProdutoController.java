package controller;

import dao.ProdutoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ProdutoModel;

/**
 *
 * @author paulinho
 */
public class ProdutoController {
    
    private List<ProdutoModel> listaProduto;

    public ArrayList<ProdutoModel> consultar(String filtro) throws SQLException {
        listaProduto = new ProdutoDao().consultar(filtro);
        return (ArrayList<ProdutoModel>) listaProduto;
    }

    public void excluir(ProdutoModel produto) throws SQLException {
        ProdutoDao dao = new ProdutoDao();
        dao.excluir(produto);
    }

    public void adicionar(ProdutoModel produto) throws SQLException {
        ProdutoDao dao = new ProdutoDao();
        dao.adicionar(produto);
    }

    public void alterar(ProdutoModel produto) throws SQLException {
        ProdutoDao dao = new ProdutoDao();
        dao.alterar(produto);
    }

    public void gravar(String operacao, ProdutoModel produto) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(produto);
        } else if (operacao.equals("alterar")) {
            alterar(produto);
        }
    }
}
