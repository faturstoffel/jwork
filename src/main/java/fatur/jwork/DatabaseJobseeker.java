package fatur.jwork;
import java.util.ArrayList;

/**
 * Class DatabaseJobSeeker ini akan menjadi database untuk penyimpanan informasi dari jobseeker yang ada 
 * Access modifier bersifat public pada method dan private pada variabel
 * Pada class ini menggunakan getter dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 20/06/2021
 */
public class DatabaseJobseeker
{
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;

    /**
     * Get jobseeker database
     * @return JOBSEEKER_DATABASE
     */
    public static ArrayList<Jobseeker> getJobseekerDatabase() {
        return JOBSEEKER_DATABASE;
    }

    /**
     * Get last id
     * @return lastId
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * Untuk mendapatkan jobseeker dengan menggunakan id
     * @param id
     * @return temp
     * @throws JobSeekerNotFoundException
     */
    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException {
        Jobseeker temp = null;
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (id == jobseeker.getId()) {
                temp = jobseeker;
                return temp;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }

    /**
     * Untuk menambahkan jobseeker
     * @param jobseeker
     * @return boolean
     * @throws EmailAlreadyExistsException
     */
    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
        for (Jobseeker jobseeker1 : JOBSEEKER_DATABASE) {
            if (jobseeker1.getEmail().equals(jobseeker.getEmail())) {
                throw new EmailAlreadyExistsException(jobseeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }

    /**
     * Untuk remove jobseeker
     * @param id
     * @return boolean
     * @throws JobSeekerNotFoundException
     */
    public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == jobseeker.getId()) {
                JOBSEEKER_DATABASE.remove(jobseeker);
                return true;
            }
            throw new JobSeekerNotFoundException(id);
        }
        return false;
    }

    /**
     * Untuk mendaptkan parameter login dari jobseeker
     * @param email
     * @param password
     * @return jobseeker
     */
    public static Jobseeker getJobseekerLogin(String email, String password) {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getEmail().equals(email) && jobseeker.getPassword().equals(password)) {
                return jobseeker;
            }
        }
        return null;
    }


}