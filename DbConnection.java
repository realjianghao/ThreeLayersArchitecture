import java.sql.*;

public class DbConnection {
    private static final String URL = "jdbc:sqlserver://localhost:3306/demo_jdbc";
    private static final String NAME = "PCHAO";
    private static final String PASSWORD = ".";
    private Connection conn;

    /// <constructor>
    /// Initialise Connection
    /// </constructor>
    public DbConnection() throws Exception {
        //1.加载驱动程序
        Class.forName("com.sqlserver.jdbc.Driver");
        //2.获得数据库的连接
        conn = DriverManager.getConnection(URL, NAME, PASSWORD);
    }

    /// <method>
    /// Open Database Connection if Closed or Broken
    /// </method>
    public Connection getConnection() {
        return conn;
    }

    /// <method>
    /// Select Query
    /// </method>
    public ResultSet executeSelectQuery(String query) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        }catch(Exception e) {
            return null;
        }
    }

    /// <method>
    /// Insert Query
    /// </method>
    public boolean executeInsertQuery(String query) {
        try{
            var st = conn.createStatement();
            st.execute(query);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /// <method>
    /// Update Query
    /// </method>
    public boolean executeUpdateQuery(String query) {
        try{
            var st = conn.createStatement();
            st.execute(query);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
