
/**
 * Class Job ini mempunyai method setter dan getter, dan mempunyai printData() bertipe void
 * Pada class ini akan berisi informasi mengenai job yang ada, mulai dari nama rekruiter, hingga kategori
 * Access modifier pada class ini bersifat public untuk method dan private pada variabel
 * @author Fatur Rahman Stoffel
 * @version 18/03/21
 */
public class Job
{
    // Deklarasi dari variabel yang digunakan
    // dimana bersifat private, sehingga hanya bisa diakses oleh class sendiri
    private int id;
    private String name;
    private int fee;
    private Recruiter recruiter;
    private JobCategory category;

    /** 
     * Disini konstruktor Job bersifat default
     * dengan parameter
     * @param id untuk input variabel id
     * @param name untuk input variabel name
     * @param category untuk input variabel category
     * @param recruiter untuk input variabel recruiter
     */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category)
    {
        /**
         * untuk keyword "this", digunakan untuk mereferensikan variabel yang ada dalam class
         * Sehingga sistem bisa memahami dan tidak kebingungan untuk menetapkan nilai variabel
         */
      this.id = id;
      this.name = name;
      this.recruiter = recruiter;
      this.fee = fee;
      this.category = category;
    }

    /**
    * Berikutnya terdapat method getter bernama getId untuk mengembalikkan atau mendapatkan data id
    * dengan return type int
    * @return province mengembalikkan nilai didalam variabel id 
    */
    public int getId()
    {
        return id;
    }
    
    /**
    * Berikutnya terdapat method getter bernama getName untuk mengembalikkan atau mendapatkan data name
    * dengan return type string
    * @return province mengembalikkan nilai didalam variabel name
    */
    public String getName()
    {
        return name;
    }
    
    /**
    * Berikutnya terdapat method getter bernama getFee untuk mengembalikkan atau mendapatkan data fee
    * dengan return type int
    * @return province mengembalikkan nilai didalam variabel fee 
    */
    public int getFee()
    {
        return fee;
    }
    
    /**
    * Berikutnya terdapat method getter bernama getCategory untuk mengembalikkan atau mendapatkan data category
    * dengan return type string
    * @return province mengembalikkan nilai didalam variabel category
    */
    public  JobCategory getCategory()
    {
        return category;
    }
    
    /**
    * Berikutnya terdapat method getter bernama getRecruiter untuk mengembalikkan atau mendapatkan data recruiter
    * dengan return type string
    * @return province mengembalikkan nilai didalam variabel recruiter 
    */
    public Recruiter getRecruiter ()
    {
        return recruiter;
    }
    
    /**
    * Selanjutnya terdapat method setter bernama setId untuk mengisi nilai variabel id
    * dengan return type void dan parameter bernama id
    */
    public void setId(int id)
    {
       this.id = id;
    }
    
    /**
    * Selanjutnya terdapat method setter bernama setName untuk mengisi nilai variabel name
    * dengan return type void dan parameter bernama name
    */
    public void setName(String name)
    {
       this.name = name;
    }
    
    /**
    * Selanjutnya terdapat method setter bernama setRecruiter untuk mengisi nilai variabel recruiter
    * dengan return type void dan parameter bernama recruiter
    */
    public void setRecruiter(Recruiter recruiter)
    {
         this.recruiter = recruiter;
    }
    
    /**
    * Selanjutnya terdapat method setter bernama setFee untuk mengisi nilai variabel fee
    * dengan return type void dan parameter bernama fee
    */
    public void setFee(int fee)
    {
       this.fee = fee;
    }
    
    /**
    * Selanjutnya terdapat method setter bernama setCategory untuk mengisi nilai variabel category
    * dengan return type void dan parameter bernama category
    */
    public void setCategory(JobCategory category)
    {
        this.category = category;
    }
    
    /**
     * Selanjutnya terdapat method bernama printData yang berfungsi untuk mencetak isi data 
     * Mempunyai return type void
     */
    public void printData()
    { 
        System.out.println("==============JOB==============");
        System.out.println("ID: \n"+ getId());
        System.out.println("Name: \n" + getName());
        System.out.println("Fee: \n" + getFee());
        System.out.println("Category: \n" + getCategory());
        System.out.println("Recruiter : \n" + getRecruiter().getName());    
    
    }
}
