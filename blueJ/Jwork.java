
/**
 * Pada class JWork ini bisa digunakan untuk memasukkan input ke object melalui beberapa baris code
 * dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 18/03/21
 */
public class JWork
{
   
      public static void main (String [] args) 
    {
        Location location1 = new Location("Jakarta", "Jakarta", "kota");
        Location location2 = new Location ("DKI Jakarta", "Jakarta", "Rumah");
        Recruiter recruiter1 = new Recruiter(1, "fatur", "fatur@gmail.com", "7282", location1);
        Recruiter recruiter2 = new Recruiter(123, "bagus", "bagus@gmail.com", "0812345678", location2);
        Jobseeker jobseeker1 = new Jobseeker(1, "Rahman", "rahman@gmail.com", "3456", "April 2021");
        Jobseeker jobseeker2 = new Jobseeker(567, "agus", "agus@gmail.com", "ei900", "13 maret 2021");
       
    
        
        
        
        JobCategory category1 = JobCategory.WebDeveloper;
        JobCategory category2 = JobCategory.FrontEnd;
        JobCategory category3 = JobCategory.BackEnd;
        JobCategory category4 = JobCategory.UI;
        JobCategory category5 = JobCategory.UX;
        JobCategory category6 = JobCategory.Devops;
        JobCategory category7 = JobCategory.DataScientist;
        JobCategory category8 = JobCategory.DataAnalyst;
        System.out.println(category1);
        System.out.println(category2);
        System.out.println(category3);
        System.out.println(category4);
        System.out.println(category5);
        System.out.println(category6);
        System.out.println(category7);
        System.out.println(category8);
        
        Job job1 = new Job (1, "junior", recruiter2, 10000, category7);
        Job job2 = new Job (2, "senior", recruiter2, 1000, category6);
        Bonus bonus1 = new Bonus (1, "ABCD", 10000, 1, true);
        Bonus bonus2 = new Bonus (1, "DEFG", 10000, 10000000, true);
        
        
        
        EwalletPayment payment1 = new EwalletPayment(10, job1, "3 December 2021", jobseeker2, InvoiceStatus.OnGoing);
        EwalletPayment payment2 = new EwalletPayment(10, job1, "3 December 2021", jobseeker2, InvoiceStatus.OnGoing, bonus1);
        EwalletPayment payment3 = new EwalletPayment(10, job1, "3 December 2021", jobseeker2, InvoiceStatus.OnGoing, bonus2);
        
        BankPayment bank1 = new BankPayment(20, job2, "4 Januari 2021", jobseeker1, InvoiceStatus.Finished);
        BankPayment bank2 = new BankPayment(20, job2, "4 Januari 2021", jobseeker1, InvoiceStatus.Finished, 500);
        
        PaymentType type1 = PaymentType.BankPayment;
        PaymentType type2 = PaymentType.EwalletPayment;
        System.out.println(type1);
        System.out.println(type2);
        
        InvoiceStatus status1 = InvoiceStatus.OnGoing;
        InvoiceStatus status2 = InvoiceStatus.Finished;
        InvoiceStatus status3 = InvoiceStatus.Cancelled;
        System.out.println(status1);
        System.out.println(status2);
        System.out.println(status3);
        
       
        
        System.out.println("\n");
        job1.printData();
        
        
        System.out.println("\n");
        
                
        System.out.println("\n");
        payment1.printData();
        System.out.println("\n");
        payment2.printData();
        System.out.println("\n");
        payment3.printData();
        
        System.out.println("\n");
        bank1.printData();
        System.out.println("\n");
        bank2.printData();
        
    }

}
