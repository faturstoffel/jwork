package fatur.jwork;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * Pada class JWork ini bisa digunakan untuk memasukkan input ke object melalui beberapa baris code
 * dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 18-03-21
 */
@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
       Location location1 = new Location("Papua", "Jayapura", "Service Centre");
        Location location2 = new Location("Jawa Barat", "Jakarta", "Main Office");
        Location location3 = new Location("NTT", "Kupang", "Main Office");
      DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Fatur", "fatur@gmail.com", "0821256522", location1));
     DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Stoffel", "stoffel@gmail.com", "0821452626", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Dimas", "dimas@gmail.com", "0852415345", location3));
        try {
            DatabaseJob.addJob(new Job(1, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1), 5000000, JobCategory.BackEnd));
           DatabaseJob.addJob(new Job(2, "Backend Engineer", DatabaseRecruiter.getRecruiterById(2), 1000000, JobCategory.FrontEnd));
           DatabaseJob.addJob(new Job(3, "Frontend Engineer", DatabaseRecruiter.getRecruiterById(1), 8000000, JobCategory.FrontEnd));
            DatabaseJob.addJob(new Job(4, "UI/UX Engineer", DatabaseRecruiter.getRecruiterById(1), 15000000, JobCategory.UI));
            DatabaseBonus.addBonus(new Bonus(1, "AKUMAUBONUS", 10000, 1000, true));
        }
        catch(RecruiterNotFoundException | ReferralCodeAlreadyExistsException e){
            e.printStackTrace();
        }
        //Tes PostgreSQL
      //  DatabaseJobseekerPostgre.addJobseeker(new Jobseeker(DatabaseJobseekerPostgre.getLastId() + 1, "fatur", "fatur@gmail.com",
               // "Wayoo16", 2021, 3, 6));
        SpringApplication.run(JWork.class, args);
    }

}


