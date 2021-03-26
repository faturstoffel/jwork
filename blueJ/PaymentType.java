
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author Fatur Rahman Stoffel
 * @version 25/02/2021
 */
public enum PaymentType {
    BankPayment("Bank Payment"),
    EwalletPayment("E-wallet Payment");

    private final String type;
    private PaymentType(String type) {
        this.type = type;
    }
    @Override
    public String toString(){
        return type;
    }

}
