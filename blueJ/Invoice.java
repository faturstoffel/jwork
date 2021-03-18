
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker)
    {
    this.id = id;
    this.idJob = idJob;
    this.date = date;
    this.totalFee = totalFee;
    this.jobseeker = jobseeker;
    }

    
    public int getId()
    {
        return this.id;
    }
    
    public int getIdJob()
    {
        return this.idJob;
    }
    
    public String getDate()
    {
        return this.date = date;
    }
    
    public int getTotalFee()
    {
        return this.totalFee = totalFee;
    }
    
    public Jobseeker getJobseeker()
    {
        return this.jobseeker;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setIdJobs(int idJob)
    {
        this.idJob = idJob;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public void setJobseeker(Jobseeker jobseeker)
    {
         this.jobseeker = jobseeker;   
    }
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }
    
    public void prinData()
    {
        
    }
}

