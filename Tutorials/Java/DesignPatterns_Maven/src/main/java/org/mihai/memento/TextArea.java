package memento;

public class TextArea {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public TextAreaMemento takeSnapshot() {
        return new TextAreaMemento(this.text);
    }

    public void restore(TextAreaMemento memento) {
        this.text = memento.getSavedText();
    }

    public static class TextAreaMemento {
        private final String text;

        public TextAreaMemento(String text) {
            this.text = text;
        }

        private String getSavedText() {
            return this.text;
        }
    }

}
