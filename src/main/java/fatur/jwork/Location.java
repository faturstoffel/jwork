package fatur.jwork;
/**
 * Class Location ini mempunyai method getter dan setter, dimana juga mempunyai method printData yang mempunyai tipe void
 * Class ini digunakan mengatur data dari lokasi
 * untuk access modifier bersifat public pada method, sedangkan variabel bersifat private 
 * @author Fatur Rahman Stoffel
 * @version 18/03/21
 */
public class Location
{
    // Deklarasi dari variabel yang digunakan
    // dimana bersifat private, sehingga hanya bisa diakses oleh class sendiri
    private String province;
    private String city;
    private String description;
    
    /** 
     * Disini konstruktor Location bersifat default
     * dengan parameter
     * @param province untuk input variabel province
     * @param city untuk input variabel city
     * @param description untuk input variabel deskripsi
     */
   
    public Location(String province, String city, String description)
    {
        /**
         * untuk keyword "this", digunakan untuk mereferensikan variabel yang ada dalam class
         * Sehingga sistem bisa memahami dan tidak kebingungan untuk menetapkan nilai variabel
         */
       this.province = province;
       this.city = city;
       this.description = description;
    }
        
    /**
    * Berikutnya terdapat method getter bernama getProvince untuk mengembalikkan atau mendapatkan data province
    * dengan return type string
    * @return province mengembalikkan nilai didalam variabel province 
    */
    public String getProvince()
    {
        return province;
    }
        
    /**
    * Berikutnya terdapat method getter bernama getCity untuk mengembalikkan atau mendapatkan data city
    * dengan return type string
    * @return city mengembalikkan nilai di dalam variabel city
    */
    public String getCity()
    {
         return city;   
    }
    
    /**
    * Berikutnya terdapat method getter bernama getDescription untuk mengembalikkan atau mendapatkan data description
    * dengan return type string
    * @return description mengembalikkan nilai di dalam variabel description
    */
    public String getDescription()
    {
         return description;   
    }
    
    /**
    * Selanjutnya terdapat method setter bernama setProvince untuk mengisi nilai variabel province
    * dengan return type void dan parameter bernama province
    */
    public void setProvince(String province)
    {
          this.province = province; //this digunakan karena nama parameter method sama dengan nama instance variabel class
    } 
    
    /**
    * Selanjutnya terdapat method setter bernama setCity untuk mengisi nilai variabel city
    * dengan return type void dan parameter bernama city
    */
    public void setCity(String city)
    {
          this.city = city; //this digunakan karena nama parameter method sama dengan nama instance variabel class
    }
    
    /**
    * Selanjutnya terdapat method setter bernama setDescription untuk mengisi nilai variabel description
    * dengan return type void dan parameter bernama description
    */
    public void setDescription(String description)
    {
         this.description = description; //this digunakan karena nama parameter method sama dengan nama instance variabel class
    }
    
    /**
     * Selanjutnya terdapat method bernama printData yang berfungsi untuk mencetak isi data dalam method getProvince
     * Mempunyai return type void
     */
   public String toString(){
              return "Province= "+province+"\nCity= "+city+"\nDescription= "+description+"\n";
        }
}
