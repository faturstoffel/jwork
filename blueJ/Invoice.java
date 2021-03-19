
/**
 * Class ini bertujuan untuk memberikan invoice total gaji dari pekerja
 * dimana akan ada id, id dari pekerjaan, tanggal, total gaji dan juga nama dari pekerja
 * Untuk access modifier bersifat public pada method dan private pada variabel yang ada
 *
 * @author Fatur Rahman Stoffel
 * @version 18/03/2021
 */
public class Invoice
{
    // Deklarasi dari variabel yang digunakan
    // dimana bersifat private, sehingga hanya bisa diakses oleh class sendiri
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;

    /** 
     * Disini konstruktor Invoice bersifat default
     * dengan parameter
     * @param id untuk input variabel id
     * @param idJob untuk input variabel idJob
     * @param date untuk input variabel date
     * @param totalFee untuk input variabel totalFee
     * @param jobseeker untuk variabel jobseeker
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker)
    {
         /**
         * untuk keyword "this", digunakan untuk mereferensikan variabel yang ada dalam class
         * Sehingga sistem bisa memahami dan tidak kebingungan untuk menetapkan nilai variabel
         */
    this.id = id;
    this.idJob = idJob;
    this.date = date;
    this.totalFee = totalFee;
    this.jobseeker = jobseeker;
    }

      
    /**
    * Berikutnya terdapat method getter bernama getId untuk mengembalikkan atau mendapatkan data id
    * dengan return type int
    * @return id mengembalikkan nilai didalam variabel id
    */
    public int getId()
    {
        return id;
    }
    
    /**
    * Berikutnya terdapat method getter bernama getIdJob untuk mengembalikkan atau mendapatkan data idJob
    * dengan return type int
    * @return idJob mengembalikkan nilai didalam variabel idJob
    */
    public int getIdJob()
    {
        return idJob;
    }
    
    /**
    * Berikutnya terdapat method getter bernama getDate untuk mengembalikkan atau mendapatkan data date
    * dengan return type string
    * @return date mengembalikkan nilai didalam variabel date
    */
    public String getDate()
    {
        return date;
    }
    
    /**
    * Berikutnya terdapat method getter bernama getTotalFee untuk mengembalikkan atau mendapatkan data totalFee
    * dengan return type int
    * @return totalFee mengembalikkan nilai didalam variabel totalFee
    */
    public int getTotalFee()
    {
        return totalFee;
    }
    
    /**
    * Berikutnya terdapat method getter bernama getJobseeker untuk mengembalikkan atau mendapatkan data jobseeker
    * @return jobseeker mengembalikkan nilai didalam variabel jobseeker
    */
    public Jobseeker getJobseeker()
    {
        return jobseeker;
    }
    
    /**
    * Selanjutnya terdapat method setter bernama setId untuk mengisi nilai variabel id
    * dengan return type void dan parameter bernama id
    */
    public void setId(int id){
        this.id = id;
    }
    
    /**
    * Selanjutnya terdapat method setter bernama setIdJobs untuk mengisi nilai variabel idJob
    * dengan return type void dan parameter bernama idJob
    */
    public void setIdJobs(int idJob)
    {
        this.idJob = idJob;
    }
    
    /**
    * Selanjutnya terdapat method setter bernama setDate untuk mengisi nilai variabel date
    * dengan return type void dan parameter bernama date
    */
    public void setDate(String date){
        this.date = date;
    }
    
    /**
    * Selanjutnya terdapat method setter bernama setJobseeker untuk mengisi nilai variabel jobseeker
    * dengan return type void dan parameter bernama jobseeker
    */
    public void setJobseeker(Jobseeker jobseeker)
    {
         this.jobseeker = jobseeker;   
    }
    
    /**
    * Selanjutnya terdapat method setter bernama setTotalFee untuk mengisi nilai variabel totalFee
    * dengan return type void dan parameter bernama totalFee
    */
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }
    
    /**
     * Selanjutnya terdapat method bernama printData yang berfungsi untuk mencetak isi data 
     * Mempunyai return type void
     */
    public void printData()
    {
        
    }
}

