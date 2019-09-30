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
public class ClienteModel {
    
    private int CLI_CODIGO;
    private PessoaModel PESSOA;
    private float CLI_LIMITECRED;
    
    public ClienteModel(){
        
    }
    
    public ClienteModel(int CLI_CODIGO, PessoaModel PESSOA, float CLI_LIMITECRED){
        this.CLI_CODIGO = CLI_CODIGO;
        this.PESSOA = PESSOA;
        this.CLI_LIMITECRED = CLI_LIMITECRED;
    }

    public double getCLI_LIMITECRED() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCLI_CODIGO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCLI_CODIGO(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCLI_LIMITECRED(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
