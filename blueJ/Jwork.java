import java.util.GregorianCalendar;

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
    
      public static void main (String [] args) 
    {Location location1 = new Location("Jawa Barat", "Jakarta", "Rumah");
        Recruiter recruiter1 = new Recruiter(1, "FaturStoffel", "fatur@gmail.com", "50000", location1);
        
        Jobseeker jobseeker1 = new Jobseeker(1, "Anton", ".anton@ui.ac.id", "Hey123", new GregorianCalendar(2021, 4, 7));
        Jobseeker jobseeker2 = new Jobseeker(2, "Andi", "andi@ui.ac.id", "BGSf76", 2021, 1, 3);
        Jobseeker jobseeker3 = new Jobseeker(3, "Dana", "dana@ui.ac.id", "danagaming678");
        Job job1 = new Job(1, "IT", recruiter1, 10000, JobCategory.BackEnd);
        Bonus bonus1 = new Bonus(1, "pesangon", 1000000, 1, true);
        Bonus bonus2 = new Bonus(2, "uangsuap", 10000000, 2, true);
        
        EwalletPayment invoice1 = new EwalletPayment(1, job1, jobseeker1, InvoiceStatus.Finished);
        EwalletPayment invoice2 = new EwalletPayment(2, job1, jobseeker2, InvoiceStatus.Finished, bonus1);
        EwalletPayment invoice3 = new EwalletPayment(3, job1,  jobseeker3, InvoiceStatus.Finished, bonus2);
        
        BankPayment invoice4 = new BankPayment(4, job1, jobseeker1, InvoiceStatus.Finished);
        BankPayment invoice5 = new BankPayment(5, job1, jobseeker2, InvoiceStatus.Finished, 5000);
        invoice1.setTotalFee();
        invoice2.setTotalFee();
        invoice3.setTotalFee();
        invoice4.setTotalFee();
        invoice5.setTotalFee();
        
        System.out.println(invoice1.toString());
        System.out.println(invoice2.toString());
        System.out.println(invoice3.toString());
        System.out.println(invoice4.toString());
        System.out.println(invoice5.toString());
       
        
    }

}
