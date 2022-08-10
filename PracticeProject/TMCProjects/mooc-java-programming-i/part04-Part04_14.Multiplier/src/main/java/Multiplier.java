//import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

public class Multiplier {
    private int number;

    public Multiplier(int number) {
        this.number = number;
    }
    public int multiply(int number) {
        return this.number * number;
    }
}
