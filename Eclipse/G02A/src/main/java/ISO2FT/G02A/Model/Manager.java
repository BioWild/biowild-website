package ISO2FT.G02A.Model;

import ISO2FT.G02A.Controller.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * This class is the access point to the business logic.
 * @author macario.polo
 *  
 */
public class Manager {
	public static Connection conn = null;
	
	private Manager(String user, String pass) {
    	Properties properties = new Properties();
    	properties.setProperty("user", user);
    	properties.setProperty("password", pass);
    	properties.setProperty("useSSL", "false");
    	try {
    		conn = DriverManager.getConnection("jdbc:mysql://devgarrido.com/multas", properties);
    		System.out.println("It works!");
    	} catch (SQLException ex) {
    	    // handle any errors
    	    System.out.println("SQLException: " + ex.getMessage());
    	    System.out.println("SQLState: " + ex.getSQLState());
    	    System.out.println("VendorError: " + ex.getErrorCode());
    	}
	}
	
	public static class ManagerHolder {
		public static Manager manager=new Manager("juan", "juang");
	}
	
	public static Manager get() {
		return ManagerHolder.manager;
	}
	/*
	public int openInquiry(String license, double speed, String location, double maxSpeed) {
		Inquiry inquiry=new Inquiry(license, speed, location, maxSpeed);
		GeneralDao<Inquiry> dao=new GeneralDao<>();
		dao.insert(inquiry);
		return inquiry.getId();
	}
	
	public Sanction identifyDriver(int idInquiry, String dni) {
		GeneralDao<Inquiry> dao=new GeneralDao<>();
		Inquiry inquiry=dao.findById(Inquiry.class, idInquiry);
		Sanction sanction=inquiry.createSanctionFor(dni);
		return sanction;
	}
	
	public void pay(int idSanction) {
		GeneralDao<Sanction> dao=new GeneralDao<>();
		Sanction sanction=dao.findById(Sanction.class, idSanction);
		sanction.pay();
		dao.update(sanction);
	}
	

	public void changeOwner(String license, String newDni) {
		VehicleDao daoVehicle=new VehicleDao();
		Vehicle vehicle=daoVehicle.findByLicense(license);
		OwnerDao daoOwner=new OwnerDao();
		Owner owner=daoOwner.findByDni(newDni);
		vehicle.setOwner(owner);
		daoVehicle.update(vehicle);
	}*/
}
