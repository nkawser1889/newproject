import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class Section extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Section frame = new Section();
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
	public Section() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setBounds(0, 0, 365, 511);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(0, 0, 365, 108);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sections");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Gotham Bold", Font.BOLD, 24));
		lblNewLabel.setBounds(133, 31, 112, 51);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Batch No ");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		lblNewLabel_1.setBounds(21, 129, 87, 27);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(118, 130, 188, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Section A");
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		btnNewButton.setBounds(83, 188, 223, 33);
		panel.add(btnNewButton);
		
		JButton btnSectionB = new JButton("Section B");
		btnSectionB.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		btnSectionB.setForeground(SystemColor.text);
		btnSectionB.setBackground(SystemColor.textHighlight);
		btnSectionB.setBounds(83, 232, 223, 33);
		panel.add(btnSectionB);
		
		JButton btnSectionC = new JButton("Section C");
		btnSectionC.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		btnSectionC.setForeground(SystemColor.text);
		btnSectionC.setBackground(SystemColor.textHighlight);
		btnSectionC.setBounds(83, 276, 223, 33);
		panel.add(btnSectionC);
		
		JButton btnSectionD = new JButton("Section D");
		btnSectionD.setForeground(SystemColor.text);
		btnSectionD.setBackground(SystemColor.textHighlight);
		btnSectionD.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		btnSectionD.setBounds(83, 320, 223, 33);
		panel.add(btnSectionD);
		
		JButton btnSectionE = new JButton("Section E");
		btnSectionE.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		btnSectionE.setBackground(SystemColor.textHighlight);
		btnSectionE.setForeground(SystemColor.text);
		btnSectionE.setBounds(83, 369, 223, 33);
		panel.add(btnSectionE);
		
		JButton btnSectionF = new JButton("Section F");
		btnSectionF.setBackground(SystemColor.textHighlight);
		btnSectionF.setForeground(SystemColor.text);
		btnSectionF.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		btnSectionF.setBounds(83, 413, 223, 33);
		panel.add(btnSectionF);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(364, 0, 539, 522);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(79, 113, 431, 304);
		panel_2.add(table);
	}

}
