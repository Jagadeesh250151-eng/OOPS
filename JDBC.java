
import java.sql.*;

class DBConnectivity {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "password"
            );

            System.out.println("Database Connected Successfully");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " + rs.getString(2)
                );
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
