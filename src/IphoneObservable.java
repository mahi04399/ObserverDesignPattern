import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    List<Observer> list = new ArrayList<>();
    int stock = 0;

    @Override
    public void add(Observer obj) {
        list.add(obj);
    }

    @Override
    public void remove(Observer obj) {
        list.remove(obj);
    }

    @Override
    public void sendnotification() {
        for (Observer observer : list) {
            observer.update();
        }
    }

    @Override
    public void updateStock(int newStockAdded) {
        if (stock == 0) {
            sendnotification();
        }
        stock += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stock;
    }
}
