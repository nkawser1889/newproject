import java.awt.EventQueue;
import java.lang.NullPointerException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.ListSelectionModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Component;

public class addBook extends JFrame {

	private JPanel contentPane;
	private JTextField sid;
	private JTextField fn;
	private JTextField ln;
	private JTextField dept;
	private JTextField course;
	private JTextField section;
	private JTextField address;
	private JTextField textField;
	private JTable table;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addBook frame = new addBook();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public addBook() throws SQLException {
		

		
		setTitle("ADVISERR");
			student sdt=new student();
		sdt.fillStudentTable(table, "");

		
		
		
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(addBook.class.getResource("/img/icons8-school-director-filled-100.png")));
		
	
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1095, 694);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 0, 1069, 644);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBookId = new JLabel("Student ID");
		lblBookId.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		lblBookId.setForeground(SystemColor.textHighlight);
		lblBookId.setBackground(SystemColor.text);
		lblBookId.setBounds(35, 114, 102, 28);
		panel.add(lblBookId);
		
		sid = new JTextField();
		sid.setBounds(198, 115, 225, 28);
		panel.add(sid);
		sid.setColumns(10);
		
		fn = new JTextField();
		fn.setColumns(10);
		fn.setBounds(198, 154, 225, 28);
		panel.add(fn);
		
		JLabel lblBookName = new JLabel("First Name");
		lblBookName.setForeground(SystemColor.textHighlight);
		lblBookName.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		lblBookName.setBackground(Color.WHITE);
		lblBookName.setBounds(35, 153, 102, 28);
		panel.add(lblBookName);
		
		JLabel lblWritterName = new JLabel("Last Name ");
		lblWritterName.setForeground(SystemColor.textHighlight);
		lblWritterName.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		lblWritterName.setBackground(Color.WHITE);
		lblWritterName.setBounds(35, 192, 120, 28);
		panel.add(lblWritterName);
		
		ln = new JTextField();
		ln.setColumns(10);
		ln.setBounds(198, 193, 225, 28);
		panel.add(ln);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_1.setBounds(0, 0, 506, 633);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(SystemColor.text);
		panel_2.setBackground(SystemColor.textHighlight);
		panel_2.setBounds(-9, 0, 610, 73);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Student");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Gotham Bold", Font.BOLD, 25));
		lblNewLabel.setBounds(195, 11, 191, 51);
		panel_2.add(lblNewLabel);
		
		JLabel lblDepartment = new JLabel("Department ID ");
		lblDepartment.setForeground(SystemColor.textHighlight);
		lblDepartment.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		lblDepartment.setBackground(Color.WHITE);
		lblDepartment.setBounds(40, 283, 146, 28);
		panel_1.add(lblDepartment);
		
		dept = new JTextField();
		dept.setColumns(10);
		dept.setBounds(197, 284, 225, 28);
		panel_1.add(dept);
		
		JLabel lblCourses = new JLabel("Course ID");
		lblCourses.setForeground(SystemColor.textHighlight);
		lblCourses.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		lblCourses.setBackground(Color.WHITE);
		lblCourses.setBounds(40, 339, 102, 28);
		panel_1.add(lblCourses);
		
		course = new JTextField();
		course.setColumns(10);
		course.setBounds(197, 340, 225, 28);
		panel_1.add(course);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(SystemColor.textHighlight);
		lblAddress.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		lblAddress.setBackground(Color.WHITE);
		lblAddress.setBounds(40, 450, 102, 28);
		panel_1.add(lblAddress);
		
		address = new JTextField();
		address.setFont(new Font("Tahoma", Font.PLAIN, 11));
		address.setToolTipText("");
		address.setColumns(10);
		address.setBounds(197, 450, 231, 79);
		panel_1.add(address);
		
		JLabel lblPhone = new JLabel("Section ");
		lblPhone.setForeground(SystemColor.textHighlight);
		lblPhone.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		lblPhone.setBackground(Color.WHITE);
		lblPhone.setBounds(40, 391, 102, 28);
		panel_1.add(lblPhone);
		
		section = new JTextField();
		section.setColumns(10);
		section.setBounds(197, 392, 225, 28);
		panel_1.add(section);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed() {
				
				
				Integer stid=Integer.valueOf(sid.getText());
				String fnn=fn.getText();
				String lnn=fn.getText();
				String emaill=fn.getText();
				String addresss=fn.getText();
				String cc_id =course.getText();
				Integer ddept=Integer.valueOf(dept.getText());
				String ss_id=section.getText();
			
				
				
			student student= new student();
		
			try {
				student.insertDeleteUpdate('i', stid, fnn, lnn, emaill, addresss, cc_id, ddept, ss_id);
				student sdt=new student();
				sdt.fillStudentTable(table, "");
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
				
				
				
				
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBounds(294, 578, 126, 44);
		panel_1.add(btnNewButton);
		
		JButton btnCancel = new JButton("Back ");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				home hm = new home();
			hm.setVisible(true);
			}
		});
		btnCancel.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(SystemColor.textHighlight);
		btnCancel.setBounds(40, 578, 126, 44);
		panel_1.add(btnCancel);
		
		JMenuItem mntmSwe = new JMenuItem("SWE");
		mntmSwe.setBounds(199, 283, 129, 22);
		panel_1.add(mntmSwe);
		
		JMenu mnDepartment = new JMenu("Department");
		mnDepartment.setBounds(196, 289, 107, 22);
		panel_1.add(mnDepartment);
		
		JMenuItem mntmSwe_1 = new JMenuItem("Swe");
		mnDepartment.add(mntmSwe_1);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(SystemColor.textHighlight);
		lblEmail.setFont(new Font("Gotham Bold", Font.BOLD, 16));
		lblEmail.setBounds(40, 239, 84, 33);
		panel_1.add(lblEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(198, 239, 224, 29);
		panel_1.add(textField);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Student ID", "New column", "New column", "New column"
			}
		));
		table.setBounds(536, 26, 498, 575);
		panel.add(table);
	}
}
