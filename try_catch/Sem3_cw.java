class Sem3_cw implements AutoCloseable {

    public static void main(String[] args) {
        add(1);
    }

    boolean on;
    static int counter;

    public void Counter() {
        on = true;
        counter = 0;
    }

    public static void add(int step) {
        counter += step;
        System.out.println(counter);
        if (step <= 0)
            throw new RuntimeException("step меньше 1");
    }

    @Override
    public void close() throws Exception {
        if (on) {
            on = false;
            counter = 0;
        }
    }
}