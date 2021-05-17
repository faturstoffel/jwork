package fatur.jwork;
import java.util.ArrayList;
/**
 * Write a description of class DatabaseBonus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseBonus
{
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase()
    {
        return BONUS_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Bonus getBonusById(int id) throws BonusNotFoundException{
        Bonus x = null;
        try{for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                x = bonus;
            }
        }}
        catch (Exception e){
            throw new BonusNotFoundException(id);}
        return x;
    }

    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException
    {
        for (Bonus bns : BONUS_DATABASE)
        {
            if (bonus.getReferralCode() == bns.getReferralCode())
            {
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean removeBonus(int id) throws BonusNotFoundException
    {
        boolean status = false;
        for (Bonus element : BONUS_DATABASE) {
            if (element.getId() == id) {
                BONUS_DATABASE.remove(element);
                status = true;
                break;
            }
        }
        if (!status){
            throw new BonusNotFoundException(id);
        }

        return status;
    }
    
}
