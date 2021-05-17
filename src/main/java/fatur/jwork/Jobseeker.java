package fatur.jwork;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
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
    private Calendar joinDate;
   


    /** 
     * Disini konstruktor Jobseeker bersifat default
     * dengan parameter
     * @param id untuk input variabel id
     * @param name untuk input variabel name
     * @param email untuk input variabel email
     * @param password untuk input variabel password
     * @param joinDate untuk input variabel joinDate
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
        /**
         * untuk keyword "this", digunakan untuk mereferensikan variabel yang ada dalam class
         * Sehingga sistem bisa memahami dan tidak kebingungan untuk menetapkan nilai variabel
         */
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }
    
    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth){
     
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    
    }
    
    public Jobseeker(int id, String name, String email, String password){
      this.id = id;
      this.name = name;
       setEmail(email);
        setPassword(password);
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
        public Calendar getJoinDate(){
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
        String regex = "^[a-zA-Z0-9&*_~]+([\\.{1}]?[a-z]+)+@[a-z0-9]+([\\.]{1}[a-z]+)\\S+(?!.*?\\.\\.)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches())
        {
            this.email = email;
        }
        else
        {
                this.email = "";
        }
        }
        
        /**
         * Selanjutnya terdapat method setter bernama setPassword untuk mengisi nilai variabel password
         * dengan return type void dan parameter bernama password
         */
        public void setPassword(String password){
         String regexP = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(regexP);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches())
            this.password = password;
        else
            this.password = "";
        }
        
        /**
         * Selanjutnya terdapat method setter bernama setJoinDate untuk mengisi nilai variabel joinDate
         * dengan return type void dan parameter bernama joinDate
         */
        public void setJoinDate(Calendar JoinDate){
            this.joinDate = joinDate; //this digunakan karena nama parameter method sama dengan nama instance variabel class
        }
        
        public void setJoinDate(int year, int month, int dayOfMonth){
          this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
        }
        
        @Override
        public String toString() {
        if (this.joinDate == null) {
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = " + getPassword();
        } 
        else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = " + getPassword() + "\nJoin Date = " + date;
        }

    }
}

   
