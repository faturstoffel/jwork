package fatur.jwork;

/**
 * Class EmailAlreadyExistException, untuk exception jika email sudah terdaftar
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */
public class EmailAlreadyExistsException extends Exception{
    private Jobseeker jobseeker_error;

    /**
     * Konstruktor untuk class EmailAlreadyExistException
     * @param jobseeker_input
     */
    public EmailAlreadyExistsException (Jobseeker jobseeker_input){
        super("Jobseeker Email: ");
        jobseeker_error = jobseeker_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage(){
        return super.getMessage() + jobseeker_error.getEmail() + "already exist";
    }
}
