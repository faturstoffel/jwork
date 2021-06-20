package fatur.jwork.Controller;
import fatur.jwork.*;
import org.springframework.web.bind.annotation.*;
import static fatur.jwork.DatabaseJobseekerPostgre.getJobseekerLogin;

/**
 * Class JobseekerController, untuk mengatur jobseeker dan terhubung ke jwork android
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

@RequestMapping("/jobseeker")
@RestController
public class JobseekerController {

    @RequestMapping("")
    public String indexPage(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "Hello " + name;
    }

    /**
     * Untuk mendaptkan jobseeker dengan menggunakan id
     * @param id
     * @return jobseeker
     */
    @RequestMapping("/{id}")
    public Jobseeker getJobseekerById(@PathVariable int id) {
        Jobseeker jobseeker = null;
        try {
            jobseeker = DatabaseJobseekerPostgre.getJobseekerById(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    /**
     * Untuk melakukan proses register dari jobseeker
     * @param name
     * @param email
     * @param password
     * @return jobseeker
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Jobseeker registerJobseeker(@RequestParam(value = "name") String name,
                                       @RequestParam(value = "email") String email,
                                       @RequestParam(value = "password") String password) {
        Jobseeker jobseeker = new Jobseeker(DatabaseJobseekerPostgre.getLastId() + 1, name, email, password);
        try {
            DatabaseJobseekerPostgre.addJobseeker(jobseeker);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    /**
     * Untuk melakukan login, dengan menggunakan email dan password yang telah terdaftar
     * @param email
     * @param password
     * @return (getJobseekerLogin(email,password))
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value = "email") String email,
                                    @RequestParam(value = "password") String password) {
        return (getJobseekerLogin(email, password));
    }

}
