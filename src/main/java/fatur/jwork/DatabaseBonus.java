package fatur.jwork;
import java.util.ArrayList;
/**
 * Class DatabaseBonus, yang berfungsi sebagai database dari bonus yang ada
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

public class DatabaseBonus
{
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    /**
     * get database bonus
     * @return BONUS_DATABASE
     */
    public static ArrayList<Bonus> getBonusDatabase() {
        return BONUS_DATABASE;
    }

    /**
     * get last id
     * @return last id
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * Untuk mendapatkan bonus dengan menggunakan id
     * @param id
     * @return x
     * @throws BonusNotFoundException
     */
    public static Bonus getBonusById(int id) throws BonusNotFoundException {
        Bonus x = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                x = bonus;
                return x;
            }
        }
        if (x == null){
            throw new BonusNotFoundException(id);
        }
        return x;
    }

    /**
     * Untuk mendapatkan bonus dengan menggunakan referral code
     * @param referralCode
     * @return x
     */
    public static Bonus getBonusByReferralCode(String referralCode) {
        Bonus x = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (referralCode.equals(bonus.getReferralCode())) {
                x = bonus;
            }
        }
        return x;
    }

    /**
     * Untuk menambahkan bonus
     * @param bonus
     * @return boolean
     * @throws ReferralCodeAlreadyExistsException
     */
    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException {
        for (Bonus bonus1 : BONUS_DATABASE) {
            if (bonus.getReferralCode() == bonus1.getReferralCode()) {
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    /**
     * Untuk remove bonus
     * @param id
     * @return boolean
     * @throws BonusNotFoundException
     */
    public static boolean removeBonus(int id) throws BonusNotFoundException {
        try {
            for (Bonus bonus : BONUS_DATABASE) {
                if (bonus.getId() == id) {
                    BONUS_DATABASE.remove(bonus);
                    return true;
                }
            }
        } catch (Exception e) {
            throw new BonusNotFoundException(id);
        }
        return false;
    }

    /**
     * Untuk melakukan aktivasi terhadap bonus yang ada
     * @param id
     * @return boolean
     */
    public static boolean activateBonus(int id) {
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                x = true;
            }
        }
        return x;
    }

    /**
     * Untuk menon-aktifkan bonus yang ada
     * @param id
     * @return boolean
     */
    public static boolean deactivateBonus(int id) {
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                x = true;
            }
        }
        return x;
    }
    
}
