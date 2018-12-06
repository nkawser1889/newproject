import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

public class student {
public void insertDeleteUpdate(char operation ,Integer stid,String fnn,String lnn,String emaill,String addresss,String cc_id, Integer ddept,String ss_id ) throws SQLException {
	
	Connection connection=databaseConnection.getConnection();
	PreparedStatement ps;
	if (operation == 'i' ) {
		try {
			ps=connection.prepareStatement("insert into Student(sdt_id,sdt_fname,sdt_lname,email,address,c_id,dept_id,s_id)values (?,?,?,?,?,?,?,?)");
			ps.setInt(1, stid);
			ps.setString(2, fnn);
			ps.setString(3, lnn);
			
			ps.setString(4, emaill);
			ps.setString(5, addresss);
			ps.setString(6, cc_id);
			ps.setInt(7, ddept);
			ps.setString(8, ss_id);
			
			
			
			
			
			
			
			if(ps.executeUpdate()>0) {
				JOptionPane.showMessageDialog(null, "New Student Record added");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}

    public void fillStudentTable(JTable table, String valueTOsearch ) throws SQLException {
	Connection connection=databaseConnection.getConnection();
	PreparedStatement ps;
	ps=connection.prepareStatement("select sdt_id,sdt_fname,s_name,c_name from Student ,Section,Course where Student.s_id=Section.s_id and Student.c_id=Course.c_id");
	ps.setString(1, "%"+valueTOsearch+"%");
	ResultSet rs=ps.executeQuery();
	
	
	DefaultTableModel model =(DefaultTableModel)table.getModel();
	Object [] row;
	while (rs.next()) {
		row =new Object [4];
		row[0]=rs.getInt(1);
		row[1]=rs.getString(2);
		row[2]=rs.getString(3);
		row[3]=rs.getString(4);
		model.addRow(row);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


}


