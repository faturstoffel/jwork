
/**
 * Write a description of class Jobseeker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /**
     * Constructor for objects of class Jobseeker
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }
        public int getId() {
            return this.id;
        }
        
        public String getName(){
            return this.name;
        }
        
        public String getEmail(){
            return this.email;
        }
        
        public String getPassword(){
            return this.password;
        }
        
        public String getJoinDate(){
            return this.joinDate;
        }
        
        public void setId(int id){
            this.id = id;
        }
        
        public void setName(String name){
            this.name = name;
        }
        
        public void setEmail(String email){
            this.email = email;
        }
        
        public void setPassword(String password){
            this.password = password;
        }
        
        public void setJoinDate(String JoinDate){
            this.joinDate = joinDate;
        }
        
         public void printData()
         {
             
        }
    }

   
