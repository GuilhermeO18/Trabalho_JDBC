package controller;

import dao.VendaPagtoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.VendaPagtoModel;

/**
 *
 * @author paulinho
 */
public class VendaPagtoController {
    
    private List<VendaPagtoModel> listaVendaProduto;

    public ArrayList<VendaPagtoModel> consultar(String filtro) throws SQLException {
        listaVendaProduto = new VendaPagtoDao().consultar(filtro);
        return (ArrayList<VendaPagtoModel>) listaVendaProduto;
    }

    public void excluir(VendaPagtoModel vendaProduto) throws SQLException {
        VendaPagtoDao dao = new VendaPagtoDao();
        dao.excluir(vendaProduto);
    }

    public void adicionar(VendaPagtoModel vendaProduto) throws SQLException {
        VendaPagtoDao dao = new VendaPagtoDao();
        dao.adicionar(vendaProduto);
    }

    public void alterar(VendaPagtoModel vendaProduto) throws SQLException {
        VendaPagtoDao dao = new VendaPagtoDao();
        dao.alterar(vendaProduto);
    }

    public void gravar(String operacao, VendaPagtoModel vendaProduto) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(vendaProduto);
        } else if (operacao.equals("alterar")) {
            alterar(vendaProduto);
        }
    }
}
