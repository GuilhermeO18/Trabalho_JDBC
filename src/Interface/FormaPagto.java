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
public class FormaPagto extends JFrame implements ActionListener {
    
    private JLabel lblFundo, lblNome, lblAtivo;
    private JPanel pnlUsuario;
    private JTextField txtNome;
    private JButton btnInserir, btnExcluir, btnAlterar;
    private TitledBorder title;
    
    public FormaPagto(){
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
        lblAtivo = new JLabel("Ativo");
        pnlUsuario = new JPanel();
            title = BorderFactory.createTitledBorder("Forma de Pagamento");
            pnlUsuario.setBorder(title);
            title.setTitleJustification(TitledBorder.LEFT);
        txtNome = new JTextField();
        btnInserir = new JButton("Inserir");
        btnExcluir = new JButton("Excluir");
        btnAlterar = new JButton("Alterar");
    }
 
    public void posicionar(){
        lblFundo.setBounds(0, 0, 600, 700);
        pnlUsuario.setBounds(0, 25, 800, 400);
        lblNome.setBounds(65, 120, 80, 25);
        lblAtivo.setBounds(65, 210, 80, 25);
        txtNome.setBounds(150, 120, 185, 25);
        btnInserir.setBounds(100, 370, 100, 25);
        btnExcluir.setBounds(300, 370, 100, 25);
        btnAlterar.setBounds(500, 370, 100, 25);
    }
    
    public void adicionar(){
        add(pnlUsuario);
        add(lblFundo);
        pnlUsuario.setVisible(true);
        pnlUsuario.setLayout(null);
        pnlUsuario.add(lblNome);
        pnlUsuario.add(lblAtivo);
        pnlUsuario.add(txtNome);
        pnlUsuario.add(btnInserir);
        pnlUsuario.add(btnExcluir);
        pnlUsuario.add(btnAlterar);
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
