package controller;

import dao.FornecedorDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.FornecedorModel;

/**
 *
 * @author paulinho
 */
public class FornecedorController {
    
    private List<FornecedorModel> listaFornecedor;

    public ArrayList<FornecedorModel> consultar(String filtro) throws SQLException {
        listaFornecedor = new FornecedorDao().consultar(filtro);
        return (ArrayList<FornecedorModel>) listaFornecedor;
    }

    public void excluir(FornecedorModel fornecedor) throws SQLException {
        FornecedorDao dao = new FornecedorDao();
        dao.excluir(fornecedor);
    }

    public void adicionar(FornecedorModel fornecedor) throws SQLException {
        FornecedorDao dao = new FornecedorDao();
        dao.adicionar(fornecedor);
    }

    public void alterar(FornecedorModel fornecedor) throws SQLException {
        FornecedorDao dao = new FornecedorDao();
        dao.alterar(fornecedor);
    }

    public void gravar(String operacao, FornecedorModel fornecedor) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(fornecedor);
        } else if (operacao.equals("alterar")) {
            alterar(fornecedor);
        }
    }
}
