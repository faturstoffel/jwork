import java.util.GregorianCalendar;
import java.util.ArrayList;

/**
 * Pada class JWork ini bisa digunakan untuk memasukkan input ke object melalui beberapa baris code
 * dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 18/03/21
 */
public class JWork
{
   public JWork(){
    }

    public static void main(String[] args)
    {
        ArrayList<Job> jobs = new ArrayList<Job>();
        ArrayList<Job> jobs1 = new ArrayList<Job>();

        try {
            jobs.add(new Job(1, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1), 1000, JobCategory.BackEnd));
        }
        catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
        try {
            jobs1.add(new Job(2, "Frontend Engineer", DatabaseRecruiter.getRecruiterById(1), 1000, JobCategory.FrontEnd));
        }
        catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(1, jobs, DatabaseJobseeker.getJobseekerById(1)));
        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(2, jobs1, DatabaseJobseeker.getJobseekerById(2)));
        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n ========== Invoice ==========");
        System.out.println(DatabaseInvoice.getInvoiceDatabase());

        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
            new Thread(new FeeCalculator(invoice)).start();
        }
    }
}


       
        



