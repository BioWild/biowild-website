package ISO2FT.G02A.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.Query;

import com.mysql.cj.api.jdbc.Statement;

import ISO2FT.G02A.Model.Manager;
import ISO2FT.G02A.Model.Owner;
import ISO2FT.G02A.Model.Vehicle;

public class OwnerDao extends GeneralDao<Owner> {
	public OwnerDao() {
		super();
	}
	
	public Owner findByDni(String dni) throws SQLException {
		Owner owner = null;
		Manager man = Manager.get();
		Statement stmt=(Statement) man.conn.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM `sanctionholder` WHERE `dni` = '" + dni + "'");
		if(rs.next()) {
			owner = new Owner(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
		}
		man.conn.close();
        return owner;
	}
	
	public Owner findByLicense(String license) throws SQLException {
		Owner owner = null;
		Manager man = Manager.get();
		Statement stmt=(Statement) man.conn.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT owner_id FROM `vehicle` WHERE `license` = '" + license + "'");
		if(rs.next()) {
			ResultSet rs1=stmt.executeQuery("SELECT * FROM `sanctionholder` WHERE `id` = '" + rs.getInt(0) + "'");
			owner = new Owner(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
		}
		man.conn.close();
        return owner;
	}
}
