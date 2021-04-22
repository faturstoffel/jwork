import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * Write a description of class BankPayment here.
 *
 * @author Fatur Rahman Stoffel
 * @version (a version number or a date)
 */
public class BankPayment extends Invoice
{


    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;


    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker){

        super(id, jobs, jobseeker);
    }



    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee){

        super(id, jobs, jobseeker);

        this.adminFee = adminFee;
    }



    @Override
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }



    public int getAdminFee(){
        return adminFee;
    }



    public void setAdminFee(int adminFee){
        this.adminFee=adminFee;
    }



    @Override
    public void setTotalFee() {
        for(Job job : getJobs()) {
            if(adminFee != 0) {
                totalFee = job.getFee() - getAdminFee();
            }
            else {
                totalFee = job.getFee();
            }
        }
    }




    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        String res = "";
        for (Job job : getJobs()) {
            if (adminFee != 0) {
                res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + "\nAdmin Fee = " + adminFee + "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            } else {
                res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            }
        }
        return res;
    }
 
}
    
    

