public class Observer {
    String emailId;
    StockObservable observable;

    public Observer (String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }
    public void update () {
        sendMail(emailId);
    }

    private void sendMail(String emailId) {
        System.out.println ("message sent to " + emailId);
    }
}
