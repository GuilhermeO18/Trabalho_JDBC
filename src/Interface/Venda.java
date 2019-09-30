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
public class Venda extends JFrame implements ActionListener{
    
    private JLabel lblFundo, lblValor, lblDesconto, lblTotal, lblObs, lblNome, lblLogin, lblProduto, lblPag;
    private JPanel pnlVenda;
    private JTextField txtValor, txtDesconto, txtTotal, txtObs, txtNome, txtLogin, txtProduto, txtPag;
    private JButton btnInserir, btnExcluir, btnAlterar;
    private TitledBorder title;
    
    public Venda(){
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
        lblNome = new JLabel("Cliente");
        lblLogin = new JLabel("Login Usuario");
        lblProduto = new JLabel("Produto");
        lblPag = new JLabel("Forma Pagamento");
        txtValor = new JTextField();
        txtDesconto = new JTextField();
        txtTotal = new JTextField();
        txtObs = new JTextField();
        txtNome = new JTextField();
        txtLogin = new JTextField();
        txtProduto = new JTextField();
        txtPag = new JTextField();
        pnlVenda = new JPanel();
            title = BorderFactory.createTitledBorder("Venda");
            pnlVenda.setBorder(title);
            title.setTitleJustification(TitledBorder.LEFT);
        btnInserir = new JButton("Inserir");
        btnExcluir = new JButton("Excluir");
        btnAlterar = new JButton("Alterar");
    }
    
    public void posicionar(){
        lblFundo.setBounds(0, 0, 600, 700);
        pnlVenda.setBounds(0, 25, 800, 400);
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
        add(pnlVenda);
        add(lblFundo);
        pnlVenda.setVisible(true);
        pnlVenda.setLayout(null);
        pnlVenda.add(lblValor);
        pnlVenda.add(lblDesconto);
        pnlVenda.add(lblTotal);
        pnlVenda.add(lblObs);
        pnlVenda.add(lblNome);
        pnlVenda.add(lblLogin);
        pnlVenda.add(txtValor);
        pnlVenda.add(txtDesconto);
        pnlVenda.add(txtTotal);
        pnlVenda.add(txtObs);
        pnlVenda.add(txtNome);
        pnlVenda.add(txtLogin);
        pnlVenda.add(btnInserir);
        pnlVenda.add(btnAlterar);
        pnlVenda.add(btnExcluir);
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
