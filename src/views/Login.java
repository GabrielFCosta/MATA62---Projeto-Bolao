package views;

/**
 * @author Gabriel
 *
 */

import javax.swing.*;

import controller.ControlPessoa;

import java.awt.Point;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 725831069521037854L;
	private JTextField usuario;
	private JTextField senha;
	private ButtonGroup grupo;
	private JRadioButton administrador;
	private JRadioButton apostador;
	private static TelaAdministrador admin = null;
	private static TelaApostador apost = null;

	public Login(){
		setLocation(new Point(340, 220));
		setSize(250,200);
		setResizable(false);
		setTitle("Login de Usuário");
		getContentPane().setLayout(null);
		
		JLabel label_3 = new JLabel("Usuário:");
		label_3.setBounds(32, 11, 60, 14);
		getContentPane().add(label_3);

		usuario = new JTextField();
		usuario.setColumns(10);
		usuario.setBounds(90, 8, 120, 20);
		getContentPane().add(usuario);
		
		JLabel label_4 = new JLabel("Senha:");
		label_4.setBounds(32, 36, 46, 14);
		getContentPane().add(label_4);

		senha = new JTextField();
		senha.setColumns(10);
		senha.setBounds(90, 36, 120, 20);
		getContentPane().add(senha);
		
		administrador = new JRadioButton("Administrador");
		administrador.setBounds(32, 63, 120, 23);
		apostador = new JRadioButton("Apostador");
		apostador.setBounds(32, 89, 105, 23);
		grupo = new ButtonGroup();
		grupo.add(administrador);
		grupo.add(apostador);
		getContentPane().add(administrador);
		getContentPane().add(apostador);
		
		JButton btnCadastrar = new JButton("Login");
		btnCadastrar.setBounds(90, 119, 99, 23);
		getContentPane().add(btnCadastrar);
		btnCadastrar.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String us = usuario.getText().trim();
		String sn = senha.getText().trim();
		boolean adm = false;
		if(us.length() > 0&& sn.length() > 0){
			if(administrador.isSelected() || apostador.isSelected() ) {
				if(administrador.isSelected()) adm = true;
				ControlPessoa control = new ControlPessoa();
				control.carregaPessoas();
				if(control.checkPessoa(us,sn,adm)) {
					 if(adm == true){
						 try{
							 admin.dispose();
						}catch(NullPointerException a){
						}finally{
							admin = new TelaAdministrador(us);
						}
					 }
					 else {
						 try{
							 apost.dispose();
						}catch(NullPointerException a){
						}finally{
							apost = new TelaApostador(us);
						}
					 }
				}
				else JOptionPane.showMessageDialog(null,"Pessoa não encontrada.");
				usuario.setText("");
	        	senha.setText("");
			}
		}
	}
}
