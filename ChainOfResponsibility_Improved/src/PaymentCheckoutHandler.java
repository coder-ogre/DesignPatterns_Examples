
public class PaymentCheckoutHandler extends CheckoutHandler {
	@Override
    public void handleCheckout() {
        System.out.println("Hanling payment of the customer");

        if(nextHandler != null){
            nextHandler.handleCheckout();
        }

    }
}
