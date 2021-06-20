package fatur.jwork.Controller;
import fatur.jwork.*;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;
import jdk.jfr.Category;

/**
 * Class JobController, untuk mengatur job yang ada, dan terhubung dengan jwork android
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

@RequestMapping("/job")
@RestController
public class JobController {

    /**
     * Untuk mendapatkan database job
     * @return job
     */
    @RequestMapping("")
    public ArrayList<Job> getAllJob() {
        ArrayList<Job> job = null;

        job = DatabaseJob.getJobDatabase();
        return job;
    }

    /**
     * Untuk mendapatkan job dengan menggunakan id
     * @param id
     * @return job
     */
    @RequestMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        Job job = null;
        try {
            job = DatabaseJob.getJobById(id);
        } catch (JobNotFoundException e) {
            e.getMessage();
            return null;
        }
        return job;
    }

    /**
     * Untuk mendapatkan job dengan menggunakan recruiter
     * @param recruiterId
     * @return job
     */
    @RequestMapping("/recruiter/{recruiterId}")
    public ArrayList<Job> getJobByRecruiter(@PathVariable int recruiterId) {
        ArrayList<Job> job = null;
        job = DatabaseJob.getJobByRecruiter(recruiterId);

        return job;
    }

    /**
     * Untuk mendapatkan job dengan menggunakan category
     * @param category
     * @return job
     */
    @RequestMapping("/category/{category}")
    public ArrayList<Job> getJobByCategory(@PathVariable JobCategory category) {
        ArrayList<Job> job = null;
        job = DatabaseJob.getJobByCategory(category);
        return job;
    }

    /**
     * Untuk add job
     * @param name
     * @param fee
     * @param category
     * @param recruiterId
     * @return job
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Job addJob(@RequestParam(value = "name") String name,
                      @RequestParam(value = "fee") int fee,
                      @RequestParam(value = "category") String category,
                      @RequestParam(value = "recruiterId") int recruiterId) {
        Job job = null;
        try {
            job = new Job(DatabaseJob.getLastId() + 1, name, DatabaseRecruiter.getRecruiterById(recruiterId), fee, JobCategory.valueOf(category));
        } catch (RecruiterNotFoundException e) {
            e.getMessage();
        }
        boolean status = DatabaseJob.addJob(job);
        if (status == true) {
            return job;
        } else {
            return null;
        }
    }
}
