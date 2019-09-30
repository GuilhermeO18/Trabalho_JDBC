package controller;

import dao.FormaPagtoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.FormaPagtoModel;

/**
 *
 * @author paulinho
 */
public class FormaPagtoController {
    
    private List<FormaPagtoModel> listaFormaPagto;

    public ArrayList<FormaPagtoModel> consultar(String filtro) throws SQLException {
        listaFormaPagto = new FormaPagtoDao().consultar(filtro);
        return (ArrayList<FormaPagtoModel>) listaFormaPagto;
    }

    public void excluir(FormaPagtoModel formaPagto) throws SQLException {
        FormaPagtoDao dao = new FormaPagtoDao();
        dao.excluir(formaPagto);
    }

    public void adicionar(FormaPagtoModel formaPagto) throws SQLException {
        FormaPagtoDao dao = new FormaPagtoDao();
        dao.adicionar(formaPagto);
    }

    public void alterar(FormaPagtoModel formaPagto) throws SQLException {
        FormaPagtoDao dao = new FormaPagtoDao();
        dao.alterar(formaPagto);
    }

    public void gravar(String operacao, FormaPagtoModel formaPagto) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(formaPagto);
        } else if (operacao.equals("alterar")) {
            alterar(formaPagto);
        }
    }
}
