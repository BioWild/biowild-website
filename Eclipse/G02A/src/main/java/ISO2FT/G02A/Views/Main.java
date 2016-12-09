package ISO2FT.G02A.Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;

import ISO2FT.G02A.Controller.VehicleDao;
import ISO2FT.G02A.Model.Manager;
import ISO2FT.G02A.Model.Vehicle;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField tab3_license;
	private JTextField tab3_newOwner;
	private JTextField tab2_inquiry_id;
	private JTextField tab2_sanctionholder;
	private JTextField tab1_sanction_id;
	private JTextField tab1_amount;
	private JTextField tab1_date_of;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField tab3_currentOwner;
	private JTextField tab3_name;
	private JTextField tab3_lastname;
	private JTextField tab3_address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 732, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		tabbedPane.setBounds(12, 12, 706, 351);
		tabbedPane.addTab("Create sanction", null, panel1,
                "Create a sanction over a  inquiry");
		panel1.setLayout(null);
		
		tab1_sanction_id = new JTextField();
		tab1_sanction_id.setBounds(112, 22, 139, 19);
		panel1.add(tab1_sanction_id);
		tab1_sanction_id.setColumns(10);
		
		tab1_amount = new JTextField();
		tab1_amount.setBounds(619, 118, 70, 19);
		panel1.add(tab1_amount);
		tab1_amount.setColumns(10);
		
		JLabel lblInquiryId_1 = new JLabel("Inquiry ID");
		lblInquiryId_1.setBounds(24, 24, 70, 15);
		panel1.add(lblInquiryId_1);
		
		JLabel lblAmount = new JLabel("Amount (EUR)");
		lblAmount.setBounds(519, 120, 104, 15);
		panel1.add(lblAmount);
		
		JButton btnCreateSanction = new JButton("Create sanction");
		btnCreateSanction.setBounds(280, 175, 172, 54);
		panel1.add(btnCreateSanction);
		
		tab1_date_of = new JTextField();
		tab1_date_of.setEditable(false);
		tab1_date_of.setBounds(112, 69, 139, 19);
		panel1.add(tab1_date_of);
		tab1_date_of.setColumns(10);
		
		JLabel lblDateOfIssue = new JLabel("Date of Issue");
		lblDateOfIssue.setBounds(0, 71, 94, 15);
		panel1.add(lblDateOfIssue);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(354, 69, 335, 19);
		panel1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(74, 118, 114, 19);
		panel1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(268, 118, 39, 19);
		panel1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(388, 118, 29, 19);
		panel1.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnCheckInquiryInfo = new JButton("Check inquiry info");
		btnCheckInquiryInfo.setBounds(280, 19, 172, 25);
		panel1.add(btnCheckInquiryInfo);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(280, 71, 70, 15);
		panel1.add(lblLocation);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(24, 120, 29, 15);
		panel1.add(lblDni);
		
		JLabel lblMaxSp = new JLabel("Max SP");
		lblMaxSp.setBounds(206, 120, 70, 15);
		panel1.add(lblMaxSp);
		
		JLabel lblSpeed = new JLabel("Speed");
		lblSpeed.setBounds(325, 120, 45, 15);
		panel1.add(lblSpeed);
		
		JLabel lblPoints = new JLabel("Points");
		lblPoints.setBounds(430, 120, 45, 15);
		panel1.add(lblPoints);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(480, 118, 29, 19);
		panel1.add(textField_6);
		textField_6.setColumns(10);
		tabbedPane.addTab("Pay sanction", null, panel2,
                "Pay a sanction, it register the user if necesary");
		panel2.setLayout(null);
		
		tab2_inquiry_id = new JTextField();
		tab2_inquiry_id.setBounds(414, 77, 114, 19);
		panel2.add(tab2_inquiry_id);
		tab2_inquiry_id.setColumns(10);
		
		tab2_sanctionholder = new JTextField();
		tab2_sanctionholder.setBounds(414, 129, 114, 19);
		panel2.add(tab2_sanctionholder);
		tab2_sanctionholder.setColumns(10);
		
		JLabel lblInquiryId = new JLabel("Inquiry ID");
		lblInquiryId.setBounds(294, 79, 70, 15);
		panel2.add(lblInquiryId);
		
		JLabel lblSanctionHolderdni = new JLabel("Sanction Holder (DNI)");
		lblSanctionHolderdni.setBounds(213, 131, 151, 15);
		panel2.add(lblSanctionHolderdni);
		
		JButton btnPaySanction = new JButton("Pay sanction");
		btnPaySanction.setBounds(294, 221, 177, 52);
		panel2.add(btnPaySanction);
		tabbedPane.addTab("Change vehicle's owner", null, panel3,
                "Change the owner from one person to other");
		tabbedPane.addTab("Add/Check person", null, panel4,
                "Check if a person exists and can create new people.");
		panel3.setLayout(null);
		
		tab3_license = new JTextField();
		tab3_license.setBounds(253, 51, 114, 19);
		panel3.add(tab3_license);
		tab3_license.setColumns(10);
		
		tab3_newOwner = new JTextField();
		tab3_newOwner.setBounds(253, 196, 178, 19);
		panel3.add(tab3_newOwner);
		tab3_newOwner.setColumns(10);
		
		JLabel lblLicensePlate = new JLabel("License plate");
		lblLicensePlate.setBounds(98, 52, 95, 17);
		panel3.add(lblLicensePlate);
		
		JLabel lblNewOwner = new JLabel("New owner (DNI)");
		lblNewOwner.setBounds(88, 198, 118, 15);
		panel3.add(lblNewOwner);
		
		JButton btnConfirmChange = new JButton("Confirm change");
		btnConfirmChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VehicleDao vd = new VehicleDao();
				try {
					vd.updateOwner(tab3_license.getText(), tab3_newOwner.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnConfirmChange.setBounds(253, 242, 196, 47);
		panel3.add(btnConfirmChange);
		
		JButton btnCheckLicensePlate = new JButton("Check license plate data");
		btnCheckLicensePlate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VehicleDao vd = new VehicleDao();
				try {
					Vehicle veh1 = vd.findByLicense(tab3_license.getText());
					tab3_currentOwner.setText(veh1.getOwner().getDni());
					tab3_name.setText(veh1.getOwner().getName());
					tab3_lastname.setText(veh1.getOwner().getLastName());
					tab3_address.setText(veh1.getOwner().getFullAddress());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCheckLicensePlate.setBounds(414, 48, 217, 25);
		panel3.add(btnCheckLicensePlate);
		
		tab3_currentOwner = new JTextField();
		tab3_currentOwner.setEditable(false);
		tab3_currentOwner.setBounds(253, 84, 114, 19);
		panel3.add(tab3_currentOwner);
		tab3_currentOwner.setColumns(10);
		
		JLabel lblCurrentOwner = new JLabel("Current Owner");
		lblCurrentOwner.setBounds(88, 86, 105, 15);
		panel3.add(lblCurrentOwner);
		
		tab3_name = new JTextField();
		tab3_name.setEditable(false);
		tab3_name.setBounds(136, 127, 160, 19);
		panel3.add(tab3_name);
		tab3_name.setColumns(10);
		
		tab3_lastname = new JTextField();
		tab3_lastname.setEditable(false);
		tab3_lastname.setBounds(414, 127, 179, 19);
		panel3.add(tab3_lastname);
		tab3_lastname.setColumns(10);
		
		tab3_address = new JTextField();
		tab3_address.setEditable(false);
		tab3_address.setBounds(136, 158, 457, 19);
		panel3.add(tab3_address);
		tab3_address.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(50, 160, 58, 15);
		panel3.add(lblAddress);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(68, 129, 40, 15);
		panel3.add(lblName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setBounds(314, 129, 82, 15);
		panel3.add(lblLastName);
		panel.add(tabbedPane);
	}
}
