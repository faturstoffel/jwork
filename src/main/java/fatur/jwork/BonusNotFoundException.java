package fatur.jwork;

/**
 * Class BonusNotFoundException, yang merupakan exception jika bonus tidak ditemukan
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

public class BonusNotFoundException extends Exception{
    private int bonus_error;

    /**
     * Konstruktor dari BonusNotFoundException
     * @param bonus_input
     */
    public BonusNotFoundException(int bonus_input){
        super("Bonus ID: ");
        bonus_error = bonus_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage() {
        return super.getMessage() + bonus_error + "not found";
    }
}