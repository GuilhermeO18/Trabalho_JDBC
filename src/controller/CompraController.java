package controller;

import dao.CompraDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CompraModel;

/**
 *
 * @author paulinho
 */
public class CompraController {
    
    private List<CompraModel> listaCompra;

    public ArrayList<CompraModel> consultar(String filtro) throws SQLException {
        listaCompra = new CompraDao().consultar(filtro);
        return (ArrayList<CompraModel>) listaCompra;
    }

    public void excluir(CompraModel compra) throws SQLException {
        CompraDao dao = new CompraDao();
        dao.excluir(compra);
    }

    public void adicionar(CompraModel compra) throws SQLException {
        CompraDao dao = new CompraDao();
        dao.adicionar(compra);
    }

    public void alterar(CompraModel compra) throws SQLException {
        CompraDao dao = new CompraDao();
        dao.alterar(compra);
    }

    public void gravar(String operacao, CompraModel compra) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(compra);
        } else if (operacao.equals("alterar")) {
            alterar(compra);
        }
    }
}
