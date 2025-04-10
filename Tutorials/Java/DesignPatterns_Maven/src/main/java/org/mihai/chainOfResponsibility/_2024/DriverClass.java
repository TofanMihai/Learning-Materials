package chainOfResponsibility._2024;

public class DriverClass {

    public static void main(String[] args) {

        Handler handler = new ValidUsernameHandler();
        handler.setNext(new ValidPasswordHandler())
                .setNext(new CorrectRoleHandler());

        boolean result1 = handler.handle("Mihai2", "Parola", "Admin");
        boolean result2 = handler.handle("Mihai", "Parola2", "Admin");
        boolean result3 = handler.handle("Mihai", "Parola", "Admin2");
        boolean result4 = handler.handle("Mihai", "Parola", "Admin");
        System.out.println("Result1 " + result1);
        System.out.println("Result2 " + result2);
        System.out.println("Result3 " + result3);
        System.out.println("Result4 " + result4);

//        Based on the result, do something with the handlers

    }
}
