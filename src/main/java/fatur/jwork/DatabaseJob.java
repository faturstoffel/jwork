package fatur.jwork;
import java.util.ArrayList;

/**
 * Class DatabaseJob ini akan menjadi database untuk penyimpanan informasi dari job yang ada
 * Access modifier bersifat public pada method dan private pada variabel
 * Pada class ini menggunakan getter dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 20-06-21
 */
public class DatabaseJob
{
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;

    /**
     * method ini digunakan untuk mengisi data job
     * @param job berisi total Job
     * @return false
     */
    public static boolean addJob(Job job) {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    /**
     * method ini digunakan untuk menghapus data job
     * @param id berisi total Job
     * @return false
     */
    public static boolean removeJob(int id) throws JobNotFoundException {
        boolean status = false;
        for (Job job : JOB_DATABASE) {
            if (job.getId() == id) {
                JOB_DATABASE.remove(job);
                status = true;
                break;
            }
        }
        if (!status) {
            throw new JobNotFoundException(id);
        }
        return status;
    }

    /**
     * method ini digunakan untuk mengambil data job
     * @return JOB_DATABASE
     */
    public static ArrayList<Job> getJobDatabase() {
        return JOB_DATABASE;
    }

    /**
     * get last id
     * @return lastId
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * method ini digunakan untuk mengambil data job menggunakan id
     * @param id
     * @return temp
     */
    public static Job getJobById(int id) throws JobNotFoundException {
        Job temp = null;
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (id == JOB_DATABASE.get(i).getId()) {
                temp = JOB_DATABASE.get(i);
            }
        }
        if (temp == null) {
            throw new JobNotFoundException(id);
        }
        return temp;
    }

    /**
     * Untuk mendapatkan job dengan menggunakan recruiter
     * @param recruiterId
     * @return temp
     */
    public static ArrayList<Job> getJobByRecruiter(int recruiterId) {
        ArrayList<Job> temp = null;
        for (Job job : JOB_DATABASE) {
            if (recruiterId == job.getRecruiter().getId()) {
                if (temp == null) {
                    temp = new ArrayList<Job>();
                }
                temp.add(job);
            }
        }
        return temp;
    }

    /**
     * Untuk mendapatkan job dengan menggunakan kategori
     * @param category
     * @return temp
     */
    public static ArrayList<Job> getJobByCategory(JobCategory category) {
        ArrayList<Job> temp = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (category == JOB_DATABASE.get(i).getCategory()) {
                temp.add(JOB_DATABASE.get(i));
            }
        }
        return temp;
    }
    
}
