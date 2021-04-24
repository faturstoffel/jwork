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
    {Location location1 = new Location("Papua", "Jayapura", "Rumah");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Fatur", "fatur.rahman@gmail.com", "8937636363", location1));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "jaka", "jaka@ui.ac.id", "jakajaka34", 2020, 05, 21));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "bagus", "bagus@ui.ac.id", "bagausbagas33", 2020, 05, 21));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "agus", "agusui.ac.id", "agusnaru36", 2021, 03, 12));
        Bonus bonus1 = new Bonus(1, "BONUS69420", 15000, 1, true);
        Bonus bonus2 = new Bonus(2, "myBonus2", 100000, 10000111, true);
        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
        DatabaseJob.addJob(new Job(1, "Backend Engineer Lazada", DatabaseRecruiter.getRecruiterById(1), 10500, JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(1, "Data Analyst Tokopedia", DatabaseRecruiter.getRecruiterById(1), 26000, JobCategory.DataAnalyst));
        DatabaseJob.addJob(new Job(1, "Data Scientist Shopee", DatabaseRecruiter.getRecruiterById(1), 17000, JobCategory.DataScientist));

        System.out.println("\n=====================Job Database By Category====================\n");
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.DataAnalyst));
       
        
    }

}
