
/**
 * Class DatabaseRecruiter ini akan menjadi database untuk penyimpanan informasi dari recruiter yang ada
 * Access modifier bersifat public pada method dan private pada variabel
 * Pada class ini menggunakan getter dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 20/03/21
 */
public class DatabaseRecruiter
{
    // Deklarasi dari variabel yang digunakan
    // dimana bersifat private, sehingga hanya bisa diakses oleh class sendiri
    private String [] listRecruiter;

    /** 
     * Disini konstruktor DatabaseRecruiter bersifat default dan bertipe public
     */
    public DatabaseRecruiter()
    {
      
        
    }
    
    /**
     * Method addRecruiter ini mempunyai tipe boolean
     * parameter yang digunakan adalah recruiter
     * Betujuan untuk menambahkan data recruiter baru pada database
     * @return false jika bertipe data boolean
     * @param recruiter sebagai input
     */
    public boolean addRecruiter(Recruiter recruiter)
    {
        
        return false;
    }
    
     /**
     * Method removeRecruiter ini mempunyai tipe boolean
     * Parameter yang digunakan adalah recruiter
     * Bertujuan untuk menghapus data recruiter
     * @return false jika bertipe data boolean
     * @param recruiter digunakan sebagai input
     */
    public boolean removeRecruiter(Recruiter recruiter)
    {
      return false;   
    }
    
    /**
    * Berikutnya terdapat method getter bernama getRecruiter
    * @return null mengembalikkan nilai null 
    */
    public Recruiter getRecruiter()
    {
        return null;
    }
    
    /**
    * Berikutnya terdapat method getter bernama getListRecruiter
    * @return null mengembalikkan nilai null 
    * Betipe string array
    * tidak ada parameter yang digunakan pada method getListRecruiter ini
    */
    public String [] getListRecruiter()
    {
        return null;
    }

 
}
