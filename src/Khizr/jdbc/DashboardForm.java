package Khizr.jdbc;

import khizr3.jdbc.*;
import Khizr2.jdbc.SearchAndUpdateMain;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class DashboardForm extends JFrame {
    private JButton btnRegister;
    private JButton btnSignIn;
    private JLabel lbAdmin;
    private JPanel dashboardPanel;
    private JButton btnAdmin;

    public DashboardForm() {
        setTitle("Dashboard");
        setContentPane(dashboardPanel);
        setMinimumSize(new Dimension(500,429));
        setSize(600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        boolean hasRegisteredUsers =  connectToDatabase();
//        if(hasRegisteredUsers){
//            LoginForm loginForm = new LoginForm(this);
//            User user = loginForm.user;
//
//            if(user != null){
//                lbAdmin.setText("User: "+ user.name);
//                setLocationRelativeTo(null);
//                setVisible(true);
//            }
//            else {
//                dispose();
//            }
//        }
        if(!hasRegisteredUsers){
            RegistrationForm registrationForm = new RegistrationForm(this);
            User user = registrationForm.user;

            if(user != null){
                lbAdmin.setText("User: "+ user.name);
                setLocationRelativeTo(null);
                setVisible(true);
            }
            else {
                dispose();
            }
        }
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistrationForm registrationForm = new RegistrationForm(DashboardForm.this);
                User user = registrationForm.user;

                if(user != null){
                    JOptionPane.showMessageDialog(DashboardForm.this,
                            "New User: " + user.name,
                            "Successful Registration",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        btnSignIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginForm loginForm = new LoginForm(DashboardForm.this);
                User user = loginForm.user;

                if(user != null){
                    lbAdmin.setText("User: "+ user.name);
                    setLocationRelativeTo(null);
                    setVisible(true);
                    JOptionPane.showConfirmDialog(DashboardForm.this,
                            "User: "+user.name,
                            "User Logged In",
                            JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    try{
                        SearchAndUpdateMain.main(new String[0]);
                    }catch (Exception f){
                        System.out.println(f);
                    }
                }
                else {
                    dispose();
                }
            }
        });
        btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dispose();
                    Start.main(new String[0]);
                } catch (Exception a) {
                    System.out.println(a);
                }
            }
        });
        setVisible(true);
    }

    private boolean connectToDatabase() {
        boolean hasRegisteredUsers = false;

//        final String MYSQL_SERVER_URL = "jdbc:mysql://localhost:3306/";
        final String DB_URL = "jdbc:mysql://localhost:3306/matr_site";
        final String USERNAME = "root";
        final String PASSWORD = "13BallB@99";

        try{
            Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            Statement statement = conn.createStatement();

            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM users");
            if(resultSet.next()){
                int numUsers = resultSet.getInt(1);
                if(numUsers>0) {
                    hasRegisteredUsers = true;
                }
            }

            statement.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();

        }

        return hasRegisteredUsers;
    }

    public static void main(String[] args) {
        DashboardForm dashboardForm = new DashboardForm();
    }
}