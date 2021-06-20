package fatur.jwork;
/**
 * Class Bonus, untuk memproses bonus
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */
public class Bonus
{

    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;

    /**
     * Konstruktor dari class bonus
     * @param id
     * @param referralCode
     * @param extraFee
     * @param minTotalFee
     * @param active
     */
    public Bonus(int id,String referralCode,int extraFee,int minTotalFee,boolean active)
    {
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
    }

    /**
     * Get id
     * @return id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Get referral code
     * @return referral code
     */
    public String getReferralCode()
    {
        return referralCode;
    }

    /**
     * Get extra fee
     * @return extraFee
     */
    public int getExtraFee()
    {
        return extraFee;
    }

    /**
     * Get minimal total fee
     * @return minTotalFee
     */
    public int getMinTotalFee()
    {
        return minTotalFee;
    }

    /**
     * get active bonus
     * @return active
     */
    public boolean getActive()
    {
        return active;
    }

    /**
     * set id
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * set referral code
     * @param referralCode
     */
    public void setReferralCode(String referralCode)
    {
        this.referralCode = referralCode;
    }

    /**
     * set extra fee
     * @param extraFee
     */
    public void setExtraFee(int extraFee)
    {
        this.extraFee = extraFee;
    }

    /**
     * set minimal total fee
     * @param minTotalFee
     */
    public void setMinTotalFee(int minTotalFee)
    {
        this.minTotalFee = minTotalFee;
    }

    /**
     * set active
     * @param active
     */
    public void setActive (boolean active)
    {
        this.active = active;
    }

    /**
     * method to string
     */
    public String toString(){
              return "ID= "+id+"\nReferral Code= "+referralCode+"\nExtra Fee= "+extraFee+"\nMin Total Fee= "+minTotalFee+"\nActivate Status= "+active+"\n";
    }
}

