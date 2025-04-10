package chainOfResponsibility._2024;

public class ValidUsernameHandler extends Handler {
    @Override
    public boolean handle(String username, String password, String role) {
        if (username.equals("Mihai"))
            return handleNext(username, password, role);
        else {
            return false;
        }
    }
}
