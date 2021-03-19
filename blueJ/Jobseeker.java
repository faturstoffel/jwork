
/**
 *  Class Jobseeker ini bertujuan untuk mengambil informasi dari pencari kerja
 *  Mulai dari nama, email, password, dan juga tanggal melamar
 *  Class ini mempunyai method getter dan setter, dimana juga mempunyai method prinData yang mempunyai tipe void
 *  untuk access modifier bersifat public pada method, sedangkan variabel bersifat private
 * @author Fatur Rahman Stoffel
 * @version 18/03/2021
 */
public class Jobseeker
{
    // Deklarasi dari variabel yang digunakan
    // dimana bersifat private, sehingga hanya bisa diakses oleh class sendiri
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;


    /** 
     * Disini konstruktor Jobseeker bersifat default
     * dengan parameter
     * @param id untuk input variabel id
     * @param name untuk input variabel name
     * @param email untuk input variabel email
     * @param password untuk input variabel password
     * @param joinDate untuk input variabel joinDate
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
        /**
         * untuk keyword "this", digunakan untuk mereferensikan variabel yang ada dalam class
         * Sehingga sistem bisa memahami dan tidak kebingungan untuk menetapkan nilai variabel
         */
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }
        
         /**
         * Berikutnya terdapat method getter bernama getId untuk mengembalikkan atau mendapatkan data id
         * dengan return type int
         * @return id mengembalikkan nilai didalam variabel id
         */
        public int getId() {
            return id;
        }
        
        /**
         * Berikutnya terdapat method getter bernama getName untuk mengembalikkan atau mendapatkan data name
         * dengan return type string
         * @return name mengembalikkan nilai didalam variabel name
         */
        public String getName(){
            return name;
        }
        
         /**
         * Berikutnya terdapat method getter bernama getEmail untuk mengembalikkan atau mendapatkan data email
         * dengan return type string
         * @return email mengembalikkan nilai didalam variabel email
         */
        public String getEmail(){
            return email;
        }
        
        /**
         * Berikutnya terdapat method getter bernama getPassword untuk mengembalikkan atau mendapatkan data password
         * dengan return type string
         * @return password mengembalikkan nilai didalam variabel password
         */
        public String getPassword(){
            return password;
        }
        
        /**
         * Berikutnya terdapat method getter bernama getJoinDate untuk mengembalikkan atau mendapatkan data joinDate
         * dengan return type string
         * @return joinDate mengembalikkan nilai didalam variabel joinDate
         */
        public String getJoinDate(){
            return joinDate;
        }
        
         /**
         * Selanjutnya terdapat method setter bernama setId untuk mengisi nilai variabel province
         * dengan return type void dan parameter bernama id
         */
        public void setId(int id){
            this.id = id; //this digunakan karena nama parameter method sama dengan nama instance variabel class
        }
        
         /**
         * Selanjutnya terdapat method setter bernama setName untuk mengisi nilai variabel name
         * dengan return type void dan parameter bernama name
         */
        public void setName(String name){
            this.name = name; //this digunakan karena nama parameter method sama dengan nama instance variabel class
        }
        
        /**
         * Selanjutnya terdapat method setter bernama setEmail untuk mengisi nilai variabel email
         * dengan return type void dan parameter bernama email
         */
        public void setEmail(String email){
            this.email = email; //this digunakan karena nama parameter method sama dengan nama instance variabel class
        }
        
        /**
         * Selanjutnya terdapat method setter bernama setPassword untuk mengisi nilai variabel password
         * dengan return type void dan parameter bernama password
         */
        public void setPassword(String password){
            this.password = password; //this digunakan karena nama parameter method sama dengan nama instance variabel class
        }
        
        /**
         * Selanjutnya terdapat method setter bernama setJoinDate untuk mengisi nilai variabel joinDate
         * dengan return type void dan parameter bernama joinDate
         */
        public void setJoinDate(String JoinDate){
            this.joinDate = joinDate; //this digunakan karena nama parameter method sama dengan nama instance variabel class
        }
        
        /**
         * Selanjutnya terdapat method bernama printData yang berfungsi untuk mencetak isi data dalam method getName
         * Mempunyai return type void
         */
         public void printData()
         {
             System.out.println(getName());
        }
    }

   
