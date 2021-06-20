package fatur.jwork;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * Class EwalletPayment, untuk memproses pembayaran dengan menggunakan E-wallet
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */
public class EwalletPayment extends Invoice
{
    private Bonus bonus;
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;

    /**
     * Konstruktor dari class EwalletPayment, tanpa menggunakan bonus
     * @param id
     * @param jobs
     * @param jobseeker
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {

        super(id, jobs, jobseeker);
    }

    /**
     * Konstruktor dari class EwalletPayment, dengan tambahan bonus
     * @param id
     * @param jobs
     * @param jobseeker
     * @param bonus
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus) {
        super(id, jobs, jobseeker);
        this.setBonus(bonus);
    }

    /**
     * Untuk mendaptkan tipe pembayaran
     * @return PAYMENT_TYPE
     */
    @Override
    public PaymentType getPaymentType() {

        return PAYMENT_TYPE;
    }

    /**
     * Untuk mendapatkan bonus
     * @return bonus
     */
    public Bonus getBonus() {
        return bonus;
    }

    /**
     * Set bonus
     * @param bonus
     */
    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    /**
     * Untuk set total fee yang ada
     */
    @Override
    public void setTotalFee() {
        ArrayList<Job> jobs = getJobs();
        for(Job job: jobs){
            int fee = job.getFee();
            if (bonus != null && (bonus.getActive() == true) && fee > bonus.getMinTotalFee()) {
                super.totalFee = fee + bonus.getExtraFee();
            } else {
                super.totalFee = fee;
            }
        }
    }

    /**
     * to String
     */
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        String res = "";
        for (Job job : getJobs()) {
            if ((bonus != null) && (bonus.getActive() == true) && (job.getFee() > bonus.getMinTotalFee())) {
                res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + "\nReferral Code = " + bonus.getReferralCode() + "\nTotal Fee = "
                        + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            } else {
                res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + bonus.getReferralCode() + "\nTotal Fee = "
                        + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            }

        }
        return res;
    }
    
} 