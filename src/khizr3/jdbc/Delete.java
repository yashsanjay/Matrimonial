package khizr3.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete {
    public static boolean deletePerson(int p_id) {
        boolean f = false;
        try {
            Connection con = CP.createC();
            String q = "delete from person_data where p_id=?";


            //PreparedStatement
            PreparedStatement pstmt = con.prepareStatement(q);

            // set the value of parameter


            pstmt.setInt(1, p_id);


            //execute..
            pstmt.executeUpdate();
            f = true;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

}
