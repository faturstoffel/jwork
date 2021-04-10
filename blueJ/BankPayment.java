import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * Write a description of class BankPayment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankPayment extends Invoice
{
 
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    public BankPayment(int id,Job job, Jobseeker jobseeker,InvoiceStatus invoiceStatus){
        super(id,job,jobseeker,invoiceStatus);
    }
    
    public BankPayment(int id,Job job,Jobseeker jobseeker,InvoiceStatus invoiceStatus,
    int adminFee){
        super(id,job,jobseeker,invoiceStatus);
        this.setAdminFee(adminFee);
    }
 
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
 
    public int getAdminFee(){
        return adminFee;
    }

    public void setAdminFee(int adminFee){
        this.adminFee = adminFee;
    }

    @Override
    public void setTotalFee(){
        if(adminFee != 0){
        totalFee = getJob().getFee() - adminFee;
        } 
        else {
            totalFee = getJob().getFee();
        }
    }
 
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());

        if (adminFee != 0){
            return ("Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + date + "\nJob Seeker = "
                + getJobseeker().getName() + "\nAdmin Fee = " + adminFee + "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
        }else{
            return ("Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + date + "\nJob Seeker = "
                + getJobseeker().getName()+ "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
        }
    }

 
}
    
    

