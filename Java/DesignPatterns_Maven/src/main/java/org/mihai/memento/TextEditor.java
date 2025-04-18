package memento;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class TextEditor {
    private final Deque<TextArea.TextAreaMemento> stateHistory;
    private final TextArea textArea;

    public TextEditor() {
        stateHistory = new LinkedList<>();
        textArea = new TextArea();
    }

    public void write(String text) {
        if (Objects.nonNull(this.textArea.getText())) {
            this.stateHistory.push(textArea.takeSnapshot());
        }
        this.textArea.setText(text);
    }

    public void undo() {
        this.textArea.restore(stateHistory.pop());
    }

    public String getText() {
        return this.textArea.getText();
    }
}
