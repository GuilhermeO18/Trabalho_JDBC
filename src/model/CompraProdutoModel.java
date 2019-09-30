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
public class CompraProdutoModel {
    private int CPP_CODIGO;
    private CompraModel COMPRA;
    private ProdutoModel PRODUTO;
    private double CPR_QTDE;
    private double CPR_PRECO;
    private double CPR_DESCONTO;
    private double CPR_TOTAL;
    
    public CompraProdutoModel(){}
    
    public CompraProdutoModel(int CPP_CODIGO, CompraModel COMPRA, ProdutoModel PRODUTO, double CPR_QTDE, double CPR_PRECO, double CPR_DESCONTO, double CPR_TOTAL){
        this.CPP_CODIGO = CPP_CODIGO;
        this.COMPRA = COMPRA;
        this.PRODUTO = PRODUTO;
        this.CPR_QTDE = CPR_QTDE;
        this.CPR_PRECO = CPR_PRECO;
        this.CPR_DESCONTO = CPR_DESCONTO;
        this.CPR_TOTAL = CPR_TOTAL;
    }

    public int getCPP_CODIGO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCPR_QTDE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getCPR_PRECO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getCPR_DESCONTO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getCPR_TOTAL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCPP_CODIGO(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCPR_PRECO(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCPR_QTDE(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCPR_DESCONTO(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCPR_TOTAL(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
