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

    public static void main(String[] args) //menggunakan define object dari location,recruiter,jon,jobseeker,dan invoice agar bisa berjalan
    {
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Fatur Stoffel",
                    "fatur@ui.ac.id", "hacker23", 2022, 05, 06));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Fatur Rahman",
                    "dimas@ui.ac.id", "dimas23", 2022, 03, 06));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "haru",
                    "kemal@ui.ac.id", "kemalgaming", 2023, 05, 04));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "emas",
                    "farrel@ui.ac.id", "farrel69", 2022, 03, 06));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseBonus.addBonus(new Bonus(101, "BreathItIn", 200000, 500000, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(101, "BreathItIn", 200000, 500000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=========Database JobSeeker============");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());

        System.out.println("=========Database Bonus===============");
        System.out.println(DatabaseBonus.getBonusDatabase());
        try {
            DatabaseJobseeker.removeJobseeker(24);
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseRecruiter.removeRecruiter(23);
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJob.getJobById(20);
        } catch (JobNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.getBonusById(21);
        } catch (BonusNotFoundException bonusNotFound) {
            System.out.println(bonusNotFound.getMessage());
        }
    }


       
        
    }


