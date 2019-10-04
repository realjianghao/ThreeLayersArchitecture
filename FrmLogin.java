public class FrmLogin {
    private UserBUS userBUS;

    public FrmLogin()throws Exception
    {
        //InitializeComponent();
        userBUS = new UserBUS();
    }

    private void btnSearch_Click(Object sender, Object[] e) {
        UserVO userVO = new UserVO();
        userVO = userBUS.getUserEmailByName((String)e[0]);

    }

}
