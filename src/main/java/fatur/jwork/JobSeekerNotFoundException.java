package fatur.jwork;

/**
 * Class JobSeekerNotFoundException, merupakan exception jika jobseeker tidak ditemukan
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

public class JobSeekerNotFoundException extends Exception {
    private int jobseeker_error;

    /**
     * Konstruktor dari class JobSeekerNotFoundException
     * @param jobseeker_input
     */
    public JobSeekerNotFoundException(int jobseeker_input){
        super("Jobseeeker ID: ");
        jobseeker_error = jobseeker_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage() {
        return super.getMessage() + jobseeker_error + "not found";
    }
}
