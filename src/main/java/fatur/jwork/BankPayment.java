package fatur.jwork;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * Class BankPayment ini berfungsi untuk memproses tipe pembayaran melalui bank, dimana terdapat 2 konstruktor
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */
public class BankPayment extends Invoice
{


    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * Konstruktor pertama jika tidak terdapat admin fee
     * @param id
     * @param jobs
     * @param jobseeker
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker){

        super(id, jobs, jobseeker);
    }


    /**
     * Konstruktor kedua terdapat tambahan admin fee
     * @param id
     * @param jobs
     * @param jobseeker
     * @param adminFee
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee){

        super(id, jobs, jobseeker);

        this.adminFee = adminFee;
    }


    /**
     * Untuk mendapatkan payment type
     * @return PAYMENT_TYPE
     */
    @Override
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }


    /**
     * Untuk mendapatkan admin fee
     * @return adminFee
     */
    public int getAdminFee(){
        return adminFee;
    }


    /**
     * Untuk set nilai admin fee
     * @param adminFee
     */
    public void setAdminFee(int adminFee){
        this.adminFee=adminFee;
    }


    /**
     * Untuk set total fee yang ada
     */
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


    /**
     * Method toString
     */
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
    
    

