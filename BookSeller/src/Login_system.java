import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javafx.beans.property.StringProperty;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.management.MBeanServerConnection;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.jar.Attributes.Name;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class Login_system extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_system frame = new Login_system();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login_system() {
		setTitle("ADVISERR");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login_system.class.getResource("/img/icons8-school-director-filled-100.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 391);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 261, 352);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login_system.class.getResource("/img/icons8-school-director-filled-100.png")));
		lblNewLabel_1.setBounds(73, 54, 120, 165);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ADVISERR");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setBackground(SystemColor.textHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblNewLabel_2.setBounds(73, 216, 120, 52);
		panel.add(lblNewLabel_2);
		
		txtUser = new JTextField();
		txtUser.setBounds(408, 94, 145, 31);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel Lusername = new JLabel("USERNAME");
		Lusername.setFont(new Font("Tahoma", Font.BOLD, 13));
		Lusername.setBounds(285, 97, 90, 23);
		contentPane.add(Lusername);
		
		JLabel Lpassword = new JLabel("PASSWORD");
		Lpassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		Lpassword.setBounds(285, 155, 90, 14);
		contentPane.add(Lpassword);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent arg0) {
				
		
				
		Connection con= databaseConnection.getConnection();
				
				
				PreparedStatement ps;
				try {
					
					
					ps=con.prepareStatement("select * from Instractor where userName =?  and password = ?");
					ps.setString(1, txtUser.getText());
					ps.setString(2, String.valueOf(txtPass.getPassword()));
					
					ResultSet rs=ps.executeQuery();
					if (rs.next()) {
					dispose();
					home hm = new home ();
					hm.setVisible(true);
					} else {
                     
						JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Warning", JOptionPane.WARNING_MESSAGE);
					}
					
					
				} catch (SQLException ex) {
		          System.out.println("Wrong SQL Command");
					
				}
				
				
			}

		});
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(new Color(75, 0, 130));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(355, 233, 129, 42);
		contentPane.add(btnNewButton);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(408, 155, 145, 31);
		contentPane.add(txtPass);
		
		JLabel lb1 = new JLabel("*");
		lb1.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		lb1.setForeground(new Color(255, 0, 0));
		lb1.setBounds(563, 102, 34, 14);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel("*");
		lb2.setForeground(Color.RED);
		lb2.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		lb2.setBounds(563, 163, 34, 14);
		contentPane.add(lb2);
	}
}
