package ISO2FT.G02A.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.Query;

import com.mysql.cj.api.jdbc.Statement;

import ISO2FT.G02A.Model.Manager;
import ISO2FT.G02A.Model.Vehicle;
import ISO2FT.G02A.Model.Owner;

public class VehicleDao {
	public VehicleDao() {
		super();
	}
	
	public Vehicle findByLicense(String license) throws SQLException {
		Manager man = Manager.get();
		Vehicle vehicle = null;
		Statement stmt=(Statement) man.conn.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM `vehicle` WHERE `license` = '" + license + "'");
		if(rs.next()) {
			vehicle = new Vehicle(license);
			OwnerDao od = new OwnerDao();
			vehicle.setOwner(od.findByLicense(license));
		}
        return vehicle;
	}
	
	public void updateOwner(String license, String dni) throws SQLException {
		Manager man = Manager.get();
		Statement stmt=(Statement) man.conn.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT id FROM `sanctionholder` WHERE `dni` = '"+ dni +"'");
		rs.next();
		ResultSet rs1=stmt.executeQuery("UPDATE `vehicle` SET `owner_id` = '" + rs.getRow() + "' WHERE `license` = '" + license + "'");
		man.conn.commit();
	}
}
