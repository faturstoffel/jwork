
/**
 * Class DatabaseJob ini akan menjadi database untuk penyimpanan informasi dari job yang ada
 * Access modifier bersifat public pada method dan private pada variabel
 * Pada class ini menggunakan getter dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 18/03/21
 */
public class DatabaseJob
{
    // Deklarasi dari variabel yang digunakan
    // dimana bersifat private, sehingga hanya bisa diakses oleh class sendiri
    private static String [] listJob;

   
    
    /**
     * Method addJob ini mempunyai tipe boolean
     * parameter yang digunakan adalah job
     * Betujuan untuk menambahkan data job baru pada database
     * @return false jika bertipe data boolean
     * @param job sebagai input
     */
    public static boolean addJob(Job job)
    {
      return false;   
    }
    
    /**
     * Method removeJob ini mempunyai tipe boolean
     * Parameter yang digunakan adalah job
     * Bertujuan untuk menghapus data job
     * @return false jika bertipe data boolean
     * @param job digunakan sebagai input
     */
    public static boolean removeJob(Job job)
    {
    return false;   
    }
    
    /**
    * Berikutnya terdapat method getter bernama getJob 
    * @return null mengembalikkan nilai null 
    */
    public static Job getJob()
    {
        return null;
    }
    
    /**
    * Berikutnya terdapat method getter bernama getListJob
    * @return null mengembalikkan nilai null 
    * Betipe string array
    * tidak ada parameter yang digunakan pada method getListJob ini
    */
    public static String [] getListJob ()
    {
        return listJob;
    }
    
}
