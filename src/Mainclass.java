public class Mainclass {
    public static void main(String[] args){
        DBUtil.getConnection();
        LoginForm.init();
        LoginForm.display();
        LoginForm.validate();
        UserDAO.findUser("","");
    }
}
