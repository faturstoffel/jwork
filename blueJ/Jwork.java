
/**
 * Pada class JWork ini bisa digunakan untuk memasukkan input ke object melalui beberapa baris code
 * dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 18/03/21
 */
public class JWork
{
   public static void main(String[] args){
       
        Location location1 = new Location("Jayapura", "Papua", "kota");
        Location location2 = new Location("DKI Jakarta", "Jakarta", "Rumah");
        Recruiter recruiter1 = new Recruiter(1, "fatur", "fatur@gmail.com", "12344", location1);
        Recruiter recruiter2 = new Recruiter(2, "rahman", "rahman@gmail.com", "08212345678", location2);
        Job job1 = new Job(1, "stoffel", recruiter1, 111111, "tech");
        Job job2 = new Job(2, "stoffel", recruiter2, 100303, "tech");
        Jobseeker jobseeker1 = new Jobseeker(1, "fatur", "fatur@coba.com", "12333", "10 Maret 2021");
        Jobseeker jobseeker2 = new Jobseeker(3, "bagus", "bagus@gmail.com", "12976", "12 Maret 2021");
        Invoice invoice1 = new Invoice(1, 2, "November", 2, jobseeker1);
        Invoice invoice2 = new Invoice(233,123, "18 agustus 2022", 300000, jobseeker2);
        
        System.out.println(recruiter2.getName());
        recruiter2.setName("Aslab");
        System.out.println(recruiter2.getName());
        job1.printData();
    }

}
