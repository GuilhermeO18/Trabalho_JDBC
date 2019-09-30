package controller;

import dao.CompraProdutoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CompraProdutoModel;

/**
 *
 * @author paulinho
 */
public class CompraProdutoController {
    
     private List<CompraProdutoModel> listCompraProduto;

    public ArrayList<CompraProdutoModel> consultar(String filtro) throws SQLException {
        listCompraProduto = new CompraProdutoDao().consultar(filtro);
        return (ArrayList<CompraProdutoModel>) listCompraProduto;
    }

    public void excluir(CompraProdutoModel compraProduto) throws SQLException {
        CompraProdutoDao dao = new CompraProdutoDao();
        dao.excluir(compraProduto);
    }

    public void adicionar(CompraProdutoModel compraProduto) throws SQLException {
        CompraProdutoDao dao = new CompraProdutoDao();
        dao.adicionar(compraProduto);
    }

    public void alterar(CompraProdutoModel compraProduto) throws SQLException {
        CompraProdutoDao dao = new CompraProdutoDao();
        dao.alterar(compraProduto);
    }

    public void gravar(String operacao, CompraProdutoModel compraProduto) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(compraProduto);
        } else if (operacao.equals("alterar")) {
            alterar(compraProduto);
        }
    }
}
