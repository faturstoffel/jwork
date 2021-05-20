package fatur.jwork;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * Pada class JWork ini bisa digunakan untuk memasukkan input ke object melalui beberapa baris code
 * dengan access modifier public
 * @author Fatur Rahman Stoffel
 * @version 18/03/21
 */
@SpringBootApplication
public class JWork
{
    public static void main(String[] args) {
        Location location1 = new Location("Jawa Barat", "DKI Jakarta", "test1");
        Location location2 = new Location("Papua", "Jayapura", "test2");
        Location location3 = new Location("Jawa Barat", "Bandung", "test3");

        Recruiter recruiter1 = new Recruiter(1, "Bagus", "bagus@gmail.com", "086199051",location1);
        Recruiter recruiter2 = new Recruiter(2, "Henri", "henri@gmail.com", "082626222", location2);
        Recruiter recruiter3 = new Recruiter(3,"Heru", "heru@gmail.com", "083727262", location3);

        Job job1 = new Job(1, "Mawar", recruiter1, 30000, JobCategory.BackEnd);
        Job job2 = new Job(2, "Melati", recruiter1, 300300, JobCategory.DataAnalyst);
        Job job3 = new Job(3, "Dodi", recruiter2, 45000, JobCategory.Devops);
        Job job4 = new Job(4, "Dudu", recruiter3, 50000, JobCategory.Devops);


        SpringApplication.run(JWork.class, args);
    }

}


       
        



