import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Datasource {
  
  public static Connection connect() {
    
    String db_file = "jdbc:sqlite:resources/bank.db";
    Connection connection = null;
    try {
      connection = DriverManager.getConnection(db_file);
      System.out.println("We're connected");
    } catch (SQLException e){
      e.printStackTrace();
    } 
    return connection;
  }

  public static void main(String[] args) {
    connect();
  }
}
