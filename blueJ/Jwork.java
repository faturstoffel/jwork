
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
        Location location2 = new Location ("Papua", "Jayapura", "Rumah");
        Recruiter recruiter1 = new Recruiter(1, "Fatur", "fatur@gmail.com", "1234", location1);
        Recruiter recruiter2 = new Recruiter(123, "stoffel", "stoffel@gmail.com", "0821233455", location2);
        Jobseeker jobseeker1 = new Jobseeker(1, "rahman", "rahman@gmail.com", "123", "December 2022");
        Jobseeker jobseeker2 = new Jobseeker(567, "bagus", "bagus@gmail.com", "hdhayw3", "13 februrari 2021");
        
    
        
        
        
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
        
        Job job1 = new Job (1, "junior dev", recruiter2, 1000, category7);
        
        
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
        
        Invoice invoice2 = new Invoice(job1.getId(), 300, "19 januari 2021", job1.getFee(), jobseeker2, type2, status2);
        
        System.out.println("\n");
        job1.printData();
        
        
        System.out.println("\n");
        invoice2.printData();
    
        
    }

}
