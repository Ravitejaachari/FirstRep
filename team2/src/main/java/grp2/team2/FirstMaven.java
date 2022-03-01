package grp2.team2;

import java.sql.*;
import java.util.*;

public class FirstMaven {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Ravi@580761");
		System.out.println("connected");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		String snm=sc.next();
		String cou=sc.next();
		
		PreparedStatement st=conn.prepareStatement("insert into student values(?,?,?)");
		st.setInt(1, no);
		st.setString(2, snm);
		st.setString(3, cou);
		
		st.executeUpdate();
		
		ResultSet rs=st.executeQuery("select * from student");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t");
			System.out.println(rs.getString(2)+"\t");
			System.out.println(rs.getString(3)+"\t");
		}
		

	}

}
