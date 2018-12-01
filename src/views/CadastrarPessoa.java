package views;

/**
 * @author Gabriel
 *
 */

import javax.swing.*;

import controller.ControlPessoa;

import java.awt.Point;
import java.awt.event.*;

public class CadastrarPessoa extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 725831069521037854L;
	private JTextField nome;
	private JTextField cpf;
	private JTextField email;
	private JTextField telefone;
	private JTextField usuario;
	private JTextField senha;
	private ButtonGroup grupo;
	private JRadioButton administrador;
	private JRadioButton apostador;

	public CadastrarPessoa(){
		setLocation(new Point(340, 10));
		setSize(430,200);
		setResizable(false);
		setTitle("Cadastro de Usuário");
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(32, 14, 46, 14);
		getContentPane().add(lblNewLabel);
		
		nome = new JTextField();
		nome.setBounds(88, 11, 120, 20);
		nome.setColumns(10);
		getContentPane().add(nome);
		
		JLabel label = new JLabel("CPF:");
		label.setBounds(244, 14, 30, 14);
		getContentPane().add(label);

		cpf = new JTextField();
		cpf.setColumns(10);
		cpf.setBounds(293, 11, 120, 20);
		getContentPane().add(cpf);
		
		JLabel label_1 = new JLabel("Telefone:");
		label_1.setBounds(32, 39, 60, 14);
		getContentPane().add(label_1);

		telefone = new JTextField();
		telefone.setColumns(10);
		telefone.setBounds(88, 36, 120, 20);
		getContentPane().add(telefone);

		JLabel label_2 = new JLabel("E-mail:");
		label_2.setBounds(244, 39, 46, 14);
		getContentPane().add(label_2);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(293, 36, 120, 20);
		getContentPane().add(email);
		
		JLabel label_3 = new JLabel("Usuário:");
		label_3.setBounds(32, 64, 60, 14);
		getContentPane().add(label_3);

		usuario = new JTextField();
		usuario.setColumns(10);
		usuario.setBounds(88, 64, 120, 20);
		getContentPane().add(usuario);
		
		JLabel label_4 = new JLabel("Senha:");
		label_4.setBounds(244, 64, 46, 14);
		getContentPane().add(label_4);

		senha = new JTextField();
		senha.setColumns(10);
		senha.setBounds(293, 64, 120, 20);
		getContentPane().add(senha);
		
		administrador = new JRadioButton("Administrador");
		administrador.setBounds(32, 109, 120, 23);
		apostador = new JRadioButton("Apostador");
		apostador.setBounds(154, 109, 105, 23);
		grupo = new ButtonGroup();
		grupo.add(administrador);
		grupo.add(apostador);
		getContentPane().add(administrador);
		getContentPane().add(apostador);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(265, 109, 99, 23);
		getContentPane().add(btnCadastrar);
		btnCadastrar.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nm = nome.getText().trim();
		String cp = cpf.getText().trim();
		String tl = telefone.getText().trim();
		String em = email.getText().trim();
		String us = usuario.getText().trim();
		String sn = senha.getText().trim();
		boolean adm = false;
		if(nm.length() > 0 && cp.length() > 0 && tl.length() > 0 && em.length() > 0 && us.length() > 0&& sn.length() > 0){
			if(administrador.isSelected() || apostador.isSelected() ) {
				ControlPessoa control = new ControlPessoa();
				control.carregaPessoas();
				if(administrador.isSelected()) adm = true;
				if(control.cadPessoa(nm,cp,tl,em,us,sn,adm))
	                JOptionPane.showMessageDialog(null,"Cadastro realizado.");
	            else JOptionPane.showMessageDialog(null,"Cadastro não realizado.");
	            nome.setText("");
	        	cpf.setText("");
	        	telefone.setText("");
	        	email.setText("");
	        	usuario.setText("");
	        	senha.setText("");
	        	control.gravaPessoas();
			}
		}
	}

}
