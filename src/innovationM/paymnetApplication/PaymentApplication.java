package innovationM.paymnetApplication;

import java.util.Scanner;

public class PaymentApplication {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("""
                Select the payment Method:
                1.Card Payment
                2.Net Banking
                3.UPI Payment
                """);
        int choice=scn.nextInt();
        PaymentStrategy paymentStrategy=switch (choice){
            case 1->new CardPayment("1234-5678-9012-3456");
            case 2->new NetBanking("HDFC Bank");
            case 3->new UpiPayment("user@upi");
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
        PaymentService  pamentService=new PaymentService(paymentStrategy);
        pamentService.processPayment(5000);
    }
}
