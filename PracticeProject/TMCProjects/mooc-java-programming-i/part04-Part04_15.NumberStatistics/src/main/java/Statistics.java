
public class Statistics {
    private int count;
    private int sum;
    public Statistics() {
       count = 0;
       sum = 0;
    }
    public void addNumber(int number) {
        this.count += 1;
        this.sum += number;
    }
    public int getCount() {
        return this.count;
    }
    public int sum() {
        return this.sum;
    }
    public double average() {
        if (this.count != 0) {
            return ((double)this.sum / (double)this.count);
        }
        return 0;
    }
}
