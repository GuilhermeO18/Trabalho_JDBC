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
public class Compra extends JFrame implements ActionListener{
    
    private JLabel lblFundo, lblValor, lblDesconto, lblTotal, lblObs, lblNome, lblLogin;
    private JPanel pnlCompra;
    private JTextField txtValor, txtDesconto, txtTotal, txtObs, txtNome, txtLogin;
    private JButton btnInserir, btnExcluir, btnAlterar;
    private TitledBorder title;
    
    public Compra(){
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
        lblValor = new JLabel("Valor");
        lblDesconto = new JLabel("Desconto");
        lblTotal = new JLabel("Total");
        lblObs = new JLabel("Obs.");
        lblNome = new JLabel("Fornecedor");
        lblLogin = new JLabel("Login Usuario");
        txtValor = new JTextField();
        txtDesconto = new JTextField();
        txtTotal = new JTextField();
        txtObs = new JTextField();
        txtNome = new JTextField();
        txtLogin = new JTextField();
        pnlCompra = new JPanel();
            title = BorderFactory.createTitledBorder("Compra");
            pnlCompra.setBorder(title);
            title.setTitleJustification(TitledBorder.LEFT);
        btnInserir = new JButton("Inserir");
        btnExcluir = new JButton("Excluir");
        btnAlterar = new JButton("Alterar");   
    }
    
    public void posicionar(){
        lblFundo.setBounds(0, 0, 600, 700);
        pnlCompra.setBounds(0, 25, 800, 400);
        lblValor.setBounds(40, 35, 80, 25);
        lblDesconto.setBounds(40, 70, 80, 25);
        lblTotal.setBounds(40, 105, 80, 25);
        lblObs.setBounds(40, 140, 80, 25);
        lblNome.setBounds(40, 175, 80, 25);
        lblLogin.setBounds(40, 205, 80, 25);
        txtValor.setBounds(150, 35, 80, 25);
        txtDesconto.setBounds(150, 70, 80, 25);
        txtTotal.setBounds(150, 105, 80, 25);
        txtObs.setBounds(150, 140, 80, 25);
        txtNome.setBounds(150, 175, 80, 25);
        txtLogin.setBounds(150, 205, 80, 25);
        btnInserir.setBounds(100, 370, 100, 25);
        btnExcluir.setBounds(300, 370, 100, 25);
        btnAlterar.setBounds(500, 370, 100, 25);
    }
    
    public void adicionar(){
        add(pnlCompra);
        add(lblFundo);
        pnlCompra.setVisible(true);
        pnlCompra.setLayout(null);
        pnlCompra.add(lblValor);
        pnlCompra.add(lblDesconto);
        pnlCompra.add(lblTotal);
        pnlCompra.add(lblObs);
        pnlCompra.add(lblNome);
        pnlCompra.add(lblLogin);
        pnlCompra.add(txtValor);
        pnlCompra.add(txtDesconto);
        pnlCompra.add(txtTotal);
        pnlCompra.add(txtObs);
        pnlCompra.add(txtNome);
        pnlCompra.add(txtLogin);
        pnlCompra.add(btnInserir);
        pnlCompra.add(btnAlterar);
        pnlCompra.add(btnExcluir);
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
