/*
 * https://github.com/GuilhermeO18/Trabalho01.git
 * https://github.com/GuilhermeO18
 * guilherme.oliveirag18@gmail.com
 */
package view;

import Interface.Cliente;
import Interface.Compra;
import Interface.FormaPagto;
import Interface.Fornecedor;
import Interface.Usuario;
import Interface.Venda;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author unip
 */
public class Menu extends JFrame{
    
    private JMenuBar bar;
    private JMenu menuCadastro, menuMovimentos;
    private JMenuItem mitemCliente, mitemFornecedor, mitemFormapagto, mitemUsuario, mitemVenda, mitemCompra, mitemSair;
    
    public Menu(){ 
        setLayout(null);
        setPreferredSize(new Dimension(600,600));
        instanciar();
        posicionar();
        adicionar();
        eventos();
        setVisible(true);
        pack();
    }
    
    public void instanciar()
    {
        bar = new JMenuBar();
        menuCadastro = new JMenu("Cadastro");
        menuMovimentos = new JMenu("Movimentos");
        menuCadastro = new JMenu("Cadastro");
        mitemSair = new JMenuItem("Sair");
        mitemCliente = new JMenuItem("Cliente");
        mitemFornecedor = new JMenuItem("Fornecedor");
        mitemFormapagto = new JMenuItem("Forma de Pagamento");
        mitemUsuario = new JMenuItem("Usuário");
        mitemVenda = new JMenuItem("Venda");
        mitemCompra = new JMenuItem("Compra");
    }   
    
    public void posicionar()
    {
        menuCadastro.setMnemonic('C');
        menuMovimentos.setMnemonic('M');
        
        setJMenuBar(bar);
    }
    
    public void adicionar()
    {
        bar.add(menuCadastro);
        bar.add(menuMovimentos);
        bar.add(mitemSair);
        menuCadastro.add(mitemCliente);
        menuCadastro.add(mitemFornecedor);
        menuCadastro.add(mitemFormapagto);
        menuCadastro.add(mitemUsuario);
        menuMovimentos.add(mitemCompra);
        menuMovimentos.add(mitemVenda);
    }
    
    public void eventos()
    {
        mitemCliente.addActionListener
        (
            new ActionListener(){
              public void actionPerformed(ActionEvent event)
              {
                  Cliente cliente = new Cliente();
              }
            }
        );
        
        mitemUsuario.addActionListener
        (
            new ActionListener(){
              public void actionPerformed(ActionEvent event)
              {
                  Usuario usuario = new Usuario();
              }
            }
        );
        
        mitemFormapagto.addActionListener
        (
            new ActionListener(){
              public void actionPerformed(ActionEvent event)
              {
                  FormaPagto formapagto = new FormaPagto();
              }
            }
        );
        
        mitemFornecedor.addActionListener
        (
            new ActionListener(){
              public void actionPerformed(ActionEvent event)
              {
                  Fornecedor fornecedor = new Fornecedor();
              }
            }
        );
        
        mitemVenda.addActionListener
        (
            new ActionListener(){
              public void actionPerformed(ActionEvent event)
              {
                  Venda venda = new Venda();
              }
            }
        );
        
        mitemCompra.addActionListener
        (
            new ActionListener(){
              public void actionPerformed(ActionEvent event)
              {
                  Compra compra = new Compra();
              }
            }
        );
        
        mitemSair.addActionListener
        (
            new ActionListener(){
              public void actionPerformed(ActionEvent event)
              {
                  System.exit(0);
              }
            }
        );
        
    }
}
