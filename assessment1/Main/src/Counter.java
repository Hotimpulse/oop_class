public class Counter {
    private int count;
//    private String value;

    public Counter() {
        this.count = 0;
    }

    public int add() {
        this.count++;
        return count;
    }

    public int getCount() {
        return this.count;
    }

}