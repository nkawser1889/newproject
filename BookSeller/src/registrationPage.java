import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class registrationPage {

	private JFrame frmAdviserr;
	private JTextField FullName;
	private JTextField Email;
	private JTextField Username;
	private JPasswordField passwordField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationPage window = new registrationPage();
					window.frmAdviserr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registrationPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdviserr = new JFrame();
		frmAdviserr.setIconImage(Toolkit.getDefaultToolkit().getImage(registrationPage.class.getResource("/img/icons8-school-director-filled-100.png")));
		frmAdviserr.setTitle("ADVISERR\r\n");
		frmAdviserr.getContentPane().setBackground(Color.WHITE);
		frmAdviserr.setBounds(100, 100, 450, 300);
		frmAdviserr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdviserr.getContentPane().setLayout(null);
		
		JLabel lblRegistration = new JLabel("Registration");
		lblRegistration.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRegistration.setBounds(169, 2, 165, 31);
		frmAdviserr.getContentPane().add(lblRegistration);
		
		FullName = new JTextField();
		FullName.setBounds(154, 44, 225, 31);
		frmAdviserr.getContentPane().add(FullName);
		FullName.setColumns(10);
		
		Email = new JTextField();
		Email.setBounds(154, 86, 225, 31);
		frmAdviserr.getContentPane().add(Email);
		Email.setColumns(10);
		
		Username = new JTextField();
		Username.setBounds(154, 128, 225, 31);
		frmAdviserr.getContentPane().add(Username);
		Username.setColumns(10);
		
		JButton Signup = new JButton("SignUp");
		Signup.setForeground(SystemColor.text);
		Signup.setBackground(SystemColor.textHighlight);
		Signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				
				
				try {
				customerINFO customerINFO=new customerINFO(FullName.getText(), Email.getText(), Username.getText(), passwordField.getText());
			
			
					JOptionPane.showMessageDialog(null, "Registration Successfully Completed", "Complete", JOptionPane.INFORMATION_MESSAGE);
					frmAdviserr.dispose();
				Login_system lg = new Login_system();
				lg.setVisible(true);
					
					
					
					
					
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Fill up the form correctly","Warning",JOptionPane.WARNING_MESSAGE);
				}
				
				
				
				
			}
		});
		Signup.setFont(new Font("Tahoma", Font.BOLD, 12));
		Signup.setBounds(203, 212, 116, 38);
		frmAdviserr.getContentPane().add(Signup);
		
		JLabel lblNewLabel = new JLabel("Full Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(58, 43, 86, 31);
		frmAdviserr.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(58, 88, 86, 25);
		frmAdviserr.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(58, 130, 86, 25);
		frmAdviserr.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(58, 178, 86, 16);
		frmAdviserr.getContentPane().add(lblNewLabel_3);
		
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(154, 170, 225, 31);
		frmAdviserr.getContentPane().add(passwordField);
	}
}
