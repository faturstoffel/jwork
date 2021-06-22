package fatur.jwork;

/**
 * Class ReferralNotFoundException, sebagai exception jika referral code tidak ditemukan
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

public class ReferralNotFoundException extends Exception {
    private int Referral_error;

    /**
     * Konstruktor dari class ReferralNotFoundException
     * @param Referral_input
     */
    public ReferralNotFoundException(int Referral_input) {
        super("Referral ID: ");
        Referral_error = Referral_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage(){
        return super.getMessage() + Referral_error + "not found";
    }
}
