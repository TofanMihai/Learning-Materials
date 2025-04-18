package chainOfResponsibility._2024;

public class CorrectRoleHandler extends Handler {
    @Override
    public boolean handle(String username, String password, String role) {
        return role.equals("Admin");
    }
}
