package fatur.jwork.Controller;
import fatur.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Class BonusController, untuk mengontrol bonus yang terkoneksi dengan jwork android
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

@RequestMapping("/bonus")
@RestController
public class BonusController {
    /**
     * Untuk mendapatkan database bonus
     * @return DatabaseBonus.getBonusDatabase()
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Bonus> getAllBonus() {
        return (DatabaseBonus.getBonusDatabase());
    }

    /**
     * Untuk mendapatkan bonus dari referral code
     * @param referralCode
     * @return DatabaseBonus.getBonusByReferralCode(referralCode)
     */
    @RequestMapping(value = "/{referralCode}")
    public Bonus getBonusByReferralCode(@PathVariable String referralCode){
        return (DatabaseBonus.getBonusByReferralCode(referralCode));
    }

    /**
     * Add bonus
     * @param referralCode
     * @param extraFee
     * @param minTotalFee
     * @param active
     * @throws ReferralCodeAlreadyExistsException
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(
            @RequestParam(value = "referralCode") String referralCode,
            @RequestParam(value = "extraFee") int extraFee,
            @RequestParam(value = "minTotalFee") int minTotalFee,
            @RequestParam(value = "active") boolean active

    ) throws ReferralCodeAlreadyExistsException {
        Bonus bonus = new Bonus(DatabaseBonus.getLastId() + 1, referralCode, extraFee, minTotalFee, active);
        try {
            DatabaseBonus.addBonus(bonus);
        } catch (ReferralCodeAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
        return bonus;
    }
}
