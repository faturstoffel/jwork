package fatur.jwork;
/**
 * Enum Invoice status berisi variabel konstant, yang didalamnya terdapat On going, Finished, dan Cancelled
 * Variabel-variabel ini merupakan final variabel yang tidak bisa untuk diganti 
 * @author Fatur Rahman Stoffel
 * @version 27/03/2021
 */
public enum InvoiceStatus
{
    OnGoing("On Going"),
    Finished("Finished"),
    Cancelled("Cancelled");

    private String status;

    /**
     * Konstruktor untuk class InvoiceStatus
     * @param status
     */
    InvoiceStatus(String status){
     this.status = status;   
    }

    /**
     * To String
     * @return
     */
    public String toString(){
      return status;
    }
}
