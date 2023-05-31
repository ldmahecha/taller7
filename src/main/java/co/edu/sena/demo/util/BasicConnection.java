package co.edu.sena.demo.util;

import java.sql.*;

public class BasicConnection {
    public static void main(String[] args) throws SQLException {
        String url =
                "jdbc:mysql://localhost:3306/my_app?serve rTimezone=America/Bogota";
        String username = "myapp";
        String password = "d0Tio0jCk1365";
        String sql = null;
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            sql = "SELECT * FROM my_app.users_tbl";
            try {
                conn =
                        DriverManager.getConnection(url,
                                username, password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            stm = ((Connection) conn).createStatement();
            rs = ((Statement) stm).executeQuery(sql);
            while (((ResultSet) rs).next()) {

                System.out.print(rs.getString("user_firstname"));
                System.out.print(" | ");

                System.out.println(rs.getString("user_las tname"));
            }
        }  finally {
            try {
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
