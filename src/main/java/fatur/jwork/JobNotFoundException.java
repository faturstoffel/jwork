package fatur.jwork;

/**
 * CLass JobNotFoundException, merupakan exception jika job tidak ditemukan
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

public class JobNotFoundException extends Exception {
    private int job_error;

    /**
     * Konstruktor dari class JobNotFoundException
     * @param job_input
     */
    public JobNotFoundException(int job_input){
        super("Job ID: ");
        job_error = job_input;
    }

    /**
     * Get message
     */
    public String getMessage(){
        return super.getMessage() + job_error + "not found";
    }
}
