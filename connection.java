package atm.machine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class connection {

    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/test";
        String driver = "com.mysql.jdbc.Driver";
        String username = "root";
        String password = "159753";
        Connection conn = null;
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "حدث خطأ", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));
        }
        return conn;
    }

    public ResultSet selectAdmin(String user_name, String password) {
        Connection con = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            String sql = "SELECT * FROM Admin WHERE User_Name = ? AND Password =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user_name);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));
        }
        return rs;
    }

    public ResultSet selectOperation(String user_name) {
        Connection con = null;
        ResultSet rs = null;
        int count = 0;
        try {
            con = getConnection();
            String sql = "SELECT * FROM operations WHERE User_Name = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user_name);

            rs = ps.executeQuery();

            while (rs.next()) {
                if (count == 10) {
                    continue;
                } else if (count != 10) {
                    count++;
                    return rs;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));
        }
        return rs;
    }

    public ResultSet selectUser(String user_name, String password) {
        Connection con = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            String sql = "SELECT * FROM user WHERE User_Name = ? AND Password =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user_name);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));

        }
        return rs;
    }

    public ResultSet SearchtUser(String user_name) {
        Connection con = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            String sql = "SELECT * FROM user WHERE User_Name = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user_name);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));
        }
        return rs;
    }

    public void updateTable(double initialAmount, String userName) {
        Connection con = null;
        try {
            con = getConnection();
            String sql = "UPDATE user SET Initial_Amount = ? WHERE User_Name = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, initialAmount);
            ps.setString(2, userName);
            int res = ps.executeUpdate();
            if (res > 0) {
                System.out.println("done update Initial_Amount");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));
        } 
    }

    public void updatePass(String userName, String password) {
        Connection con = null;
        try {
            con = getConnection();
            String sql = "UPDATE user SET Password = ? WHERE User_Name = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, password);
            ps.setString(2, userName);
            int res = ps.executeUpdate();
            if (res > 0) {
                System.out.println("done update passwor");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));
        } 
    }

    public int DeleteUser(String userName) {
        Connection con = null;
        int res=0;
        try {
            con = getConnection();
            String sql = "DELETE From user WHERE User_Name = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            res = ps.executeUpdate();
            if (res > 0) {
                System.out.println("done delete user");
            }else if(res==0){
                JOptionPane.showMessageDialog(null, "لم يتم حذف المستخدم الذي ادخلته تأكد من ان هذا المستخم موجود", "حدث خطأ", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));
        } 
    return res;
    }

    public void insertTable(String user_name, String operation, double amount) {
        Login log = new Login();
        Connection con = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = dtf.format(now);
        try {
            con = getConnection();
            String sql = "INSERT INTO operations VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user_name);
            ps.setString(2, operation);
            ps.setDouble(3, amount);
            ps.setString(4, time);
            int insert = ps.executeUpdate();
            if (insert > 0) {
                System.out.println("done insert operation");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ في الإضافه في جدول العمليات", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));
        } 
    }

    public int InsertUser(String user, String password, double amount) {
        Connection con = null;
        int x = 0;
        try {
            con = getConnection();
            String sql = "INSERT INTO User VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            ps.setDouble(3, amount);
            int insert = ps.executeUpdate();
            if (insert > 0) {
                x = 1;
                System.out.println("done insert user");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "هذا المستخدم موجود لا يمكن استخدامة", "حدث خطأ في إضافة المستخدم ", JOptionPane.ERROR_MESSAGE, new ImageIcon("R.png"));
        } 
        return x;
    }

    public static int cheekClose() {
        int x = 0;
        String[] chosse = {"نعم", "لا "};
        int c = JOptionPane.showOptionDialog(null, "هل تريد القيام بأي علميات اخري", null, 0, 3, null, chosse, null);
        if (c == 0) {
            x = 1;
        } else if (c == 1) {
            System.exit(0);
        }
        return x;
    }
}
