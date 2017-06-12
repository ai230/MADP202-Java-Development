/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author yamamotoai
 */
public class ControllDB {

    //  Database
    static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static final String DB_URL = "jdbc:derby://localhost:1527/QuickMoney";
    //  Database credentials
    static final String USER = "APP";
    static final String PASS = " ";
    
    
    public static ArrayList<InputData> readDB() {
        
        ArrayList<InputData> dataList = new ArrayList<>();
        
        Connection con = null;
        Statement statement = null;  

        int numRow = 0;
        try {//STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = con.createStatement();
            String sql;
            sql = "SELECT * FROM DETAIL";
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            numRow = rs.getRow();
            //STEP 5: Extract data from result set
            System.out.println("<<Display values in the DB>>");
            while (rs.next()) {
  
                //Display values
                System.out.print("#: " + rs.getRow());
                System.out.print("ID: " + rs.getString("ID"));
                System.out.print(" CATEGORY: " + rs.getString("CATEGORY"));
                System.out.print(" PROPERTY: " + rs.getString("PROPERTY"));
                System.out.println(" AMOUNT: " + rs.getString("AMOUNT"));
                
                int id = Integer.parseInt(rs.getString("ID"));
                String dateStr = rs.getString("DATE");
                String category = rs.getString("CATEGORY");
                String property = rs.getString("PROPERTY");
                Double amount = Double.parseDouble(rs.getString("AMOUNT"));
                
                //create an object from the data in the DB
                InputData data = new InputData(id, category, property, amount, dateStr);
                //Add to the arraylist
                dataList.add(data);

            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return dataList;
    }

    public static void insertDB(int id, String property, String category, Double amount, String dateStr) throws SQLException {
        Connection con = null;
        Statement statement = null;

        try {//STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = con.createStatement();
            String sql;
            sql = "INSERT INTO DETAIL"
                    + "(ID, PROPERTY, CATEGORY, AMOUNT, DATE) " + "VALUES"
            + "(" + id + ",'"+ property + "','" + category + "'," + amount + ",'" + dateStr + "')";  

            System.out.println(sql);
            // STEP 5: insert the data
            statement.executeUpdate(sql);

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //STEP 6: Clean-up environment
            if (statement != null) {
                statement.close();
            }

            if (con != null) {
                con.close();
            }
        }

    }

    public static void deleteDB() throws SQLException {

        Connection con = null;
        Statement statement = null;

        try {//STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = con.createStatement();
            String sql;
            sql = "DELETE FROM DETAIL WHERE ID = 1";
      
            // STEP 5: delete the data
            statement.execute(sql);

            
        } catch (SQLException se) {
            //Handle errors for JDBC
            System.out.println("error!!! " +se.getMessage());
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            System.out.println("error!!! " +e.getMessage());
            e.printStackTrace();
        } finally {
            //STEP 6: Clean-up environment
            if (statement != null) {
                statement.close();
            }

            if (con != null) {
                con.close();
            }
        }

    }
}
