
/**
 * Write a description of class Job here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Job
{
    
    private int id;
    private String name;
    private int fee;
    private String category;
    private Recruiter recruiter;

    /**
     * Constructor for objects of class Job
     */
    public Job(int id, String name, Recruiter recruiter, int fee, String category)
    {
      this.id = id;
      this.name = name;
      this.recruiter = recruiter;
      this.fee = fee;
      this.category = category;
    }

    
    public int getId()
    {
        return this.id;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getFee()
    {
        return this.fee;
    }
    
    public String getCategory()
    {
        return this.category;
    }
    
    public Recruiter getRecruiter ()
    {
        return this.recruiter;
    }
    
    public void setId(int id)
    {
       this.id = id;
    }
    
    public void setName(String name)
    {
       this.name = name;
    }
    
    public void setRecruiter(Recruiter recruiter)
    {
         this.recruiter = recruiter;
    }
    public void setFee(int fee)
    {
       this.fee = fee;
    }
    
    public void setCategory(String category)
    {
        this.category = category;
    }
    
    public void printData()
    {
        
    }
}
