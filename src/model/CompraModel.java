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
public class CompraModel {

    public int getCPR_CODIGO() {
        return CPR_CODIGO;
    }

    public void setCPR_CODIGO(int CPR_CODIGO) {
        this.CPR_CODIGO = CPR_CODIGO;
    }

    public UsuarioModel getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(UsuarioModel USUARIO) {
        this.USUARIO = USUARIO;
    }

    public FornecedorModel getFORNECEDOR() {
        return FORNECEDOR;
    }

    public void setFORNECEDOR(FornecedorModel FORNECEDOR) {
        this.FORNECEDOR = FORNECEDOR;
    }

    public Date getCPR_EMISSAO() {
        return CPR_EMISSAO;
    }

    public void setCPR_EMISSAO(Date CPR_EMISSAO) {
        this.CPR_EMISSAO = CPR_EMISSAO;
    }

    public double getCPR_VALOR() {
        return CPR_VALOR;
    }

    public void setCPR_VALOR(double CPR_VALOR) {
        this.CPR_VALOR = CPR_VALOR;
    }

    public double getCPR_DESCONTO() {
        return CPR_DESCONTO;
    }

    public void setCPR_DESCONTO(double CPR_DESCONTO) {
        this.CPR_DESCONTO = CPR_DESCONTO;
    }

    public double getCPR_TOTAL() {
        return CPR_TOTAL;
    }

    public void setCPR_TOTAL(double CPR_TOTAL) {
        this.CPR_TOTAL = CPR_TOTAL;
    }

    public Date getCPR_DTENTRADA() {
        return CPR_DTENTRADA;
    }

    public void setCPR_DTENTRADA(Date CPR_DTENTRADA) {
        this.CPR_DTENTRADA = CPR_DTENTRADA;
    }

    public String getCPR_OBS() {
        return CPR_OBS;
    }

    public void setCPR_OBS(String CPR_OBS) {
        this.CPR_OBS = CPR_OBS;
    }
    
    private int CPR_CODIGO;
    private UsuarioModel USUARIO;
    private FornecedorModel FORNECEDOR;
    private Date CPR_EMISSAO;
    private double CPR_VALOR;
    private double CPR_DESCONTO;
    private double CPR_TOTAL;
    private Date CPR_DTENTRADA;
    private String CPR_OBS;
    
    public CompraModel(){
        
    }
    
    public CompraModel(int CPR_CODIGO, UsuarioModel USUARIO, FornecedorModel FORNECEDOR, Date CPR_EMISSAO, double CPR_VALOR, double CPR_DESCONTO, double CPR_TOTAL, Date CPR_DTENTRADA, String CPR_OBS){
        this.CPR_CODIGO = CPR_CODIGO;
        this.USUARIO = USUARIO;
        this.FORNECEDOR = FORNECEDOR;
        this.CPR_EMISSAO = CPR_EMISSAO;
        this.CPR_VALOR = CPR_VALOR;
        this.CPR_DESCONTO = CPR_DESCONTO;
        this.CPR_TOTAL = CPR_TOTAL;
        this.CPR_DTENTRADA = CPR_DTENTRADA;
        this.CPR_OBS = CPR_OBS;
    }
}
