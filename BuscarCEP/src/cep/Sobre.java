package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sobre dialog = new Sobre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Buscar CEP - Ver 1.0");
			lblNewLabel.setBounds(45, 32, 132, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("@Author Leonardo Rodrigues Fontes");
			lblNewLabel_1.setBounds(45, 72, 273, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("WEB Service:");
			lblNewLabel_2.setBounds(45, 126, 97, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			JLabel lblWebService = new JLabel("republicavirtual.com.br");
			lblWebService.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					link("https://www.republicavirtual.com.br/");
				}
			});
			lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblWebService.setForeground(SystemColor.textHighlight);
			lblWebService.setBounds(152, 126, 166, 14);
			getContentPane().add(lblWebService);
		}
		{
			JButton btnYoutube = new JButton("");
			btnYoutube.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					link("https://www.youtube.com/watch?v=sKO2C58yf28&list=PLbEOwbQR9lqxVuDWNIrG57_JGcbIL3FWP&index=5");
				}
			});
			btnYoutube.setToolTipText("Youtube");
			btnYoutube.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnYoutube.setBorder(null);
			btnYoutube.setBackground(SystemColor.control);
			btnYoutube.setIcon(new ImageIcon(Sobre.class.getResource("/img/youtube.png")));
			btnYoutube.setBounds(41, 179, 48, 48);
			getContentPane().add(btnYoutube);
		}
		{
			JButton btnGithub = new JButton("");
			btnGithub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					link("https://github.com/leofontesrodrigues/busca-endereco-cep");
				}
			});
			btnGithub.setBorder(null);
			btnGithub.setBackground(SystemColor.control);
			btnGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
			btnGithub.setToolTipText("Github");
			btnGithub.setBounds(115, 179, 48, 48);
			getContentPane().add(btnGithub);
		} 
	}// fim do cunstrutor
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
