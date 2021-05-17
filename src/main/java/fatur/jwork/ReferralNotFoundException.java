package fatur.jwork;
public class ReferralNotFoundException extends Exception {
    private int Referral_error;

    public ReferralNotFoundException(int Referral_input) {
        super("Referral ID: ");
        Referral_error = Referral_input;
    }
    public String getMessage(){
        return super.getMessage() + Referral_error + "not found";
    }
}
