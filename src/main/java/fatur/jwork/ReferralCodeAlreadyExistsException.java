package fatur.jwork;

/**
 * Class ReferralCodeAlreadyExistException, sebagai exception jika referral code sudah ada
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

public class ReferralCodeAlreadyExistsException extends Exception {
    private Bonus referral_error;

    /**
     * Konstruktor dari class ReferralCodeAlreadyExistException
     * @param referral_input
     */
    public ReferralCodeAlreadyExistsException(Bonus referral_input){
        super("Referral Code: ");
        referral_error = referral_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage(){
        return super.getMessage() + referral_error.getReferralCode() + " already exists.";
    }
}
