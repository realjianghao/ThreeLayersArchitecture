public class UserBUS
{
    private UserDAO userDAO;

    /// <constructor>
    /// Constructor UserBUS
    /// </constructor>
    public UserBUS()throws Exception
    {
        userDAO  = new UserDAO();
    }

    /// <method>
    /// Get User Email By Firstname or Lastname and return VO
    /// </method>
    public UserVO getUserEmailByName(String name)
    {
        UserVO userVO = new UserVO();
        var result = userDAO.searchByName(name);

        return userVO;
    }

    /// <method>
    /// Get User Email By Id and return DataTable
    /// </method>
    public UserVO getUserById(String id)
    {
        UserVO userVO = new UserVO();
        var res = userDAO.searchById(id);


        return userVO;
    }
}