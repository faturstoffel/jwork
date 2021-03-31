
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
    InvoiceStatus(String status){
     this.status = status;   
    }
    
    @Override // Berfungsi untuk memberitahu kompiler, bahwa elemen merupakan sebuah override
    public String toString(){
      return status;   
    }
    
    
        
    
}
