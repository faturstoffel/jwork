package fatur.jwork;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Class ini bertujuan untuk memberikan invoice total gaji dari pekerja
 * dimana akan ada id, id dari pekerjaan, tanggal, total gaji dan juga nama dari pekerja
 * Untuk access modifier bersifat public pada method dan private pada variabel yang ada
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */
public abstract class Invoice
{
    // Deklarasi beberapa instance variables yang akan digunakan.
    // Access Modifier variable di set private.
    private int id;
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    /**
     * Konstruktor dari class invoice
     * @param id
     * @param jobs
     * @param jobseeker
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker){
        this.id = id;
        this.jobs = jobs;
        this.jobseeker = jobseeker;
        this.date = Calendar.getInstance();
    }

    /**
     * Digunakan untuk mendapatkan id
     * @return id
     */
    public int getId(){
        return id;
    }

    /**
     * Get jobs
     * @return job
     */
    public ArrayList<Job> getJobs(){
        return jobs;
    }

    /**
     * Get date
     * @return date
     */
    public Calendar getDate(){
        return date;
    }

    /**
     * Untuk mengambil total fee
     * @return total fee
     */
    public int getTotalFee(){
        return totalFee;
    }

    /**
     * Untuk mengambil jobseeker
     * @return jobseeker
     */
    public Jobseeker getJobseeker(){
        return jobseeker;
    }

    /**
     *
     * @return
     */
    public abstract PaymentType getPaymentType();

    /**
     * Untuk mendapatkan status dari invoice
     * @return invoiceStatus
     */
    public InvoiceStatus getInvoiceStatus(){
        return invoiceStatus;
    }

    /**
     * Untuk set id
     * @param id
     */
    public void setId(int id){
        this.id = id;  //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }

    /**
     * Untuk set job
     * @param jobs
     */
    public void setJobs(ArrayList<Job> jobs){
        this.jobs = jobs; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }

    /**
     * Untuk set date
     * @param date
     */
    public void setDate(Calendar date){
        this.date = date; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }

    /**
     * Juga digunakan untuk set date, namun dengan parameyer year, month, dan day of month
     * @param year
     * @param month
     * @param dayOfMonth
     */
    public void setDate(int year, int month, int dayOfMonth){
         this.date = new GregorianCalendar(year, month -1, dayOfMonth);   
    }

    /**
     * Set total fee
     */
    public abstract void setTotalFee();

    /**
     * Set Jobseeker
     * @param jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }

    /**
     * Set invoice status
     * @param invoiceStatus
     */
    public void setInvoiceStatus (InvoiceStatus invoiceStatus){
        this.invoiceStatus = invoiceStatus; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }

    /**
     * To String
     * @return
     */
    public abstract String toString();
}

