public interface StockObservable {

    public void add(Observer o);
    public void remove(Observer o);
    public void sendnotification();
    public void updateStock(int newStockAdded);

    public int getStockCount();

}
