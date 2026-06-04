package innovationM.paymnetApplication;

public class NetBanking implements PaymentStrategy{
    private String bankName;
    public NetBanking(String bankName){
        this.bankName=bankName;
    }
    @Override
    public void pay(double amount){
        System.out.println("Amount paid rupees :"+amount+" using Net Banking of Bank:"+bankName);
    }
}
