
/**
 * Class DatabaseJobSeeker ini akan menjadi database untuk penyimpanan informasi dari jobseeker yang ada 
 * Access modifier bersifat public pada method dan private pada variabel
 * Pada class ini menggunakan getter dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 27/03/2021
 */
public class DatabaseJobseeker
{
    // Deklarasi dari variabel yang digunakan
    // dimana bersifat private, sehingga hanya bisa diakses oleh class sendiri
    private static String[] listJobseeker;
    
     /**
     * Method addJobseeker ini mempunyai tipe boolean
     * parameter yang digunakan adalah jobseeker
     * Betujuan untuk menambahkan data jobseeker baru pada database
     * @return false jika bertipe data boolean
     * @param jobseeker sebagai input
     */
    public static boolean addJobseeker(Jobseeker jobseeker){
      return false;   
    }
    
    /**
     * Method removeJobseeker ini mempunyai tipe boolean
     * parameter yang digunakan adalah jobseeker
     * Betujuan untuk menghapus data jobseeker pada database
     * @return false jika bertipe data boolean
     * @param jobseeker sebagai input
     */
    public static boolean removeJobseeker(Jobseeker jobseeker){
     return false;   
    }
    
     /**
    * Berikutnya terdapat method getter bernama getJobseeker
    * @return null mengembalikkan nilai null 
    */
    public static Job getJobseeker(){
     return null;   
    }

    /**
    * Berikutnya terdapat method getter bernama getListJobseeker
    * @return null mengembalikkan nilai null 
    * Betipe string array
    * tidak ada parameter yang digunakan pada method getListJobseeker ini
    */
    public static String[] getListJobseeker(){
     return listJobseeker;   
    }
    
   
    

   
}
