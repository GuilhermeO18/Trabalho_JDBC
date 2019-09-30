/*
 * https://github.com/GuilhermeO18/Trabalho01.git
 * https://github.com/GuilhermeO18
 * guilherme.oliveirag18@gmail.com
 */
package Interface;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Cliente extends JFrame implements ActionListener {
    
  
    private JLabel lblFundo, lblNome, lblAtivo, lblFisica, lblFantasia, lblCPF, lblRG, lblEndereco, lblNumero, lblComplemento, lblBairro, lblCidade, lblUF, lblCEP, lblFone1, lblFone2, lblCelular, lblSite, lblEmail, lblLimite;
    private JPanel pnlCliente;
    private JTextField txtNome, txtFisica, txtFantasia, txtCPF, txtRG, txtEndereco, txtNumero, txtComplemento, txtBairro, txtCidade, txtUF, txtCEP, txtFone1, txtFone2, txtCelular, txtSite, txtEmail, txtLimite;
    private JButton btnInserir, btnExcluir, btnAlterar;
    private TitledBorder title;
    
    public Cliente(){
        setTitle("Gerenciamento de Compra de Venda");
        setPreferredSize(new Dimension(800, 600));
        setLayout(null);
        instanciar();
        posicionar();
        adicionar();
        tratar();
        setVisible(true);
        setResizable(false);
        pack();
    }
    
    
    public void instanciar(){
        lblFundo = new JLabel();
        lblNome = new JLabel("Nome");
        lblFisica = new JLabel("Pessoa Física");
        lblFantasia = new JLabel("Nome Fantasia");
        lblAtivo = new JLabel("Ativo");
        lblCPF = new JLabel("CPF/CNPJ");
        lblRG = new JLabel("RG");
        lblEndereco = new JLabel("Endereço");
        lblNumero = new JLabel("Numero");
        lblComplemento = new JLabel("Complemento");
        lblBairro = new JLabel("Bairro");
        lblCidade = new JLabel("Cidade");
        lblUF = new JLabel("UF");
        lblCEP = new JLabel("CEP");
        lblFone1 = new JLabel("Fone 1");
        lblFone2 = new JLabel("Fone 2");
        lblCelular = new JLabel("Celular");
        lblSite = new JLabel("Site");
        lblEmail = new JLabel("Email");
        lblLimite = new JLabel("Limite");
        pnlCliente = new JPanel();
            title = BorderFactory.createTitledBorder("Cliente");
            pnlCliente.setBorder(title);
            title.setTitleJustification(TitledBorder.LEFT);
        txtNome = new JTextField();
        txtFisica = new JTextField();
        txtFantasia = new JTextField();
        txtCPF = new JTextField();
        txtRG = new JTextField();
        txtEndereco = new JTextField();
        txtNumero = new JTextField();
        txtComplemento = new JTextField();
        txtBairro = new JTextField();
        txtCidade = new JTextField();
        txtUF = new JTextField();
        txtCEP = new JTextField();
        txtFone1 = new JTextField();
        txtFone2 = new JTextField();
        txtCelular = new JTextField();
        txtSite = new JTextField();
        txtEmail = new JTextField();
        txtLimite = new JTextField();
        btnInserir = new JButton("Inserir");
        btnExcluir = new JButton("Excluir");
        btnAlterar = new JButton("Alterar");
    }
 
    public void posicionar(){
        lblFundo.setBounds(0, 0, 600, 700);
        pnlCliente.setBounds(0, 25, 800, 400);
        lblNome.setBounds(40, 35, 80, 25);
        lblFisica.setBounds(40, 70, 80, 25);
        lblFantasia.setBounds(40, 105, 100, 25);
        lblCPF.setBounds(40,140,80,25);
        lblEndereco.setBounds(40,175,80,25);
        lblNumero.setBounds(40,210,80,25);
        lblComplemento.setBounds(40,245,80,25);
        lblBairro.setBounds(40,280,80,25);
        lblCidade.setBounds(40,315,80,25);
        lblUF.setBounds(350,35,80,25);
        lblCEP.setBounds(350,70,80,25);
        lblFone1.setBounds(350,105,80,25);
        lblFone2.setBounds(350,140,80,25);
        lblCelular.setBounds(350,175,80,25);
        lblSite.setBounds(350,210,80,25);
        lblEmail.setBounds(350,245,80,25);
        lblAtivo.setBounds(350,280,80,25);
        lblLimite.setBounds(350,315, 80, 25);
        txtNome.setBounds(150, 35, 80, 25);
        txtFisica.setBounds(150, 70, 80, 25);
        txtFantasia.setBounds(150, 105, 100, 25);
        txtCPF.setBounds(150,140,80,25);
        txtEndereco.setBounds(150,175,80,25);
        txtNumero.setBounds(150,210,80,25);
        txtComplemento.setBounds(150,245,80,25);
        txtBairro.setBounds(150,280,80,25);
        txtCidade.setBounds(150,315,80,25);
        txtUF.setBounds(440,35,80,25);
        txtCEP.setBounds(440,70,80,25);
        txtFone1.setBounds(440,105,80,25);
        txtFone2.setBounds(440,140,80,25);
        txtCelular.setBounds(440,175,80,25);
        txtSite.setBounds(440,210,80,25);
        txtEmail.setBounds(440,245,80,25);
        txtLimite.setBounds(440,315,80,25);
        btnInserir.setBounds(100, 370, 100, 25);
        btnExcluir.setBounds(300, 370, 100, 25);
        btnAlterar.setBounds(500, 370, 100, 25);
        
    }
    
    public void adicionar(){
        add(pnlCliente);
        add(lblFundo);
        pnlCliente.setVisible(true);
        pnlCliente.setLayout(null);
        pnlCliente.add(lblNome);
        pnlCliente.add(lblFisica);
        pnlCliente.add(lblFantasia);
        pnlCliente.add(lblCPF);
        pnlCliente.add(lblRG);
        pnlCliente.add(lblEndereco);
        pnlCliente.add(lblNumero);
        pnlCliente.add(lblComplemento);
        pnlCliente.add(lblBairro);
        pnlCliente.add(lblCidade);
        pnlCliente.add(lblUF);
        pnlCliente.add(lblCEP);
        pnlCliente.add(lblFone1);
        pnlCliente.add(lblFone2);
        pnlCliente.add(lblCelular);
        pnlCliente.add(lblSite);
        pnlCliente.add(lblEmail);
        pnlCliente.add(lblAtivo);
        pnlCliente.add(lblLimite);
        pnlCliente.add(txtNome);
        pnlCliente.add(txtFisica);
        pnlCliente.add(txtFantasia);
        pnlCliente.add(txtCPF);
        pnlCliente.add(txtRG);
        pnlCliente.add(txtEndereco);
        pnlCliente.add(txtNumero);
        pnlCliente.add(txtComplemento);
        pnlCliente.add(txtBairro);
        pnlCliente.add(txtCidade);
        pnlCliente.add(txtUF);
        pnlCliente.add(txtCEP);
        pnlCliente.add(txtFone1);
        pnlCliente.add(txtFone2);
        pnlCliente.add(txtCelular);
        pnlCliente.add(txtSite);
        pnlCliente.add(txtEmail);
        pnlCliente.add(txtLimite);
        pnlCliente.add(btnInserir);
        pnlCliente.add(btnExcluir);
        pnlCliente.add(btnAlterar);
    }
    
    public void tratar(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent action) {
        if(action.getSource()== btnInserir){
            
        }
        
        if(action.getSource()== btnExcluir){
            
        }
        
        if(action.getSource()== btnAlterar){
            
        }
        
    }
    
}
