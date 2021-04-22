import java.util.ArrayList;
/**
 * Class DatabaseRecruiter ini akan menjadi database untuk penyimpanan informasi dari recruiter yang ada
 * Access modifier bersifat public pada method dan private pada variabel
 * Pada class ini menggunakan getter dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 20/03/21
 */
public class DatabaseRecruiter
{
    // Deklarasi instance variables yang digunakan.
    // Access Modifier variable di set private.
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase()
    {
        return RECRUITER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Recruiter getRecruiterById(int id){
        Recruiter tempVar = null;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()){
                tempVar = recruiter;
            }
            else{
                tempVar =  null;
            }
        }
        return tempVar;
    }


    public static boolean addRecruiter(Recruiter recruiter)
    {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }

    public static boolean removeRecruiter(int id)
    {
        boolean tempBool = true;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if  (id == recruiter.getId()){
                RECRUITER_DATABASE.remove(id);
                tempBool = true;
            }
            else{
                tempBool = false;
            }
        }
        return tempBool;
    }
}
