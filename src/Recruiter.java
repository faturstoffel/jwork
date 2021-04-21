
/**
 * Class Recruiter ini bertujuan untuk mengambil informasi dari perekrut
 * Data yang diambil dan diminta berupa id, nama perekrut, email, nomor hp,
 * dan juga lokasi tempat perekrutan
 * Access modifier dari method bersifat public dan ada variabel yang bersifat private
 * @author Fatur Rahman Stoffel
 * @version 18/03/2021
 */
public class Recruiter
{
    // Deklarasi variabel dengan access modifier private
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Disini constructor bersifat default dan bernama recruiter
     * dengan access modifier public
     * Parameternya adalah
     * @param id untuk input variable id
     * @param name untuk input variable name
     * @param email untuk input variable email
     * @param phoneNumber untuk input variable phoneNumber
     * @param location untuk variable location
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location)
    {
        /**
         * untuk keyword "this", digunakan untuk mereferensikan variabel yang ada dalam class
         * Sehingga sistem bisa memahami dan tidak kebingungan untuk menetapkan nilai variabel
         */
      this.id = id;
      this.name = name;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.location = location;
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
         * Berikutnya terdapat method getter bernama getName untuk mengembalikkan atau mendapatkan data name
         * dengan return type string
         * @return name mengembalikkan nilai didalam variabel name 
         */
    public String getName()
    {
        return name;
    }
    
     /**
         * Berikutnya terdapat method getter bernama getEmail untuk mengembalikkan atau mendapatkan data email
         * dengan return type string
         * @return email mengembalikkan nilai didalam variabel email
         */
    public String getEmail()
    {
        return email;
    }
    
     /**
         * Berikutnya terdapat method getter bernama getPhoneNumber untuk mengembalikkan atau mendapatkan data phoneNumber
         * dengan return type string
         * @return phoneNumber mengembalikkan nilai didalam variabel phoneNumber 
         */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
     /**
         * Berikutnya terdapat method getter bernama getLocation untuk mengembalikkan atau mendapatkan data location
         * dengan return type string
         * @return loacation mengembalikkan nilai didalam variabel location
         */
    public Location getLocation()
    {
      return location;   
    }
    
       /**
         * Selanjutnya terdapat method setter bernama setId untuk mengisi nilai variabel id
         * dengan return type void dan parameter bernama id
         */
    public void setId(int id)
    {
        this.id = id; //this digunakan karena nama parameter method sama dengan nama instance variabel class
    }
    
           /**
         * Selanjutnya terdapat method setter bernama setLocation untuk mengisi nilai variabel location
         * dengan return type void dan parameter bernama location
         */
    public void setLocation(Location location)
    {
         this.location = location; //this digunakan karena nama parameter method sama dengan nama instance variabel class
    }
    
    
           /**
         * Selanjutnya terdapat method setter bernama setEmail untuk mengisi nilai variabel email
         * dengan return type void dan parameter bernama email
         */
    public void setEmail(String email)
    {
        this.email = email; //this digunakan karena nama parameter method sama dengan nama instance variabel class
    }
    
    /**
         * Selanjutnya terdapat method setter bernama setName untuk mengisi nilai variabel name
         * dengan return type void dan parameter bernama name
         */
    public void setName(String name)
    {
        this.name = name; //this digunakan karena nama parameter method sama dengan nama instance variabel class
    }
    
    /**
         * Selanjutnya terdapat method setter bernama setPhoneNumber untuk mengisi nilai variabel phoneNumber
         * dengan return type void dan parameter bernama phoneNumber
         */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
     /**
     * Selanjutnya terdapat method bernama printData yang berfungsi untuk mencetak isi data dalam method getName
     * Mempunyai return type void
     */
  public String toString(){
              return "ID= "+id+"\nNama= "+name+"\nPhone Number= "+phoneNumber+"\nLocation= "+location+"\n";
        }
}

