package chainOfResponsibility._2024;

public class ValidPasswordHandler extends Handler {
    @Override
    public boolean handle(String username, String password, String role) {
        if (password.equals("Parola")) {
            return handleNext(username, password, role);
        } else {
            return false;
        }
    }
}
