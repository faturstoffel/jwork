package fatur.jwork;

/**
 * Class RecruiterNotFoundException, sebagai exception jika recruiter tidak ditemukan
 * @author Fatur Rahman Stoffel
 * @version 20-06-221
 */

public class RecruiterNotFoundException extends Exception{
    private int recruiter_error;

    /**
     * konstruktor dari class RecruiterNotFoundException
     * @param recruiter_input
     */
    public RecruiterNotFoundException(int recruiter_input){
        super("Recruiter ID: ");
        recruiter_error = recruiter_input;
    }

    /**
     * Get message
     */
    public String getMessage() {
        return super.getMessage() + recruiter_error + "Not Found";
    }
}
