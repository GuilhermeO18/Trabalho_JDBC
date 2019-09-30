/*
 * https://github.com/GuilhermeO18/Trabalho01.git
 * https://github.com/GuilhermeO18
 * guilherme.oliveirag18@gmail.com
 */
package model;

/**
 *
 * @author unip
 */
public class FornecedorModel {

    public int getFOR_CODIGO() {
        return FOR_CODIGO;
    }

    public void setFOR_CODIGO(int FOR_CODIGO) {
        this.FOR_CODIGO = FOR_CODIGO;
    }

    public PessoaModel getPESSOA() {
        return PESSOA;
    }

    public void setPESSOA(PessoaModel PESSOA) {
        this.PESSOA = PESSOA;
    }

    public String getFOR_CONTATO() {
        return FOR_CONTATO;
    }

    public void setFOR_CONTATO(String FOR_CONTATO) {
        this.FOR_CONTATO = FOR_CONTATO;
    }
    private int FOR_CODIGO;
    private PessoaModel PESSOA;
    private String FOR_CONTATO;
    
    public FornecedorModel(){}
    
    public FornecedorModel(int FOR_CODIGO, PessoaModel PESSOA, String FOR_CONTATO){
        this.FOR_CODIGO = FOR_CODIGO;
        this.PESSOA = PESSOA;
        this.FOR_CONTATO = FOR_CONTATO;
    }
}
