
/**
 * Write a description of class BankPayment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankPayment extends Invoice
{
 // instance variables
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * Constructor for objects of class BankPayment
     */
    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        //Keyword Super dibawah digunakan untuk memanggil variable yang ada pada Superclassnya.
        super(id, job, jobseeker, invoiceStatus);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus, int adminFee){
       
        super(id, job, jobseeker, invoiceStatus);
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
    public void setTotalFee(){
        if(adminFee!=0){
            super.totalFee = getJob().getFee() - getAdminFee();
        }
        
        else{
            super.totalFee = getJob().getFee();
        }
    }
    
    @Override
    public String toString(){
      return "ID= "+Invoice.getInvoice().getId()+"\nJob= "+job+"\nJobseeker= "+jobseeker+"\nAdmin Fee="+AdminFee+"\nTotal Fee="+TotalFee+"\nStatus="+Status;   
    }
 
}
    
    

