import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/databa","root","Varsh@123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from databa");

            while(resultSet.next())
            {
                System.out.println(resultSet.getString("name"));

            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}