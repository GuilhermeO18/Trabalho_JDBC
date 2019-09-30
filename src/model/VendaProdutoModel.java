/*
 * https://github.com/GuilhermeO18/Trabalho01.git
 * https://github.com/GuilhermeO18
 * guilherme.oliveirag18@gmail.com
 */
package model;

/**
 *
 * @author paulinho
 */
public class VendaProdutoModel {
    private int VEP_CODIGO;
    private VendaModel VENDA;
    private ProdutoModel PRODUTO;
    private double VEP_QTDE;
    private double VEP_PRECO;
    private double VEP_DESCONTO;
    private double VEP_TOTAL;
    
    public VendaProdutoModel(){}
    
    public VendaProdutoModel(int VEP_CODIGO, VendaModel VENDA, ProdutoModel PRODUTO, double VEP_QTDE, double VEP_PRECO, double VEP_DESCONTO, double VEP_TOTAL){
        this.VEP_CODIGO = VEP_CODIGO;
        this.VENDA = VENDA;
        this.PRODUTO = PRODUTO;
        this.VEP_QTDE = VEP_QTDE;
        this.VEP_PRECO = VEP_PRECO;
        this.VEP_DESCONTO = VEP_DESCONTO;
        this.VEP_TOTAL = VEP_TOTAL;
    }

    public int getVEP_QTDE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getVEP_CODIGO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getVEP_PRECO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getVEP_DESCONTO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getVEP_TOTAL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVEP_CODIGO(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVEP_QTDE(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVEP_PRECO(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVEP_DESCONTO(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVEP_TOTAL(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
