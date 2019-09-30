/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import conexao.Conexao;
import view.Menu;

/**
 *
 * @author celio
 */
public class MVC_DAO {
    Conexao objconexao;
    Menu menuView;

    public MVC_DAO() {
        //objconexao = new Conexao();
        menuView = new Menu();
    }

    public static void main(String[] args) {
        MVC_DAO mvc_dao = new MVC_DAO();
    }

}
