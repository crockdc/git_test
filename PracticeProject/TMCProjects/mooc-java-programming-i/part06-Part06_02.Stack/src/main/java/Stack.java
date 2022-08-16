import java.util.ArrayList;

public class Stack {
    private ArrayList<String> strings;

    public Stack() {
        this.strings = new ArrayList<>();
    }
    public boolean isEmpty() {
        return this.strings.isEmpty();
    }
    public void add(String value) {
        this.strings.add(value);
    }
    public ArrayList<String> values() {
        return this.strings;
    }
    public String take() {
        int size = this.strings.size()-1;
        String taken = this.strings.get(size);
        this.strings.remove(size);
        return taken;
    }
}
