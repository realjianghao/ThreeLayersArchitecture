import java.sql.ResultSet;

public class UserDAO {
    private DbConnection conn;

    /// <constructor>
    /// Constructor UserDAO
    /// </constructor>
    public UserDAO() throws Exception {
        conn = new DbConnection();
    }

    /// <method>
    /// Get User Email By Firstname or Lastname and return DataTable
    /// </method>
    public ResultSet searchByName(String username) {
        try {
            String query = String.format("select * from [t01_user]" +
                    "where t01_firstname like " + username + " or " + username +
                    "like @t01_lastname ");

            return conn.executeSelectQuery(query);
        } catch (Exception e) {
            return null;
        }
    }

    /// <method>
    /// Get User Email By Id and return DataTable
    /// </method>
    public ResultSet searchById(String id) {
        String query = "select * from [t01_id] where t01_id =" + id;
        return conn.executeSelectQuery(query);
    }

}
