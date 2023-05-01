public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("Ты ушла, но поздно\n");
        textEditor.write("Нам не разлюбить\n");
        textEditor.write("Будем вечно розно\n");
        textEditor.hitSave();

        textEditor.write("Вечно моросить.\n");

        textEditor.hitUndo();
        textEditor.write("Вечно вместе жить.\n");
        System.out.println(textEditor.print());
    }
}