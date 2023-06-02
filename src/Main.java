public class Main {
    public static void main(String[] args) {
        IphoneObservable io = new IphoneObservable();
        io.add(new Observer("1@gmail.com", io));
        io.add(new Observer("2@gmail.com", io));

        io.updateStock(10);
    }
}