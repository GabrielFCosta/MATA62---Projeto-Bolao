package views;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class TelaApostador extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4585495272321920476L;

	public TelaApostador(String usuario) {
		setLocation(new Point(600, 220));
		getContentPane().setLayout(null);
		
		this.setSize(320,240);
        this.setResizable(false);
        this.setTitle("Apostador: "+usuario);
	
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
