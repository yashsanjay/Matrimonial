package khizr3.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Insert {

	public static boolean insertPersonToDB(person pr) {

		boolean f = false;
		try {
			Connection con = CP.createC();
			String q = "insert into person_data(p_name,gender,age,martial_status,birth_place, country,date_of_birth,height,complexion,M_T,religion,education,occupation,salary,phone_number) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";


			//PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);

			// set the value of parameter

			pstmt.setString(1, pr.getPersonName());
			pstmt.setString(2, pr.getGender());
			pstmt.setString(3, pr.getAge());
			pstmt.setString(4, pr.getMartial_Status());
			pstmt.setString(5, pr.getBirth_place());
			pstmt.setString(6, pr.getCountry());
			pstmt.setString(7, pr.getDate_of_birth());
			pstmt.setString(8, pr.getHeight());
			pstmt.setString(9, pr.getComplexion());
			pstmt.setString(10, pr.getMother_Tongue());
			pstmt.setString(11, pr.getReligion());

			pstmt.setString(12, pr.getEducation());
			pstmt.setString(13, pr.getOccupation());
			pstmt.setString(14, pr.getSalary());
			pstmt.setString(15, pr.getPhone_number());


			//execute..
			pstmt.executeUpdate();
			f = true;


		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

//
//
//
//	public static boolean deletePerson(int p_id) {
//		boolean f = false;
//		try {
//			Connection con = CP.createC();
//			String q = "delete from person_data where p_id=?";
//
//
//			//PreparedStatement
//			PreparedStatement pstmt = con.prepareStatement(q);
//
//			// set the value of parameter
//
//
//			pstmt.setInt(1, p_id);
//
//
//			//execute..
//			pstmt.executeUpdate();
//			f = true;
//
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return f;
//	}

	}



