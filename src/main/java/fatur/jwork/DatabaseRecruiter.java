package fatur.jwork;
import java.util.ArrayList;
/**
 * Class DatabaseRecruiter ini akan menjadi database untuk penyimpanan informasi dari recruiter yang ada
 * Access modifier bersifat public pada method dan private pada variabel
 * Pada class ini menggunakan getter dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 20-06-21
 */
public class DatabaseRecruiter {
    // Deklarasi instance variables yang digunakan.
    // Access Modifier variable di set private.
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    /**
     * Get recuiter database
     * @return RECRUITER_DATABASE
     */
    public static ArrayList<Recruiter> getRecruiterDatabase() {
        return RECRUITER_DATABASE;
    }

    /**
     * Get last id
     * @return last id
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * Untuk menambah recruiter
     * @param recruiter
     * @return boolean
     */
    public static boolean addRecruiter(Recruiter recruiter) {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }

    /**
     * Untuk remove recruiter
     * @param id
     * @return boolean
     * @throws RecruiterNotFoundException
     */
    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException {
        boolean tempBool = true;
        for (Recruiter recruiter : RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                RECRUITER_DATABASE.remove(id);
                tempBool = true;
                return tempBool;
            }
        }
        throw new RecruiterNotFoundException(id);
    }


    /**
     * Untuk mendapatkan recuiter dengan menggunakan id
     * @param id
     * @throws RecruiterNotFoundException
     */
    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException {
        Recruiter temp = null;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                temp = recruiter;
                return temp;
            }
        }
        throw new RecruiterNotFoundException(id);
    }
}
