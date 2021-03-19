
/**
 * Pada class JWork ini bisa digunakan untuk memasukkan input ke object melalui beberapa baris code
 * dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 18/03/21
 */
public class JWork
{
   public void main(String[] args){
       
        Location location1 = new Location("Jakarta", "Jakarta", "kota");
        Recruiter recruiter1 = new Recruiter(1, "fatur", "fatur@gmail.com", "12344", location1);
        Job job1 = new Job(1, "stoffel", recruiter1, 111111, "tech");
        Jobseeker jobseeker1 = new Jobseeker(1, "fatur", "fatur@coba.com", "12333", "april Maret 2021");
        Invoice invoice1 = new Invoice(1, 2, "November", 2, jobseeker1);
    }

}
