package Khizr2.jdbc;

import java.sql.*;

public class SearchAndUpdateMethods {



        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        SearchAndUpdateMethods() {
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/matr_site", "root", "13BallB@99");
                System.out.println("Connection Established");
            } catch (Exception e) {
            }
        }


        public void searchById(int p_id) throws SQLException {
           boolean f1 = false;
            ps = con.prepareStatement("SELECT * FROM person_data WHERE p_id = ?");
            ps.setInt(1, p_id);
            rs = ps.executeQuery();
            while(rs.next())
            {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String gender = rs.getString(3);
                int age = rs.getInt(4);
                String martial_status = rs.getString(5);
                String birth_place = rs.getString(6);
                String country = rs.getString(7);
                String date_of_birth = rs.getString(8);
                String height = rs.getString(9);
                String complexion = rs.getString(10);
                String M_T = rs.getString(11);
                String religion = rs.getString(12);
                String education = rs.getString(13);
                String occupation = rs.getString(14);
                String salary = rs.getString(15);
                String phone_number = rs.getString(16);

                System.out.println("Id : "+ id);
                System.out.println("Name : "+ name);
                System.out.println("Gender : "+ gender);
                System.out.println("Age : "+ age);
                System.out.println("Martial_Status : "+ martial_status);
                System.out.println("Birth_Place : "+ birth_place);
                System.out.println("Country : "+ country);
                System.out.println("DOB : "+ date_of_birth);
                System.out.println("Height : "+ height);
                System.out.println("Complexion : "+ complexion);
                System.out.println("Mother_Tongue : "+ M_T);
                System.out.println("Religion : "+ religion);
                System.out.println("Education : "+ education);
                System.out.println("Occupation : "+ occupation);
                System.out.println("Salary : "+ salary);
                System.out.println("Phone_Number : "+ phone_number);
                System.out.println("++++++++++++++++++++++++++++++++++++++++++");

                f1 =true;

            }
            if(!f1)
                System.out.println("Records not found....... ");




        }
    public void searchByGender (String gen) throws SQLException{
       boolean f2 = false;
        ps = con.prepareStatement("SELECT * FROM person_data WHERE gender = ?");
        ps.setString(1, gen);
        rs = ps.executeQuery();
        while (rs.next())
        {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String gender = rs.getString(3);
            int age = rs.getInt(4);
            String martial_status = rs.getString(5);
            String birth_place = rs.getString(6);
            String country = rs.getString(7);
            String date_of_birth = rs.getString(8);
            String height = rs.getString(9);
            String complexion = rs.getString(10);
            String M_T = rs.getString(11);
            String religion = rs.getString(12);
            String education = rs.getString(13);
            String occupation = rs.getString(14);
            String salary = rs.getString(15);
            String phone_number = rs.getString(16);

            System.out.println("Id : "+ id);
            System.out.println("Name : "+ name);
            System.out.println("Gender : "+ gender);
            System.out.println("Age : "+ age);
            System.out.println("Martial_Status : "+ martial_status);
            System.out.println("Birth_Place : "+ birth_place);
            System.out.println("Country : "+ country);
            System.out.println("DOB : "+ date_of_birth);
            System.out.println("Height : "+ height);
            System.out.println("Complexion : "+ complexion);
            System.out.println("Mother_Tongue : "+ M_T);
            System.out.println("Religion : "+ religion);
            System.out.println("Education : "+ education);
            System.out.println("Occupation : "+ occupation);
            System.out.println("Salary : "+ salary);
            System.out.println("Phone_Number : "+ phone_number);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");

            f2 =true;

        }
        if(!f2)
            System.out.println("Record is not here......");


    }
    public void searchByGenderAndReligion(String Gen, String rel) throws SQLException {
       boolean found = false;
        ps = con.prepareStatement("SELECT * FROM person_data WHERE gender = ? AND religion = ?");
        ps.setString(1, Gen);
        ps.setString(2, rel);
        rs = ps.executeQuery();
        while(rs.next())
        {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String gender = rs.getString(3);
            int age = rs.getInt(4);
            String martial_status = rs.getString(5);
            String birth_place = rs.getString(6);
            String country = rs.getString(7);
            String date_of_birth = rs.getString(8);
            String height = rs.getString(9);
            String complexion = rs.getString(10);
            String M_T = rs.getString(11);
            String religion = rs.getString(12);
            String education = rs.getString(13);
            String occupation = rs.getString(14);
            String salary = rs.getString(15);
            String phone_number = rs.getString(16);

            System.out.println("Id : "+ id);
            System.out.println("Name : "+ name);
            System.out.println("Gender : "+ gender);
            System.out.println("Age : "+ age);
            System.out.println("Martial_Status : "+ martial_status);
            System.out.println("Birth_Place : "+ birth_place);
            System.out.println("Country : "+ country);
            System.out.println("DOB : "+ date_of_birth);
            System.out.println("Height : "+ height);
            System.out.println("Complexion : "+ complexion);
            System.out.println("Mother_Tongue : "+ M_T);
            System.out.println("Religion : "+ religion);
            System.out.println("Education : "+ education);
            System.out.println("Occupation : "+ occupation);
            System.out.println("Salary : "+ salary);
            System.out.println("Phone_Number : "+ phone_number);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");
            found = true;
        }
        if(!found)
            System.out.println("Record is not here......");

    }
    public void searchByMultipleAttributes(String gend, int aGe, String m_s, String comp, String rel, String occup, String sal) throws SQLException{
      boolean found2 =false;
        ps = con.prepareStatement("SELECT * FROM person_data WHERE gender = ? AND age = ? AND martial_status = ? AND complexion = ? AND religion = ?  AND occupation = ? AND salary = ?");
        ps.setString(1, gend);
        ps.setInt(2, aGe);
        ps.setString(3, m_s);
        ps.setString(4, comp);
        ps.setString(5, rel);
        ps.setString(6, occup);
        ps.setString(7, sal);

        rs = ps.executeQuery();
        while(rs.next())
        {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String gender = rs.getString(3);
            int age = rs.getInt(4);
            String martial_status = rs.getString(5);
            String birth_place = rs.getString(6);
            String country = rs.getString(7);
            String date_of_birth = rs.getString(8);
            String height = rs.getString(9);
            String complexion = rs.getString(10);
            String M_T = rs.getString(11);
            String religion = rs.getString(12);
            String education = rs.getString(13);
            String occupation = rs.getString(14);
            String salary = rs.getString(15);
            String phone_number = rs.getString(16);

            System.out.println("Id : "+ id);
            System.out.println("Name : "+ name);
            System.out.println("Gender : "+ gender);
            System.out.println("Age : "+ age);
            System.out.println("Martial_Status : "+ martial_status);
            System.out.println("Birth_Place : "+ birth_place);
            System.out.println("Country : "+ country);
            System.out.println("DOB : "+ date_of_birth);
            System.out.println("Height : "+ height);
            System.out.println("Complexion : "+ complexion);
            System.out.println("Mother_Tongue : "+ M_T);
            System.out.println("Religion : "+ religion);
            System.out.println("Education : "+ education);
            System.out.println("Occupation : "+ occupation);
            System.out.println("Salary : "+ salary);
            System.out.println("Phone_Number : "+ phone_number);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");

            found2 = true;
        }
        if(!found2)
            System.out.println("Record is not here......");


    }



    public void searchByAge(int aGe) throws SQLException {
        boolean f3 =false;
        ps = con.prepareStatement("SELECT * FROM person_data WHERE age = ? ");

        ps.setInt(2, aGe);

        rs = ps.executeQuery();
        while(rs.next())
        {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String gender = rs.getString(3);
            int age = rs.getInt(4);
            String martial_status = rs.getString(5);
            String birth_place = rs.getString(6);
            String country = rs.getString(7);
            String date_of_birth = rs.getString(8);
            String height = rs.getString(9);
            String complexion = rs.getString(10);
            String M_T = rs.getString(11);
            String religion = rs.getString(12);
            String education = rs.getString(13);
            String occupation = rs.getString(14);
            String salary = rs.getString(15);
            String phone_number = rs.getString(16);

            System.out.println("Id : "+ id);
            System.out.println("Name : "+ name);
            System.out.println("Gender : "+ gender);
            System.out.println("Age : "+ age);
            System.out.println("Martial_Status : "+ martial_status);
            System.out.println("Birth_Place : "+ birth_place);
            System.out.println("Country : "+ country);
            System.out.println("DOB : "+ date_of_birth);
            System.out.println("Height : "+ height);
            System.out.println("Complexion : "+ complexion);
            System.out.println("Mother_Tongue : "+ M_T);
            System.out.println("Religion : "+ religion);
            System.out.println("Education : "+ education);
            System.out.println("Occupation : "+ occupation);
            System.out.println("Salary : "+ salary);
            System.out.println("Phone_Number : "+ phone_number);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");

            f3 = true;
        }
        if(!f3)
            System.out.println("Record is not here......");


    }
    //haider -update class
    public void updateNameAndDob(String naam, String dob , int p_id) throws Exception{

        ps = con.prepareStatement("UPDATE person_data SET p_name = ?, date_of_birth = ? WHERE p_id = ? ");
        ps.setString(1,naam);
        ps.setString(2,dob);
        ps.setInt(3, p_id);
        ps.executeUpdate();


    }

    public void UpdatingFourCol(String naam, String gender, int age, String m_s, int p_id) throws SQLException {
        ps = con.prepareStatement("UPDATE person_data SET p_name = ?, gender = ?, age = ?, martial_status = ? WHERE p_id = ?");
        ps.setString(1,naam);
        ps.setString(2,gender);
        ps.setInt(3,age);
        ps.setString(4,m_s);
        ps.setInt(5, p_id);
        ps.executeUpdate();
    }

    public void UpdatingFiveDiffCol(String naam, String edu, String occup, String sal, String ph, int p_id) throws SQLException{
        ps = con.prepareStatement("UPDATE person_data SET p_name = ?, education = ?, occupation = ?, salary = ?, phone_number = ?WHERE p_id = ?");

        ps.setString(1,naam);
        ps.setString(2,edu);
        ps.setString(3,occup);
        ps.setString(4,sal);
        ps.setString(5,ph);
        ps.setInt(6, p_id);
        ps.executeUpdate();
    }

    public void UpdatingSixDiffCol(String b_p, String country, String dob, String height, String comp, String mT,int p_id)  throws SQLException{
        ps = con.prepareStatement("UPDATE person_data SET birth_place = ?, country = ?, date_of_birth = ?,height = ?, complexion = ?, M_T = ? WHERE p_id = ?");
        ps.setString(1,b_p);
        ps.setString(2,country);
        ps.setString(3,dob);
        ps.setString(4,height);
        ps.setString(5,comp);
        ps.setString(6,mT);
        ps.setInt(7, p_id);
        ps.executeUpdate();
    }
    public void UpdatingMultipleCol(String naam, String gender,int age,String m_s,String b_p,String country,String dob,String height,String comp,String mT,String rel,String edu,String occup,String sal,String ph,int p_id) throws SQLException{
        ps = con.prepareStatement("UPDATE person_data SET p_name = ?, gender = ?, age = ?, martial_status = ?, birth_place = ?, country = ?, date_of_birth = ?,height = ?, complexion = ?, M_T = ?, religion = ?, education = ?, occupation = ?, salary = ?, phone_number = ? WHERE p_id = ? ");
        ps.setString(1,naam);
        ps.setString(2,gender);
        ps.setInt(3,age);
        ps.setString(4,m_s);
        ps.setString(5,b_p);
        ps.setString(6,country);
        ps.setString(7,dob);
        ps.setString(8,height);
        ps.setString(9,comp);
        ps.setString(10,mT);
        ps.setString(11,rel);
        ps.setString(12,edu);
        ps.setString(13,occup);
        ps.setString(14,sal);
        ps.setString(15,ph);
        ps.setInt(16, p_id);
        ps.executeUpdate();

    }

        public void close() throws Exception{
            con.close();
            System.out.println("Connection Connected");

        }



}



