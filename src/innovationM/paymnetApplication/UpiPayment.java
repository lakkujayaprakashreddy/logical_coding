package innovationM.paymnetApplication;

public class UpiPayment implements PaymentStrategy {
    private String upiUrl;
    public UpiPayment(String upiUrl) {
        this.upiUrl = upiUrl;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Amount paid rupees :"+amount+" using UPI URL:"+upiUrl);
    }
}
