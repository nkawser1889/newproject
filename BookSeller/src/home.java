

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.naming.directory.SearchControls;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(home.class.getResource("/img/icons8-school-director-filled-100.png")));
		setTitle("ADVISERR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 504);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 849, 469);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(0, 0, 908, 104);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("University Advising System");
		lblNewLabel_3.setFont(new Font("Gotham Bold", Font.BOLD, 30));
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setBounds(228, 29, 423, 64);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				panel_2.setBackground(Color.lightGray);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2.setBackground(SystemColor.text);
			}
		});
		panel_2.setBackground(SystemColor.text);
		panel_2.setBounds(142, 128, 90, 104);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(home.class.getResource("/img/icons8-dog-house-filled-50.png")));
		lblNewLabel.setBounds(20, 11, 50, 55);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Home");
		lblNewLabel_1.setFont(new Font("Gotham Pro Light", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setBounds(30, 71, 40, 22);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_3.setBackground(Color.lightGray);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_3.setBackground(SystemColor.text);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				addBook addBook =new addBook();
				addBook.setVisible(true);
			}
		});
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(298, 128, 90, 104);
		panel.add(panel_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(home.class.getResource("/img/icons8-delete-user-male-filled-50 (1).png")));
		label.setBounds(20, 11, 60, 56);
		panel_3.add(label);
		
		JLabel lblAddBook = new JLabel("Add Student ");
		lblAddBook.setForeground(SystemColor.textHighlight);
		lblAddBook.setFont(new Font("Gotham Pro Light", Font.PLAIN, 11));
		lblAddBook.setBounds(10, 71, 80, 22);
		panel_3.add(lblAddBook);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_4.setBackground(Color.lightGray);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_4.setBackground(SystemColor.text);
			}
			public void mousePressed(MouseEvent e) {
				Update update =new Update();
				update.setVisible(true);
			}
		});
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(455, 128, 90, 104);
		panel.add(panel_4);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(home.class.getResource("/img/icons8-update-filled-50.png")));
		label_1.setBounds(20, 11, 60, 56);
		panel_4.add(label_1);
		
		JLabel lblSellBook = new JLabel(" Update ");
		lblSellBook.setForeground(SystemColor.textHighlight);
		lblSellBook.setFont(new Font("Gotham Pro Light", Font.PLAIN, 11));
		lblSellBook.setBounds(20, 71, 51, 22);
		panel_4.add(lblSellBook);
		
		JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_5.setBackground(Color.lightGray);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_5.setBackground(SystemColor.text);
			}
			
		});
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(605, 255, 73, 104);
		panel.add(panel_5);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(home.class.getResource("/img/icons8-shutdown-48.png")));
		label_2.setBounds(10, 11, 48, 56);
		panel_5.add(label_2);
		
		JLabel lblExit = new JLabel(" Exit");
		lblExit.setForeground(SystemColor.textHighlight);
		lblExit.setFont(new Font("Gotham Pro Light", Font.PLAIN, 11));
		lblExit.setBounds(20, 72, 38, 21);
		panel_5.add(lblExit);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.textHighlight);
		panel_6.setBounds(0, 400, 908, 69);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Version 1.0");
		lblNewLabel_2.setFont(new Font("Gotham Bold", Font.BOLD, 14));
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setBounds(407, 11, 87, 47);
		panel_6.add(lblNewLabel_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_7.setBackground(Color.lightGray);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_7.setBackground(SystemColor.text);
			}
			public void mousePressed(MouseEvent e) {
				Delete delete =new Delete();
				delete.setVisible(true);
			}
		});
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(592, 128, 103, 104);
		panel.add(panel_7);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(home.class.getResource("/img/icons8-delete-user-male-filled-50.png")));
		label_3.setBounds(20, 11, 60, 56);
		panel_7.add(label_3);
		
		JLabel lblDeleteStudent = new JLabel("Delete Student ");
		lblDeleteStudent.setForeground(SystemColor.textHighlight);
		lblDeleteStudent.setFont(new Font("Gotham Pro Light", Font.PLAIN, 11));
		lblDeleteStudent.setBounds(10, 71, 83, 22);
		panel_7.add(lblDeleteStudent);
		
		JPanel panel_8 = new JPanel();
		panel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_8.setBackground(Color.lightGray);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_8.setBackground(SystemColor.text);
			}
			public void mousePressed(MouseEvent e) {
				Section section =new Section();
				section.setVisible(true);
			}
		});
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(142, 255, 90, 104);
		panel.add(panel_8);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(home.class.getResource("/img/icons8-people-filled-50.png")));
		label_4.setBounds(20, 11, 60, 56);
		panel_8.add(label_4);
		
		JLabel lblSections = new JLabel("Sections ");
		lblSections.setForeground(SystemColor.textHighlight);
		lblSections.setFont(new Font("Gotham Pro Light", Font.PLAIN, 11));
		lblSections.setBounds(20, 71, 70, 22);
		panel_8.add(lblSections);
		
		JPanel panel_9 = new JPanel();
		panel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_9.setBackground(Color.lightGray);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_9.setBackground(SystemColor.text);
			}
			public void mousePressed(MouseEvent e) {
				Search sr =new Search();
				sr.setVisible(true);
			}
		});
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(298, 255, 90, 104);
		panel.add(panel_9);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(home.class.getResource("/img/icons8-search-filled-50.png")));
		label_5.setBounds(20, 11, 50, 56);
		panel_9.add(label_5);
		
		JLabel lblSearch = new JLabel("Search ");
		lblSearch.setForeground(SystemColor.textHighlight);
		lblSearch.setFont(new Font("Gotham Pro Light", Font.PLAIN, 11));
		lblSearch.setBounds(30, 71, 40, 22);
		panel_9.add(lblSearch);
		
		JPanel panel_10 = new JPanel();
		panel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_10.setBackground(Color.lightGray);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_10.setBackground(SystemColor.text);
			}
			public void mousePressed(MouseEvent e) {
				Course cr =new Course();
				cr.setVisible(true);
			}
		});
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(455, 255, 90, 104);
		panel.add(panel_10);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(home.class.getResource("/img/icons8-course-50.png")));
		label_6.setBounds(20, 11, 50, 56);
		panel_10.add(label_6);
		
		JLabel lblCourses = new JLabel(" Courses");
		lblCourses.setForeground(SystemColor.textHighlight);
		lblCourses.setFont(new Font("Gotham Pro Light", Font.PLAIN, 11));
		lblCourses.setBounds(20, 71, 60, 22);
		panel_10.add(lblCourses);
	}
}
