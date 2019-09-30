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
public class VendaPagtoModel {
    
    private int VDP_CODIGO;
    private VendaModel VENDA;
    private FormaPagtoModel FORMAPAGTO;
    private double VDP_VALOR;
    
    public VendaPagtoModel(){
        
    }
    
    public VendaPagtoModel(int VDP_CODIGO, VendaModel VENDA, FormaPagtoModel FORMAPAGTO, double VDP_VALOR){
        this.VDP_CODIGO = VDP_CODIGO;
        this.VENDA = VENDA;
        this.FORMAPAGTO = FORMAPAGTO;
        this.VDP_VALOR = VDP_VALOR;
    }

    public int getVDP_CODIGO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getVDP_VALOR() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVDP_CODIGO(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVDP_VALOR(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
