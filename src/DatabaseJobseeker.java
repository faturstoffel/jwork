import java.util.ArrayList;

/**
 * Class DatabaseJobSeeker ini akan menjadi database untuk penyimpanan informasi dari jobseeker yang ada 
 * Access modifier bersifat public pada method dan private pada variabel
 * Pada class ini menggunakan getter dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 27/03/2021
 */
public class DatabaseJobseeker
{
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getDatabaseJobseeker()
    {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id){
        Jobseeker tempVar = null;
        for (Jobseeker jobseeker: JOBSEEKER_DATABASE) {
            if (id == jobseeker.getId()){
                tempVar = jobseeker;
            }
            else{
                tempVar =  null;
            }
        }
        return tempVar;
    }

    public static boolean addJobseeker(Jobseeker jobseeker)
    {
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }

    public static boolean removeJobseeker(int id)
    {
        boolean tempBool = true;
        for (Jobseeker jobseeker: JOBSEEKER_DATABASE) {
            if (id == jobseeker.getId()){
                JOBSEEKER_DATABASE.remove(id);
                tempBool = true;
            }
            else{
                tempBool = false;
            }
        }
        return tempBool;
    }


}