package memento;

public class DriverClass {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.write("First Line of Code");
        textEditor.write("Second Line of Code");
        textEditor.write("Third Line of Code");

        System.out.println(textEditor.getText());


        textEditor.undo();
        System.out.println(textEditor.getText());
    }
}
