import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class homePage extends JFrame {

	private JPanel contentPane;
	private JTextField txtCC;
	private JTextField txtJava;
	private JTextField txtC;
	private JTextField txtDB;
	private JTextField txtOS;
	private JTextField txtPython;
	private JTextField txtHw;
	private JTextField txtIOS;
	private JTextField txtCCC;
	private JTextField txtJP;
	private JTextField txtPHP;
	private JTextField txtCCLEAN;
	private JTextField txtOC;
	private JTextField txtAlgorithm;
	private JTextField txtSQL;
	private JTextField txtRUBY;
	private JTextField txtAPT;
	private JTextField txtJS;
	private JTextField txtHTML;
	private JTextField txtANDROID;
	private JTextField txtTEXT;
	private JTextField txtSUBTOTAL;
	private JTextField txtTOTAL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homePage frame = new homePage();
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
	public homePage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(homePage.class.getResource("/img/images.jpg")));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				txtJava.setEnabled(false);
				txtC.setEnabled(false);
				txtCC.setEnabled(false);
				txtPython.setEnabled(false);
				txtOS.setEnabled(false);
				txtHw.setEnabled(false);
				txtIOS.setEnabled(false);
				txtDB.setEnabled(false);
				txtCCC.setEnabled(false);
				txtJP.setEnabled(false);
				txtCCLEAN.setEnabled(false);
				txtOC.setEnabled(false);
				txtAlgorithm.setEnabled(false);
				txtSQL.setEnabled(false);
				txtPHP.setEnabled(false);
				txtAPT.setEnabled(false);
				txtJS.setEnabled(false);
				txtHTML.setEnabled(false);
				txtANDROID.setEnabled(false);
				txtRUBY.setEnabled(false);
				
				txtTEXT.setEnabled(false);
				txtSUBTOTAL.setEnabled(false);
				txtTOTAL.setEnabled(false);
				
				
				
				
				
			}
		});
		setTitle("BOOKSELLER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1370, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 3, 3, 3));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(SystemColor.textHighlight, 3));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(10, 2, 2, 2));
		
		JButton btnNewButton_1 = new JButton("JAVA BOOK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				clicJAVA.setEnabled(true);
				
				
			}
		});
		btnNewButton_1.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		btnNewButton_1.setForeground(SystemColor.desktop);
		btnNewButton_1.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CODE COMPLETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clikCLEAN.setEnabled(true);
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("C PROGRAMING");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clicC.setEnabled(true);
			}
		});
		btnNewButton_3.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("OBJECTIVE-C");
		btnNewButton_4.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("C++ BOOK");
		btnNewButton_5.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("ALGORITHM");
		btnNewButton_6.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_10 = new JButton("PYTHON");
		btnNewButton_10.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_7 = new JButton("SQL");
		btnNewButton_7.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("OPERATING SYSTEM");
		btnNewButton_8.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("PHP");
		btnNewButton_9.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_9);
		
		JButton btnNewButton = new JButton("HARDWARE");
		btnNewButton.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton);
		
		JButton btnNewButton_12 = new JButton("APT");
		btnNewButton_12.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton("IOS\\SWIFT");
		btnNewButton_11.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_14 = new JButton("JAVASCRIPT");
		btnNewButton_14.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("DATABASE");
		btnNewButton_13.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_16 = new JButton("HTML\\CSS");
		btnNewButton_16.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_16);
		
		JButton btnNewButton_18 = new JButton("C#");
		btnNewButton_18.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_18);
		
		JButton btnNewButton_15 = new JButton("ANDROID");
		btnNewButton_15.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_17 = new JButton("JAVA PROJECTS");
		btnNewButton_17.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_17);
		
		JButton btnNewButton_19 = new JButton("RUBY");
		btnNewButton_19.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel.add(btnNewButton_19);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBorder(new LineBorder(SystemColor.textHighlight, 3));
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 4, 1, 1));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, -25, 35));
		
		JCheckBox clicJAVA = new JCheckBox("JAVA BOOK");
		clicJAVA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                  if (clicJAVA.isSelected()) {
					
					txtJava.setEnabled(true);
					txtJava.setText("");
					txtJava.requestFocus();
				} else {
					txtJava.setEnabled(false);
					txtJava.setText("0");

				}
				
				
			}
			});
		clicJAVA.setEnabled(false);
		clicJAVA.setForeground(SystemColor.windowText);
		clicJAVA.setBackground(Color.WHITE);
		clicJAVA.setFont(new Font("Gotham Bold", Font.BOLD, 14));
		panel_3.add(clicJAVA);
		
		JCheckBox clikC = new JCheckBox("C PROGRAMING");
		clikC.setBackground(Color.WHITE);
		clikC.setEnabled(false);
		clikC.setText("C PROGRAMMIG");
		clikC.setHorizontalAlignment(SwingConstants.CENTER);
		clikC.setFont(new Font("Gotham Bold", Font.BOLD, 14));
		panel_3.add(clikC);
		
		JCheckBox clikCC = new JCheckBox("C++ BOOK");
		clikCC.setBackground(Color.WHITE);
		clikCC.setEnabled(false);
		clikCC.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_3.add(clikCC);
		
		JCheckBox clikPython = new JCheckBox("PYTHON");
		clikPython.setBackground(Color.WHITE);
		clikPython.setEnabled(false);
		clikPython.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_3.add(clikPython);
		
		JCheckBox clikOS = new JCheckBox("OPERATING SYSTEM");
		clikOS.setEnabled(false);
		clikOS.setText("OS");
		clikOS.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_3.add(clikOS);
		
		JCheckBox clikHw = new JCheckBox("HARDWARE");
		clikHw.setEnabled(false);
		clikHw.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_3.add(clikHw);
		
		JCheckBox clikIOS = new JCheckBox("IOS\\SWIFT");
		clikIOS.setEnabled(false);
		clikIOS.setText("IOS");
		clikIOS.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_3.add(clikIOS);
		
		JCheckBox clikDB = new JCheckBox("DATABASE");
		clikDB.setEnabled(false);
		clikDB.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_3.add(clikDB);
		
		JCheckBox clikCCC = new JCheckBox("C#");
		clikCCC.setEnabled(false);
		clikCCC.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_3.add(clikCCC);
		
		JCheckBox clikJP = new JCheckBox("JAVA PROJECTS");
		clikJP.setEnabled(false);
		clikJP.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_3.add(clikJP);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 35));
		
		txtJava = new JTextField();
		txtJava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		txtJava.setText("0");
		txtJava.setHorizontalAlignment(SwingConstants.CENTER);
		txtJava.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		txtJava.setColumns(10);
		panel_4.add(txtJava);
		
		txtC = new JTextField();
		txtC.setText("0");
		txtC.setHorizontalAlignment(SwingConstants.CENTER);
		txtC.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		txtC.setColumns(10);
		panel_4.add(txtC);
		
		txtCC = new JTextField();
		txtCC.setText("0");
		txtCC.setHorizontalAlignment(SwingConstants.CENTER);
		txtCC.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_4.add(txtCC);
		txtCC.setColumns(10);
		
		txtPython = new JTextField();
		txtPython.setText("0");
		txtPython.setHorizontalAlignment(SwingConstants.CENTER);
		txtPython.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_4.add(txtPython);
		txtPython.setColumns(10);
		
		txtOS = new JTextField();
		txtOS.setText("0");
		txtOS.setHorizontalAlignment(SwingConstants.CENTER);
		txtOS.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_4.add(txtOS);
		txtOS.setColumns(10);
		
		txtHw = new JTextField();
		txtHw.setText("0");
		txtHw.setHorizontalAlignment(SwingConstants.CENTER);
		txtHw.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_4.add(txtHw);
		txtHw.setColumns(10);
		
		txtIOS = new JTextField();
		txtIOS.setText("0");
		txtIOS.setHorizontalAlignment(SwingConstants.CENTER);
		txtIOS.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_4.add(txtIOS);
		txtIOS.setColumns(10);
		
		txtDB = new JTextField();
		txtDB.setText("0");
		txtDB.setToolTipText("");
		txtDB.setHorizontalAlignment(SwingConstants.CENTER);
		txtDB.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_4.add(txtDB);
		txtDB.setColumns(10);
		
		txtCCC = new JTextField();
		txtCCC.setText("0");
		txtCCC.setHorizontalAlignment(SwingConstants.CENTER);
		txtCCC.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_4.add(txtCCC);
		txtCCC.setColumns(10);
		
		txtJP = new JTextField();
		txtJP.setText("0");
		txtJP.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(txtJP);
		txtJP.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		txtJP.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.BLACK);
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 35));
		
		JCheckBox clikCCLEAN = new JCheckBox("CODE COMPLETE");
		clikCCLEAN.setEnabled(false);
		clikCCLEAN.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_5.add(clikCCLEAN);
		
		JCheckBox clikOC = new JCheckBox("OBJECTIVE-C");
		clikOC.setEnabled(false);
		clikOC.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_5.add(clikOC);
		
		JCheckBox clikAlgorithm = new JCheckBox("ALGORITHM");
		clikAlgorithm.setEnabled(false);
		clikAlgorithm.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_5.add(clikAlgorithm);
		
		JCheckBox clikSQL = new JCheckBox("SQL");
		clikSQL.setEnabled(false);
		clikSQL.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_5.add(clikSQL);
		
		JCheckBox clikPHP = new JCheckBox("PHP");
		clikPHP.setEnabled(false);
		clikPHP.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_5.add(clikPHP);
		
		JCheckBox clikAPT = new JCheckBox("APT");
		clikAPT.setEnabled(false);
		clikAPT.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_5.add(clikAPT);
		
		JCheckBox clikJS = new JCheckBox("JAVASCRIPT");
		clikJS.setEnabled(false);
		clikJS.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_5.add(clikJS);
		
		JCheckBox clikHTML = new JCheckBox("HTML\\CSS");
		clikHTML.setEnabled(false);
		clikHTML.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_5.add(clikHTML);
		
		JCheckBox clikANDROID = new JCheckBox("ANDROID");
		clikANDROID.setEnabled(false);
		clikANDROID.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_5.add(clikANDROID);
		
		JCheckBox clikRUBY = new JCheckBox("RUBY");
		clikRUBY.setEnabled(false);
		clikRUBY.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		panel_5.add(clikRUBY);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLACK);
		panel_1.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, -25, 35));
		
		txtCCLEAN = new JTextField();
		txtCCLEAN.setText("0");
		txtCCLEAN.setHorizontalAlignment(SwingConstants.CENTER);
		txtCCLEAN.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_6.add(txtCCLEAN);
		txtCCLEAN.setColumns(10);
		
		txtOC = new JTextField();
		txtOC.setText("0");
		txtOC.setHorizontalAlignment(SwingConstants.CENTER);
		txtOC.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_6.add(txtOC);
		txtOC.setColumns(10);
		
		txtAlgorithm = new JTextField();
		txtAlgorithm.setText("0");
		txtAlgorithm.setHorizontalAlignment(SwingConstants.CENTER);
		txtAlgorithm.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_6.add(txtAlgorithm);
		txtAlgorithm.setColumns(10);
		
		txtSQL = new JTextField();
		txtSQL.setText("0");
		txtSQL.setHorizontalAlignment(SwingConstants.CENTER);
		txtSQL.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_6.add(txtSQL);
		txtSQL.setColumns(10);
		
		txtPHP = new JTextField();
		txtPHP.setText("0");
		txtPHP.setHorizontalAlignment(SwingConstants.CENTER);
		txtPHP.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_6.add(txtPHP);
		txtPHP.setColumns(10);
		
		txtAPT = new JTextField();
		txtAPT.setText("0");
		txtAPT.setHorizontalAlignment(SwingConstants.CENTER);
		txtAPT.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_6.add(txtAPT);
		txtAPT.setColumns(10);
		
		txtJS = new JTextField();
		txtJS.setText("0");
		txtJS.setHorizontalAlignment(SwingConstants.CENTER);
		txtJS.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_6.add(txtJS);
		txtJS.setColumns(10);
		
		txtHTML = new JTextField();
		txtHTML.setText("0");
		txtHTML.setHorizontalAlignment(SwingConstants.CENTER);
		txtHTML.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_6.add(txtHTML);
		txtHTML.setColumns(10);
		
		txtANDROID = new JTextField();
		txtANDROID.setText("0");
		txtANDROID.setHorizontalAlignment(SwingConstants.CENTER);
		txtANDROID.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_6.add(txtANDROID);
		txtANDROID.setColumns(10);
		
		txtRUBY = new JTextField();
		txtRUBY.setText("0");
		txtRUBY.setHorizontalAlignment(SwingConstants.CENTER);
		txtRUBY.setFont(new Font("Gotham Bold", Font.BOLD, 11));
		panel_6.add(txtRUBY);
		txtRUBY.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setBackground(Color.BLACK);
		panel_2.setBorder(new LineBorder(SystemColor.textHighlight, 3));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEX");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Gotham Bold", Font.BOLD, 18));
		lblNewLabel.setBounds(27, 41, 78, 39);
		panel_2.add(lblNewLabel);
		
		txtTEXT = new JTextField();
		txtTEXT.setHorizontalAlignment(SwingConstants.CENTER);
		txtTEXT.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		txtTEXT.setText("0");
		txtTEXT.setBounds(152, 42, 172, 39);
		panel_2.add(txtTEXT);
		txtTEXT.setColumns(10);
		
		txtSUBTOTAL = new JTextField();
		txtSUBTOTAL.setHorizontalAlignment(SwingConstants.CENTER);
		txtSUBTOTAL.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		txtSUBTOTAL.setText("0");
		txtSUBTOTAL.setColumns(10);
		txtSUBTOTAL.setBounds(152, 107, 172, 39);
		panel_2.add(txtSUBTOTAL);
		
		JLabel lblSubtotal = new JLabel("SUBTOTAL");
		lblSubtotal.setForeground(Color.WHITE);
		lblSubtotal.setFont(new Font("Gotham Bold", Font.BOLD, 18));
		lblSubtotal.setBounds(27, 107, 115, 39);
		panel_2.add(lblSubtotal);
		
		txtTOTAL = new JTextField();
		txtTOTAL.setHorizontalAlignment(SwingConstants.CENTER);
		txtTOTAL.setFont(new Font("Gotham Bold", Font.BOLD, 15));
		txtTOTAL.setText("0");
		txtTOTAL.setColumns(10);
		txtTOTAL.setBounds(152, 171, 172, 39);
		panel_2.add(txtTOTAL);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Gotham Bold", Font.BOLD, 18));
		lblTotal.setBounds(27, 171, 94, 39);
		panel_2.add(lblTotal);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(27, 221, 396, 351);
		panel_2.add(textArea);
		
		JButton btnNewButton_20 = new JButton("TOTAL");
		btnNewButton_20.setFont(new Font("Gotham Bold", Font.BOLD, 18));
		btnNewButton_20.setBounds(27, 601, 115, 39);
		panel_2.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("RESET");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtJava.setText("0");
				txtC.setText("0");
				txtCC.setText("0");
				txtPython.setText("0");
				txtOS.setText("0");
				txtHw.setText("0");
				txtIOS.setText("0");
				txtDB.setText("0");
				txtCCC.setText("0");
				txtJP.setText("0");
				txtCCLEAN.setText("0");
				txtOC.setText("0");
				txtAlgorithm.setText("0");
				txtSQL.setText("0");
				txtPHP.setText("0");
				txtAPT.setText("0");
				txtJS.setText("0");
				txtHTML.setText("0");
				
				txtANDROID.setText("0");
				txtRUBY.setText("0");
				txtTEXT.setText("0");
				txtSUBTOTAL.setText("0");
				txtTOTAL.setText("0");
				
				txtJava.setEnabled(false);
				txtC.setEnabled(false);
				txtCC.setEnabled(false);
				txtPython.setEnabled(false);
				txtOS.setEnabled(false);
				txtHw.setEnabled(false);
				txtIOS.setEnabled(false);
				txtDB.setEnabled(false);
				txtCCC.setEnabled(false);
				txtJP.setEnabled(false);
				txtCCLEAN.setEnabled(false);
				txtOC.setEnabled(false);
				txtAlgorithm.setEnabled(false);
				txtSQL.setEnabled(false);
				txtPHP.setEnabled(false);
				txtAPT.setEnabled(false);
				txtJS.setEnabled(false);
				txtHTML.setEnabled(false);
				txtANDROID.setEnabled(false);
				txtRUBY.setEnabled(false);

				txtTEXT.setEnabled(false);
				txtSUBTOTAL.setEnabled(false);
				txtTOTAL.setEnabled(false);
				
				
				
				clicJAVA.setSelected(false);
			
				clikC.setSelected(false);
				clikCC.setSelected(false);
				clikPython.setSelected(false);
				clikOS.setSelected(false);
				clikHw.setSelected(false);
				clikIOS.setSelected(false);
				clikDB.setSelected(false);
				clikCCC.setSelected(false);
				clikJP.setSelected(false);
				clikCCLEAN.setSelected(false);
				clikOC.setSelected(false);
				clikAlgorithm.setSelected(false);
				clikSQL.setSelected(false);
				clikPHP.setSelected(false);
				clikAPT.setSelected(false);
				clikJS.setSelected(false);
				clikHTML.setSelected(false);
				
				clikANDROID.setSelected(false);
				clikRUBY.setSelected(false); 
				
				
				
				
				
			}
		});
		btnNewButton_21.setFont(new Font("Gotham Bold", Font.BOLD, 18));
		btnNewButton_21.setBounds(173, 601, 115, 39);
		panel_2.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("EXIT");
		btnNewButton_22.setFont(new Font("Gotham Bold", Font.BOLD, 18));
		btnNewButton_22.setBounds(316, 601, 94, 39);
		panel_2.add(btnNewButton_22);
	}
}
