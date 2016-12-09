package ISO2FT.G02A.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.api.jdbc.Statement;

import ISO2FT.G02A.Model.Inquiry;
import ISO2FT.G02A.Model.Manager;

public class InquiryDao {
	public Inquiry findByID(String id) throws SQLException {
		Inquiry inquiry = null;
		Manager man = Manager.get();
		Statement stmt=(Statement) man.conn.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM `inquiry` WHERE `id` = "+ id +"");
		if (rs.next()){
			inquiry = new Inquiry("0001",rs.getDouble(5), rs.getString(3), rs.getDouble(4));
			OwnerDao od = new OwnerDao();
			inquiry.setOwner(od.findByID(Integer.parseInt(id)));
		}
		return inquiry;
	}
}
