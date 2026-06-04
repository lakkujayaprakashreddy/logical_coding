package innovationM.paymnetApplication;

public class CardPayment implements PaymentStrategy{
    private String cardNumber;
    public CardPayment(String cardNumber){
        this.cardNumber=cardNumber;
    }
    @Override
    public void pay(double amount){
        System.out.println("Amount paid rupees :"+amount+" using card Number:"+cardNumber);
    }
}
