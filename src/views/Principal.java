/**
 * 
 */
package views;

/**
 * @author Gabriel
 *
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.Point;

public class Principal extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7654214285228222968L;
	private static JButton  btnCadastro = new JButton("Cadastro");
	private static JButton btnLogin = new JButton("Login");
	private static CadastrarPessoa cadpessoa = null;
	private static Login login = null;
	
	
	/**
	 * 
	 */
	public Principal() {
		setLocation(new Point(10, 10));
		getContentPane().setLayout(null);
		
		this.setSize(320,240);
        this.setResizable(false);
        this.setTitle("MATA62 - BOLÃO");
	
		btnCadastro.setBounds(10, 11, 89, 23);
		getContentPane().add(btnCadastro);
		btnCadastro.addActionListener(this);
		
		btnLogin.setBounds(109, 11, 89, 23);
		getContentPane().add(btnLogin);
		btnLogin.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Principal();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		 if(e.getSource() == btnCadastro){
			 try{
				 cadpessoa.dispose();
			}catch(NullPointerException a){
			}finally{
				cadpessoa = new CadastrarPessoa();
			}
		 }
		 
		 if(e.getSource() == btnLogin){
			 try{
				 login.dispose();
			}catch(NullPointerException a){
			}finally{
				login = new Login();
			}
		 }
	}
}
