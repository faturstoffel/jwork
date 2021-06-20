package fatur.jwork.Controller;
import fatur.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Class RecuiterController, untuk mengatur recruiter dan terhubung dengan jwork android
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

@RequestMapping("/recruiter")
@RestController
public class RecruiterController {

    /**
     * Untuk terhubung ke database recuiter
     * @return DatabaseRecruiter.getRecruiterDatabase()
     */
    @RequestMapping("")
    public ArrayList<Recruiter> getAllRecruiter() {
        return DatabaseRecruiter.getRecruiterDatabase();
    }

    /**
     * Untuk mendapatkan recruiter dengan menggunakan id
     * @param id
     * @return recruiter
     */
    @RequestMapping("/{id}")
    public Recruiter getRecruiterById(@PathVariable int id) {
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(id);
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
        return recruiter;
    }

    /**
     * Untuk melakukan add recruiter
     * @param name
     * @param email
     * @param phoneNumber
     * @param province
     * @param description
     * @param city
     * @return recruiter
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value = "name") String name,
                                  @RequestParam(value = "email") String email,
                                  @RequestParam(value = "phoneNumber") String phoneNumber,
                                  @RequestParam(value = "province") String province,
                                  @RequestParam(value = "description") String description,
                                  @RequestParam(value = "city") String city) {
        Recruiter recruiter = new Recruiter(DatabaseRecruiter.getLastId() + 1, name, email, phoneNumber, new Location(province, city, description));
        try {
            DatabaseRecruiter.addRecruiter(recruiter);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return recruiter;
    }
}
