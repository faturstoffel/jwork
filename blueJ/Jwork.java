
/**
 * Pada class JWork ini bisa digunakan untuk memasukkan input ke object melalui beberapa baris code
 * dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 18/03/21
 */
public class JWork
{
   public static void main(String[] args){
     InvoiceStatus status1 = InvoiceStatus.OnGoing;
     InvoiceStatus status2 = InvoiceStatus.Finished;
     InvoiceStatus status3 = InvoiceStatus.Cancelled;
        Location location1 = new Location("Jayapura", "Papua", "kota");
        Location location2 = new Location("DKI Jakarta", "Jakarta", "Rumah");
        Recruiter recruiter1 = new Recruiter(1, "fatur", "fatur@gmail.com", "12344", location1);
        Recruiter recruiter2 = new Recruiter(2, "rahman", "rahman@gmail.com", "08212345678", location2);
        Jobseeker jobseeker1 = new Jobseeker(1, "fatur", "fatur@coba.com", "12333", "10 Maret 2021");
        Jobseeker jobseeker2 = new Jobseeker(3, "bagus", "bagus@gmail.com", "12976", "12 Maret 2021");
        Invoice invoice1 = new Invoice(1, 1, "20 Maret 2021", 4000000, jobseeker1,status1);
        
        
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
        System.out.println(recruiter2.getName());
        recruiter2.setName("Aslab");
        System.out.println(recruiter2.getName());
        Job job1 = new Job (1, "Bagus Bagas", recruiter2, 1000, category7);
        PaymentType type1 = PaymentType.BankPayment;
        PaymentType type2 = PaymentType.EwalletPayment;
        System.out.println(type1);
        System.out.println(type2);
        System.out.println("\n");
        job1.printData();
        invoice1.printData();
     System.out.println(status1);
     System.out.println(status2);
     System.out.println(status3);
        
    }

}
