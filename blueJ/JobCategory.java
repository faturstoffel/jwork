
/**
 * Enum JobCategory berisi variabel konstant yang didalamnya terdapat Web developer, Front End, Back End, UI, UX, Devops, Data Scientist, Data Analyst
 * Variabel-variabel ini merupakan final variabel yang tidak bisa untuk diganti 
 * @author Fatur Rahman Stoffel
 * @version 25/03/2021
 */
public enum JobCategory
{
    WebDeveloper ("Web Developer"),
    FrontEnd ("Front End"),
    BackEnd ("Back End"),
    UI ("UI"),
    UX ("UX"),
    Devops ("Devops"),
    DataScientist ("Data Scientist"),
    DataAnalyst ("Data Analyst");
    
    private String category;
    JobCategory(String category){
     this.category = category;   
    }
    
    @Override // Berfungsi untuk memberitahu kompiler, bahwa elemen merupakan sebuah override
    public String toString(){
         return category;   
    }
    
}
    
