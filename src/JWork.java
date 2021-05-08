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
        // CS modul 7
        Location location1 = new Location("Depok", "Jawa Barat", "kutek");

        Recruiter recruiter1 = new Recruiter(1, "fatur", "fatur@gmail.com", "08211226", location1);

        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "fatur", "not.rahman@.gmail.com", "Hgy56%$#2", new GregorianCalendar(2022, 3, 16)));
        } catch(EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "fatur", "not.rahman@.gmail.com", "G@mer$", new GregorianCalendar(2022, 2, 16)));
        } catch(EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Titus Zarek", "titus.zarek@.ui.ac.id", "g#dsy%r", new GregorianCalendar(2022, 3, 18)));
        } catch(EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Rahman Fatur", "stoffel@gmail.com", "JHidh^4$#f", new GregorianCalendar(2022, 12, 3)));
        } catch(EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        // add bonus
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "pesangon", 100, 5000, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "uangsuap", 500, 5300, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "cuantambahan", 300, 4000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "kerjarodi", 500, 2000, true));
        } catch(ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }


        // add invoice
        try {
            DatabaseInvoice.addInvoice(new BankPayment(1, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(1)));
            DatabaseInvoice.addInvoice(new BankPayment(2, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(2)));
            DatabaseInvoice.addInvoice(new BankPayment(3, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(2)));
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }

        // get recruiter id
        try {
            Recruiter r1 = DatabaseRecruiter.getRecruiterById(99);
        } catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }
        // get jobseeker
        try {
            Jobseeker js1 = DatabaseJobseeker.getJobseekerById(99);
        } catch(JobSeekerNotFoundException e){
            System.out.println(e.getMessage());
        }
        // get job
        try {
            Job j1 = DatabaseJob.getJobById(99);
        } catch(JobNotFoundException e){
            System.out.println(e.getMessage());
        }
        // get bonus
        try {
            Bonus b1 = DatabaseBonus.getBonusById(99);
        } catch(BonusNotFoundException e){
            System.out.println(e.getMessage());
        }
        // get invoice
        try {
            Invoice i1 = DatabaseInvoice.getInvoiceById(99);
        } catch(InvoiceNotFoundException e){
            System.out.println(e.getMessage());
        }

        //delete invoice
        try {
            DatabaseInvoice.removeInvoice(99);
        } catch (InvoiceNotFoundException e){
            System.out.println(e.getMessage());
        }


        //print
        ArrayList<Jobseeker> jobseeker = DatabaseJobseeker.getDatabaseJobseeker();
        for (Jobseeker js : jobseeker)
            System.out.println(js.toString());

        ArrayList<Bonus> bonus = DatabaseBonus.getBonusDatabase();
        for (Bonus b: bonus)
            System.out.println(b.toString());

        ArrayList<Invoice> invoice = DatabaseInvoice.getInvoiceDatabase();
        for (Invoice i: invoice)
            System.out.println(i.toString());

        // buat threading
        System.out.println("=========Multi Threading=========");
        for (Invoice inv : DatabaseInvoice.getInvoiceDatabase()) {
            new Thread(new FeeCalculator(inv)).start();
        }
    }
}


       
        



