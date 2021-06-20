package fatur.jwork;
/**
 * Enum Payment Type berisi variabel konstant yang didalamnya terdapat Bank Payment dan E-wallet Payment
 * Variabel-variabel ini merupakan final variabel yang tidak bisa untuk diganti 
 * @author Fatur Rahman Stoffel
 * @version 25-02-2021
 */
public enum PaymentType {
    BankPayment("Bank Payment"),
    EwalletPayment("E-wallet Payment");

    private String type;
    PaymentType(String type) {
        this.type = type;
    }
    @Override // Berfungsi untuk memberitahu kompiler, bahwa elemen merupakan sebuah override
    public String toString(){
        return type;
    }
    


}
