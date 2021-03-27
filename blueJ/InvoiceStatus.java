
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Fatur Rahman Stoffel
 * @version 27/03/2021
 */
public enum InvoiceStatus
{
    OnGoing("On Going"),
    Finished("Finished"),
    Cancelled("Cancelled");
    
    private final String status;
    private InvoiceStatus(String status){
     this.status = status;   
    }
    
    @Override
    public String toString(){
      return status;   
    }
    
    
        
    
}
