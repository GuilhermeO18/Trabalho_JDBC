/*
 * https://github.com/GuilhermeO18/Trabalho01.git
 * https://github.com/GuilhermeO18
 * guilherme.oliveirag18@gmail.com
 */
package model;

import java.sql.Date;

/**
 *
 * @author paulinho
 */
public class VendaModel {
    
    private int VDA_CODIGO;
    private UsuarioModel USUARIO;
    private ClienteModel CLIENTE;
    private Date VDA_DATA;
    private double VDA_VALOR;
    private double VDA_DESCONTO;
    private double VDA_TOTAL;
    private String VDA_OBS;
    
    public VendaModel(){
        
    }
    
    public VendaModel(int VDA_CODIGO, UsuarioModel USUARIO, ClienteModel CLIENTE, Date VDA_DATA, double VDA_VALOR, double VDA_DESCONTO, double VDA_TOTAL, String VDA_OBS){
        this.VDA_CODIGO = VDA_CODIGO;
        this.USUARIO = USUARIO;
        this.CLIENTE = CLIENTE;
        this.VDA_DATA = VDA_DATA;
        this.VDA_VALOR = VDA_VALOR;
        this.VDA_DESCONTO = VDA_DESCONTO;
        this.VDA_TOTAL = VDA_TOTAL;
        this.VDA_OBS = VDA_OBS;
        
    }

    public int getVDA_CODIGO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Date getVDA_DATA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getVDA_VALOR() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getVDA_DESCONTO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getVDA_TOTAL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getVDA_OBS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVDA_CODIGO(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVDA_DATA(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVDA_DESCONTO(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVDA_VALOR(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVDA_OBS(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVDA_TOTAL(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
